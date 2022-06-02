package br.edu.up.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.up.model.Pessoa;

public class PessoaController {

	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	public static void iniciarEm() {
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();
	}
	
	public static List<Pessoa> listarPessoas() {
		iniciarEm();
		List<Pessoa> pessoas = 
				em.createQuery("from Pessoa", Pessoa.class)
				.getResultList();
		return pessoas;
	}
	

	public static Integer salvar(Pessoa pessoa) {
		iniciarEm();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		return pessoa.getId();
	}

	public static Pessoa localizar(Integer id) {
		iniciarEm();
		Pessoa pessoa = em.find(Pessoa.class, id);
		return pessoa;
	}
	

	public static void atualizar(Pessoa pessoa) {
		iniciarEm();
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
	}

	public static void apagar(Integer id) {
		iniciarEm();
		Pessoa pessoa = em.find(Pessoa.class, id);
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
	}
}
