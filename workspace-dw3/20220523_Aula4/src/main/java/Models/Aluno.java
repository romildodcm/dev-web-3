package Models;

public class Aluno {
    private String nome;
    private String RA;
    private Curso curso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        // if leng 0, 
        this.nome = nome;
    }
    public String getRA() {
        return RA;
    }
    public void setRA(String rA) {
        RA = rA;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }


}
