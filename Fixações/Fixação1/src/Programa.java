
public class Programa {

		public static void main(String[] args) {
			
			String nome = "Leonardo";
			String matricula = "1234";
			double n1 = 4;
			double n2 = 8.5;
			
			double nf = (n1+n2)/2;
			
			System.out.println("\nMatr�cula: " + matricula);
			System.out.println("Nome: " + nome);
			
			if(nf>=6) {
				
				System.out.println("Aprovado (X)Sim ()N�o");
				
			}else {
				
				System.out.println("Aprovado ()Sim (X)N�o");
				
			}
			
			System.out.println("Nota Final:" + nf);
				
		}
}