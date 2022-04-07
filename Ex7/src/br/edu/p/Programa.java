package br.edu.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\Documents\\Ex7\\src\\alunos.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine(); // Descartar a primeira linha.
		
		Aluno[] alunos = new Aluno[3];
		
		int contador = 0;
		int aprovado = 0;
		int reprovado = 0;
		double maior = 0;
		double menor = 11; 
		
		while(leitor.hasNext()) {
			
			
			String linha = leitor.nextLine();
			String[] dadosLinha = linha.split(";");
			String matricula = dadosLinha[0];
			String nome = dadosLinha[1];
			// Double.parseDouble faz a conversão texto > número
			double nota = Double.parseDouble(dadosLinha[2]);
			
			Aluno novoAluno = new Aluno();
			novoAluno.matricula = matricula;
			novoAluno.nome = nome;
			novoAluno.nota = nota;

			alunos[contador] = novoAluno;
			contador++;
			
			if(novoAluno.nota > 6.0) {
				 aprovado++;
			} else
				reprovado++;
			
			if(maior < novoAluno.nota) {
				maior = novoAluno.nota;
			}
			
			if(menor > novoAluno.nota) {
				menor = novoAluno.nota;
			}
			
			
//			System.out.println(linha);
		}
		

			
	
			System.out.println("Qtde de alunos: " + contador);
			System.out.println("Alunos Aprovados: " + aprovado);
			System.out.println("Alunos Reprovados: " + reprovado);
			System.out.println("Maior nota da turma: " + maior);
			System.out.println("Menor nota da turma: " + menor);
			System.out.println();
			
			
			for (int i = 0; i < alunos.length; i++) {
				Aluno a = alunos[i];
				System.out.println("Matricula: " + a.matricula);
				System.out.println("Nome: " + a.nome);
				System.out.println("Nota: " + a.nota);
				
				System.out.println();
			}
		leitor.close();
	}

}
