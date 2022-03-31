import java.util.Scanner;

	public class Programa {

		public static void main(String[] args) {
		
			String matricula = "1234";
			String nome = "leo";
			double [] notas = new double[5];
			double[] pesos = {0.05, 0.05, 0.2, 0.2, 0,5};
		
		
			double nFinal = 0;
			int i = 0;
		
			Scanner leitor = new Scanner(System.in);
		
			do {
				System.out.println("Digite a nota " + (i+1) + ":");
				double notaTemp = leitor.nextDouble();
		
				if(notaTemp >= 0 && notaTemp <=10) {
					notas[i]=notaTemp;
					i++;
				} else {
					
					System.out.println("A nota digitada" +  notaTemp  + "não é válida");
				}
				
			}while(i<5);
		
			System.out.println("\nNotas cadastradas!\n");
			leitor.close();
		
			System.out.println("Matricula: " + matricula);
			System.out.println("Nome: " + nome);

			for(i=0; i<notas.length; i++) {
				System.out.println("Nota(" + (i+1) + "): " + notas[i]);
			}
		
			for(i=0; i<5; i++) {
				double multi =  (notas[i] * pesos[i]);
				nFinal = nFinal + multi;
			}
			
			System.out.println("Nota final: "  +nFinal);
		
				if(nFinal >= 6) {
					System.out.println("Aluno Aprovado!");
				} else {
					System.out.println("Aluno Reprovado!");
				}

			}  		
		}		
		
	
		