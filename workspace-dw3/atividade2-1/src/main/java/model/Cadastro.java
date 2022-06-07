package model;

import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

public class Cadastro {
    private String nome;
    private String idioma;
    private String[] habilidades;
    private LocalDate dataDeNascimento;

    // DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // get and setters with validation
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.equals("") || nome.startsWith(" ") || nome.matches("[0-9]")) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        if (nome == null || nome.equals("") || nome.startsWith(" ") || nome.matches("[0-9]")) {
            throw new IllegalArgumentException("Idioma inválido");
        }

        this.idioma = idioma;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        if (habilidades == null || habilidades.length == 0) {
            throw new IllegalArgumentException("Habilidades inválidas");
        }

        this.habilidades = habilidades;
    }

    public LocalDate getDataNascimento() {
        return dataDeNascimento;
    }

    public void setDataNascimento(String dataDeNascimentoStr) {
        LocalDate data = null;

        try {
            data = this.dateStringToLocalDate(dataDeNascimentoStr);
        } catch (Exception e) {
            throw new IllegalArgumentException("Data inválida");
        }

        if (data == null ||
                data.isAfter(LocalDate.now()) ||
                data.equals(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }

        this.dataDeNascimento = data;
    }

    public LocalDate dateStringToLocalDate(String dataStr) {
        LocalDate data = LocalDate.parse(dataStr);
        return data;
    }

    // toString
    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", idioma='" + idioma + '\'' +
                ", habilidades=" + habilidades +
                ", dataNascimento=" + dataDeNascimento +
                '}';
    }
}
