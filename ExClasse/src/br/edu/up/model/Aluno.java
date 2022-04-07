package br.edu.up.model;

public class Aluno {
	
	// Atributos
	public String nome;
	public String matricula;
	public double nota1;
	public double nota2;
	public double nota3;
	
	//Métodos
	public double getNotaFinal(){
		return (nota1 + nota2 + nota3)/3;
	}
}
