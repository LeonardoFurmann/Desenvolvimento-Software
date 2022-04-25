import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
	
		System.out.println("Digiteo primeiro valor do ponto X: ");
		double x1 = leitor.nextDouble();
		System.out.println("Digite o segundo valor do ponto X: ");
		double x2 = leitor.nextDouble();
		System.out.println("Digiteo primeiro valor do ponto Y: ");
		double y1 = leitor.nextDouble();
		System.out.println("Digite o segundo valor do ponto Y: ");
		double y2 = leitor.nextDouble();
		System.out.println("Digite o primeiro valor do ponto Z: ");
		double z1 = leitor.nextDouble();
		System.out.println("Digite o segundo valor do ponto Z: ");
		double z2 = leitor.nextDouble();
		
		
		if(Colisão(x1,x2,y1,y2,z1,z2)) {
			System.out.println("Colidiu!");
		}else {
			System.out.println("Não colidiu!");
		}
		
	}

	private static boolean Colisão(double x1, double x2, double y1, double y2, double z1, double z2) {
		boolean v;
		
		double d = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2));
		
		if(d == 0) {
			 v = true;
		} else {
			v = false;
		}
		return v;
	}
}
