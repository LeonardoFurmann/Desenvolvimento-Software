package br.edu.up;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Programa {
	

	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File("D:\\Faculdade\\Desenvolvimento de software\\_software_git\\Fixações\\Fixação5\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		
		Grupo[] grupos = new Grupo[72];
		int cont = 0;
		int somaTotal = 0;
		int i = 0;
		
		// vetor de somas do grupso
//		int somaA = 0;
//		int somaB = 0;
//		int somaC = 0;
//		int somaD = 0;
//		int somaE = 0;
//		int somaF = 0;
		
		
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
			somaTotal = somaTotal + grupos[cont].valor;
			cont++;
			
				
		}	
		
		System.out.println("Soma total: " + somaTotal);  
		
		
	}
	
}


// Fazer as somas!!!!!!!!!
		
		
		
		
		
		
