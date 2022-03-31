
public class Programa {

		public static void main(String[] args) {
			
			String nome = "Leonardo";
			String matricula = "1234";
			double n1 = 4;
			double n2 = 8.5;
			
			double nf = (n1+n2)/2;
			
			System.out.println("\nMatrícula: " + matricula);
			System.out.println("Nome: " + nome);
			
			if(nf>=6) {
				
				System.out.println("Aprovado (X)Sim ()Não");
				
			}else {
				
				System.out.println("Aprovado ()Sim (X)Não");
				
			}
			
			System.out.println("Nota Final:" + nf);
				
		}
}