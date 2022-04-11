import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);
		
		int qtd = 2;
		
		String[] matriculas = new String[qtd];
		String[] nomes = new String[qtd];
		double[] notaFinal = new double[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("\nDigite a matricula do aluno " + (i+1) + ":" );
			matriculas[i] = leitor.nextLine();
			
			System.out.println("Digite o nome do aluno " + (i+1) + ":" );
			nomes[i] = leitor.nextLine();
			
			System.out.println("Digite a nota 1 do aluno " + (i+1) + ":");
			double nota1 = leitor.nextDouble();
			
			System.out.println("Digite a nota 2 do aluno " + (i+1) + ":");
			double nota2 = leitor.nextDouble();
			
			notaFinal[i] = (nota1 + nota2)/2;
			
		leitor.nextLine();
		}
		
		System.out.println("\n\nDados dos alunos cadastrados: \n\n");
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("\nMatricula: " + matriculas[i]);
			System.out.println("Nome:" + nomes[i]);
			
			if(notaFinal[i] >= 6) {
				System.out.println("Aprovado: (X)Sim ()Não");
			}else {
				System.out.println("Aprovado: ()Sim (X)Não");
			}
			
		System.out.println("Notas final: " + notaFinal[i]);
		}
		
		}
}