package main;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Homem;
import model.Ser;

public class Programa {

	public static void main(String[] args) {
		
//		List listaDeAlgumaCoisa = new ArrayList();
		List<Object> listaDeObjetos = new ArrayList();
		List<Ser> listaDeSeres = new ArrayList();
		List<Animal> listaDeAnimais = new ArrayList();
		List<Cachorro> listaDeCachorros = new ArrayList();
		
		
		Animal objetoAnimal = new Animal();
		objetoAnimal.nome = "Tehx";
		objetoAnimal.genero = "Macho";
		objetoAnimal.porte = "Pequeno";
		try {
			objetoAnimal.setIdade(1);
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		
		listaDeAnimais.add(objetoAnimal);
		
		Cachorro objetoCachorro1 = new Cachorro();
		objetoCachorro1.nome = "Amora";
		objetoCachorro1.genero = "Fêmea";
		objetoCachorro1.porte = "Pequeno";
		try {
			objetoCachorro1.setIdade(1);
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		
		listaDeCachorros.add(objetoCachorro1);
		listaDeAnimais.add(objetoCachorro1);
		
		Cachorro objetoCachorro2 = new Cachorro();
		objetoCachorro2.nome = "Jonny";
		objetoCachorro2.genero = "Macho";
		objetoCachorro2.porte = "Pequeno";
		try {
			objetoCachorro2.setIdade(8);
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		
		listaDeCachorros.add(objetoCachorro2);
		
		Cachorro objetoCachorro3 = new Cachorro();
		objetoCachorro3.nome = "Zeus";
		objetoCachorro3.genero = "Macho";
		objetoCachorro3.porte = "Grande";
		try {
			objetoCachorro3.setIdade(1);
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		
		listaDeCachorros.add(objetoCachorro3);
		
		Homem objetoHomem = new Homem();
		objetoHomem.nome = "Robson";
		objetoHomem.genero = "Macho";
		objetoHomem.porte = "Médio";
		try {
			objetoHomem.setIdade(25);
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		
		listaDeAnimais.add(objetoHomem);
		
		for(Animal animal : listaDeAnimais) {
			System.out.println("Nome: " + animal.nome);
			System.out.println("Gênero: " + animal.genero);
			System.out.println("Porte: " + animal.porte);
			System.out.println("Idade: " +animal.getIdade());
			System.out.println();
		}
		
		
	}

}
