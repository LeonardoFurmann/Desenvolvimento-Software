//	Faça um algoritmo que calcule e apresente a média aritmética de diversos números lidos do teclado. Serão digitados valores até que o usuário digite 0.//

		import java.util.Scanner;

			public class Ex7 {
					public static void main(String[] args) {
	
						Scanner leitor = new Scanner(System.in);

						float soma = 0;
						float media = 0;
						int i = 0;
						float n;

						do {
							System.out.println("Digite um número: ");
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
						System.out.printf("Média dos valores: %f " ,  media);	 

					} 
			}
