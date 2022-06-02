package br.edu.up.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericRepository<T> {	
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	final String className;
	final Class<T> entityClass;

    public GenericRepository(String  className, Class<T> entityClass) {
    	this.className = className;
        this.entityClass = entityClass;
    }
	
	public static void iniciarEm() {
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();
	}
	
	public void salvar(T entity) {
		iniciarEm();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}
	
	public List<T> listar() {
		iniciarEm();
		List<T> list = 
				em.createQuery("from " + className, entityClass)
				.getResultList();
		return list;
		
	}
	
	public T localizar(Integer id) {
		iniciarEm();
		T entity = em.find(entityClass, id);
		return entity;
	}
	

	public void atualizar(T entity) {
		iniciarEm();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
	}

	public void apagar(Integer id) {
		iniciarEm();
		T entity = em.find(entityClass, id);
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}

}
