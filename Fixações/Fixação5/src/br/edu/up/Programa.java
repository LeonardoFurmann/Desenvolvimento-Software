package br.edu.up;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File("D:\\Faculdade\\Desenvolvimento de software\\Fixação5\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		
		Grupo[] grupos = new Grupo[72];
		int cont = 0;
		int soma = 0;
		int somaA = 0;
		int somaB = 0;
		int somaC = 0;
		int somaD = 0;
		int somaF = 0;
		
		while (leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			
			
			// separa as linhas
			String[] dadosLinha= linha.split("\t");
			
			
			// converte string para char
			char letra = dadosLinha[0].charAt(0);				
			
			// converte string para int
			int valor = Integer.parseInt(dadosLinha[1]);
			
			
			Grupo novoGrupo = new Grupo();
			novoGrupo.letra = letra;
			novoGrupo.valor = valor;
			
			grupos[cont] = novoGrupo;
			cont++;
				
		}	
			
		
		for (int i = 0; i < 72; i++) {
			Grupo g = grupos[i];
			
			
			soma = soma + grupos[i].valor;
					
					
			if(g.letra == 'A') {
				somaA = somaA + grupos[i].valor;
				
			}
			
			if(g.letra == 'B') {
				somaB = somaB + grupos[i].valor;
			}
			
			if(g.letra == 'C') {
				somaC = somaC + grupos[i].valor;
			}
			
			if(g.letra == 'D') {
				somaD = somaD + grupos[i].valor;
			}
			if(g.letra == 'F') {
				somaF = somaF + grupos[i].valor;
			}
			
			
		}

		System.out.println("Soma total: " + soma);  
		System.out.println("Soma grupo A: " + somaA );
		System.out.println("Soma grupo B: " + somaB );
		System.out.println("Soma grupo C: " + somaC );
		System.out.println("Soma grupo D: " + somaD );
		System.out.println("Soma grupo F: " + somaF );

		leitor.close();	
			
	}

	
	}

	
		
		
		
		
		
		
