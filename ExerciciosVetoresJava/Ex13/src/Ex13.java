/*13.	Elabore um algoritmo que leia 30 n�meros do teclado e preencha um vetor de acordo com a seguinte regra: com exce��o do 1� n�mero, s� � permitido armazenar um n�mero se ele for maior que o anterior.
Ex.: se o primeiro valor lido for 5, o pr�ximo valor lido s� poder� ser maior que 5. E assim por diante.
*/

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String [] args) {
	
	int [] valores = new int[5];
	 int  i = 0;
	
		Scanner leitor = new Scanner(System.in);
		

		while(i < 5){
	
	if(i == 0) {
		System.out.println("Digite um N�mero: ");
			valores[i] = leitor.nextInt(); 
			i++;

}   else {
		System.out.println("Digite um N�mero: ");
			int valorTemp = leitor.nextInt(); 
	
			if(valorTemp > valores[i-1]) {
					valores[i]=valorTemp;
					i++;
			} else {
			System.out.println("O valor digitado " +   valorTemp   + " n�o � v�lido\n");
		
			}
	}
			
	}
		leitor.close();
		
			for( i=0; i< valores.length; i++)
			System.out.print(" " + valores[i] +" " );
			
		}
	}

		
		
//		System.out.println("Digite um N�mero: ");
//		 valores[0] = leitor.nextInt(); 
//		 
//		while(i < 5){
//	
//	System.out.println("Digite um N�mero: ");
//	
//		int valorTemp = leitor.nextInt(); 
//	
//		if(valores[i] > valores[i-1]) {
//				valores[i]=valorTemp;
//				i++;
//		} else {
//			System.out.println("O valor digitado " +   valorTemp   + " n�o � v�lida");
//		}
//	} 
	
	