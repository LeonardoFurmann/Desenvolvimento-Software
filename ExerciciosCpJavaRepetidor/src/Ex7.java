//	Fa�a um algoritmo que calcule e apresente a m�dia aritm�tica de diversos n�meros lidos do teclado. Ser�o digitados valores at� que o usu�rio digite 0.//

		import java.util.Scanner;

			public class Ex7 {
					public static void main(String[] args) {
	
						Scanner leitor = new Scanner(System.in);

						float soma = 0;
						float media = 0;
						int i = 0;
						float n;

						do {
							System.out.println("Digite um n�mero: ");
							n = leitor.nextInt();
	 
	  
							if(n == 0) {
								break;
							} else {
		  
								i++;
								soma = n + soma;
								media = soma/i;
	  
							}
	  
						} while(n != 0);
 
						leitor.close();
						System.out.printf("M�dia dos valores: %f " ,  media);	 

					} 
			}
