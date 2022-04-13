package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		Aluno[] alunos = new Aluno[70];
		
		File arquivo = new File("D:\\Faculdade\\Desenvolvimento de software\\_software_git\\Fixações\\Fixação7\\src\\alunos");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		int cont = 0;
		int aprovados = 0;
		int reprovados = 0;
		double soma = 0;
		double maior = 0;
		double menor = 11;
	
		while(leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] dadosLinha = linha.split(";");
			
			Aluno novoAluno = new Aluno();
			
			novoAluno.matricula = dadosLinha[0];
			novoAluno.nome = dadosLinha[1];
			novoAluno.nota = Double.parseDouble(dadosLinha[2]);
			
			alunos[cont] = novoAluno;
			cont++;
			
		}
		
		leitor.close();
		System.out.println("Quantidade de alunos: " + cont);
		
		for (int i = 0; i < alunos.length; i++) {
			
			Aluno a = alunos[i];
			
			if(a.nota >= 6) {
				aprovados++;
			} else {
				reprovados++;
			}
			
			if(a.nota > maior) {
				maior = a.nota;
			}
			
			if(a.nota < menor) {
				menor = a.nota;
			}
			
			soma = soma + a.nota;
			
		}
		
		System.out.println("Alunos Aprovados: " + aprovados);
		System.out.println("Alunos Reprovados: " + reprovados);
		System.out.println("Maior nota:  " + maior);
		System.out.println("Menor nota: " + menor);
		System.out.printf("Média geral: %.1f ", soma/cont);
		
		
	}

}
