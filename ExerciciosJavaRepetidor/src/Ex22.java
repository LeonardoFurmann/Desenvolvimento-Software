import java.util.Scanner;

//22.	Fa�a um algoritmo que apresente na tela o seguinte menu:
//1.	Digitar um n�mero �mpar
//2.	Digitar um n�mero par
//3.	Sair
//
//Caso o usu�rio escolha a op��o 1, ele deve digitar um n�mero �mpar para voltar ao menu. O mesmo deve ser feito na op��o 2, mas para um n�mero par. Caso escolha a op��o 3, o algoritmo deve apresentar a quantidade de n�meros �mpares digitados na op��o 1, a quantidade de n�meros pares digitados na op��o 2 e encerrar o algoritmo.

public class Ex22 {
	public static void main(String[] argas) {

		int op;
		int qimpar = 0;
		int qpar=0;
		int pTemp = 0, iTemp = 0;
		Scanner leitor = new Scanner(System.in);
		
	do {
		
		System.out.println("\n1 = Digitar um n�mero impar");
		System.out.println("2 = Digitar um n�mero par");
		System.out.println("3 = Sair");
		System.out.print("Escolha uma op��o:");
		op = leitor. nextInt();
		
		switch(op){
		case 1:
			
				System.out.print("\nDigite um n�mero impar:");
				 iTemp = leitor.nextInt();
				
					qimpar++;
			
				if(iTemp%2 == 0) { 
					System.out.println("N�mero digitado:  "  +  iTemp +  "  n�o � impar");
				}
				
			break;
		case 2:
			
				System.out.print("\nDigite um n�mero par: ");
					pTemp = leitor.nextInt();
			
					qpar++;
		
				if(pTemp%2 == 1) { 
				System.out.println("N�mero digitado: "  +  pTemp +  "  n�o � par");
			
				}
		
			break;
		default:
			System.out.println("\nOp��o n�o existente");
		}
		
		
	} while(op != 3);
	
	leitor.close();
	
	System.out.println("\n\nSaiu!!");
	
	System.out.println("\nQuantidade de n�meros impares digitados: " +qimpar);
	System.out.println("Quantidade de n�meros pares digitados: " +qpar);
	
	}
}
	
	

