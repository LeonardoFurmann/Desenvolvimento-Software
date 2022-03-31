import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		String matricula = "1234";
		String nome = "leo";
		int [] notas = new int[5];
		int i = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while(i<5) {
		System.out.println("Digite a nota " + (i+1));
		int notaTemp = leitor.nextInt();
		
		if(notaTemp >= 0 && notaTemp <=10) {
			notas[i]=notaTemp;
			i++;
		} else {
			System.out.println("A nota digitada" + notaTemp + "não é válida");
		}
	}
		System.out.println("Notas cadastradas");
		leitor.close();
				
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for(i=0; i<notas.length; i++) {
			System.out.println("Nota(" + (i+1) + "): " + notas[i]);
		}
}
}