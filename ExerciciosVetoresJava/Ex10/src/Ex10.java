//10.	Faça um algoritmo que leia um vetor A de 30 números.
//Armazene em um vetor B o maior elemento de A, o menor 
//elemento de A, a soma dos elementos de A e a média dos elementos de A.
//Apresente o vetor B na tela.

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		int[] vetA = new int[5];
		int[] vetB = new int[4];
		int maior = 0, menor = 0;
		int soma= 0;
		float media = 0;
		Scanner leitor = new Scanner(System.in);
		
	for (int i = 0; i < vetA.length; i++) {
		
		System.out.print("Digite um número: ");
		vetA[i] = leitor.nextInt();
			maior = vetA[0];
			menor = vetA[0];
			
			soma = vetA[i] + soma;
			 vetB[2] = soma;
	
			 leitor.close();
	}
	
	media = soma/vetA.length;
	 vetB[3] =  (int)media;

	for (int i = 0; i < vetA.length; i++) {
		
			if(maior < vetA[i]) {
				maior = vetA[i];
				vetB[0] = maior;
			} else {}
			
			if(menor > vetA[i]) {
				menor = vetA[i];
				vetB[1] = menor;
			} else {}
	}
	
	System.out.println("\nVetor B: ");
	
	for (int i = 0; i < vetB.length; i++) {
		System.out.print(" " +vetB[i] + " ");
	}
	}
}
