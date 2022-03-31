import java.util.Scanner;

//22.	Faça um algoritmo que apresente na tela o seguinte menu:
//1.	Digitar um número ímpar
//2.	Digitar um número par
//3.	Sair
//
//Caso o usuário escolha a opção 1, ele deve digitar um número ímpar para voltar ao menu. O mesmo deve ser feito na opção 2, mas para um número par. Caso escolha a opção 3, o algoritmo deve apresentar a quantidade de números ímpares digitados na opção 1, a quantidade de números pares digitados na opção 2 e encerrar o algoritmo.

public class Ex22 {
	public static void main(String[] argas) {

		int op;
		int qimpar = 0;
		int qpar=0;
		int pTemp = 0, iTemp = 0;
		Scanner leitor = new Scanner(System.in);
		
	do {
		
		System.out.println("\n1 = Digitar um número impar");
		System.out.println("2 = Digitar um número par");
		System.out.println("3 = Sair");
		System.out.print("Escolha uma opção:");
		op = leitor. nextInt();
		
		switch(op){
		case 1:
			
				System.out.print("\nDigite um número impar:");
				 iTemp = leitor.nextInt();
				
					qimpar++;
			
				if(iTemp%2 == 0) { 
					System.out.println("Número digitado:  "  +  iTemp +  "  não é impar");
				}
				
			break;
		case 2:
			
				System.out.print("\nDigite um número par: ");
					pTemp = leitor.nextInt();
			
					qpar++;
		
				if(pTemp%2 == 1) { 
				System.out.println("Número digitado: "  +  pTemp +  "  não é par");
			
				}
		
			break;
		default:
			System.out.println("\nOpção não existente");
		}
		
		
	} while(op != 3);
	
	leitor.close();
	
	System.out.println("\n\nSaiu!!");
	
	System.out.println("\nQuantidade de números impares digitados: " +qimpar);
	System.out.println("Quantidade de números pares digitados: " +qpar);
	
	}
}
	
	

