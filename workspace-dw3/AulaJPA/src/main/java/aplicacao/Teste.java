package aplicacao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Jeferson", "jef@gmail.com");
		Pessoa p2 = new Pessoa(null, "Jorge", "luc@gmail.com");
		Pessoa p3 = new Pessoa(null, "Maria", "maria@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_jpa");
		EntityManager entityManager = factory.createEntityManager();
		
		
		// uma transação
		entityManager.getTransaction().begin();
		
		// persistir 
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		
		// find
		// find ou persist retorna um objeto monitorado
		// se eu alterar ele aqui, ele será alterado no banco
		// Pessoa p4 = entityManager.find(Pessoa.class, 2);
		// System.out.println(p4);
		
		// p4.setNome("Jorge");
		// alterou o nome também no banco de dados
		
		// delete
		// entityManager.remove(p4);
		
		// Consulta SQL: "SELECT * FROM pessoas
		// JPQL: "Select p Pessoas From Pessoas
		// para só o nome: "Select p.Nome Pessoas From Pessoas
		// abreviando: From Pessoas
		List<Pessoa> pessoas = entityManager.createQuery("from Pessoa").getResultList();
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		// pegando só um parametro
		Pessoa jorge = entityManager.createQuery("SELECT p FROM Pessoa p WHERE  p.nome = :nome", Pessoa.class)
				.setParameter("nome", "Jorge").getSingleResult();
		
		// tipo opcional para pessoa, null
		Optional<Pessoa> pessoaOptional = null;
		
		
		// caso jorge seja diferente de null, recebe o jorge, se não, recebe vazio
		// evita problema com consultas vazias
		pessoaOptional = jorge != null ? Optional.of(jorge) : Optional.empty();
		
		if(pessoaOptional.isPresent()) {
			System.out.println(pessoaOptional.get());
		} else {
			System.out.println("Erro, não tem pessoa com esse nome");
		}
		
		// System.out.print(jorge);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
		

	}

}
