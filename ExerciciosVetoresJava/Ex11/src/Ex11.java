import java.util.Scanner;

//11.	Crie um algoritmo que leia um vetor A de 10 posições do teclado e, ao final da leitura, copie os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim por diante.

public class Ex11 {
		public static void main(String[] args) {
			
			int[] vetA = new int[10];
			int[] vetB = new int[10];
			
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Digite um número: ");
			vetA[i] = leitor.nextInt();
		}
			
		System.out.println("\nVetor B: ");
			for (int i = 9; i >= 0; i--) {
				vetB[i] = vetA[i];
				System.out.print("  " + vetB[i] + "  ");
			}
		
		leitor.close();

		}
		
	}

