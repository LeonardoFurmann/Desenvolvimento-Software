
////15.	Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O salto
//		mais baixo e mais alto do atleta deve ser desconsiderado, o resultado do atleta será
//		determinado pela média de apenas três valores restantes. Você deve fazer um programa
//		que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois
//  	informe o nome, os saltos e a média dos saltos. 
//		O programa deve ser encerrado quando não houverem mais atletas. 
//	

package pacote;

import java.util.Scanner;

public class Ex15{
	public static void main(String[] args) {
		
		int N = 2;
		int U = 5;
		int j = 0;
		double soma = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		Atleta[] atletas = new Atleta[N];
		
		for (int i = 0; i < atletas.length; i++) {
			
			Atleta novoAtleta = new Atleta();
			novoAtleta.maiorSalto = 0;
			novoAtleta.menorSalto = 1000;
			 j = 0;
			
			System.out.println("\nDigite o nome do atleta: ");
			novoAtleta.nome = leitor.nextLine();
			 
				while(j<U) {	
					System.out.println("Digite o  salto do atleta: ");
					double temp = leitor.nextDouble();
					
					if(temp > novoAtleta.maiorSalto) {
						novoAtleta.maiorSalto = temp;
					} 
					if(temp < novoAtleta.menorSalto) {
						novoAtleta.menorSalto = temp;
					} 
						
					novoAtleta.saltos[j] = temp;
					soma = (soma + novoAtleta.saltos[j]);
					j++;	
					
			}
				soma = soma - (novoAtleta.maiorSalto + novoAtleta.menorSalto);
				novoAtleta.media = soma/3;
				atletas[i] = novoAtleta;
				leitor.nextLine();
			}
		
		for (int i = 0; i < atletas.length; i++) {
			
			Atleta a = atletas[i];
			
			System.out.print("\nAtleta: " + a.nome);
			
			for ( j = 0; j < a.saltos.length; j++) {
				 String ver  = (a.saltos[j] == a.maiorSalto || a.saltos[j] == a.menorSalto) ? " - Desconsiderado":"";
				
				switch(j) {
				case 0:
					System.out.println("\nPrimeiro salto: "  + a.saltos[j] + "m" + ver);
				break;
				case 1:
					System.out.println("Segundo salto: "  + a.saltos[j] + "m" + ver);
				break;
				case 2:
					System.out.println("Terceiro salto: "  + a.saltos[j] + "m" + ver);
				break;
				case 3:
					System.out.println("Quarto salto: "  + a.saltos[j] + "m" + ver);
				break;
				case 4:
					System.out.println("Quinto salto: " + a.saltos[j] + "m" + ver);
				
				}
			}
				
			System.out.println("\nResultado final: ");
			System.out.println("Atleta: " + a.nome);
			System.out.print("Saltos considerados: ");
			
			for (int k = 0; k < a.saltos.length; k++) {
				System.out.print((a.saltos[k] != a.maiorSalto && a.saltos[k] != a.menorSalto ? a.saltos[k]+" -":""));
				
			}
			
			System.out.println("\nMédia dos saltos: " + a.media);	

		}
		

	leitor.close();	
	
	}
}
	
//			
//		String[] atletas = new String[N];
//		float[] saltos = new float[5];
//		
//		for (int i = 0; i < atletas.length; i++) {
//			System.out.println("Digite o nome do atleta: ");
//			atletas[i] = leitor.next();
//			for (int j = 0; j < saltos.length; j++) {
//				
//				float maior = 0;
//				float menor =0;
//				float soma = 0;
//				float media = 0;
//				
//				System.out.println("Digite a distância do salto " + j+1 + " do atleta" + atletas[i]);
//				saltos[j] = leitor.nextFloat();
//				
//				if (maior < saltos[j]) {
//					maior = saltos[j];
//				}
//				
//				if (menor > saltos[j]) {
//					menor = saltos[j];
//					
//				soma = (soma + saltos[i]) - (maior+menor);
//				 media = soma/3;
//				}
//			}
//			


