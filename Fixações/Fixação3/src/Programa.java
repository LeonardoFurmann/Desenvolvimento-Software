import java.util.Scanner;


public class Programa {
	public static void main(String[] args) {
		
	int i = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		double[] notas = new double[5];
		
		String nome = "Leonardo";
		String matricula = "1234";
		
	
		while( i<5){
			System.out.println("Digite a nota " + (i+1) + " do aluno: ");
			double temp = leitor.nextDouble();
			
		if(temp >= 0 && temp <=10) {
			notas[i] = temp;
			i++;
		} else {
			System.out.println("A nota digitada " + temp +  " não é valida\n" );
		}
	}
		System.out.println("Notas cadastradas!");
		leitor.close();
		
		System.out.println("\nMatricula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for ( i = 0; i < notas.length; i++) {
			System.out.println("Nota (" + (i+1) + "):" + notas[i]);
		}
		
	}

}
