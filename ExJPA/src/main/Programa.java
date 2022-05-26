package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Pessoa;

public class Programa {
	
		public static void main(String[] args) {
			
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro");
	EntityManager em = emf.createEntityManager();
	
	Pessoa p1 = new Pessoa();
	p1.setName("João");
	p1.setCpf("1234567890");
	p1.setPeso(80);
	
	
	em.persist(p1);
	
	System.out.println("Opa, deu tudo certo");
	
	
	
		}
	
}
