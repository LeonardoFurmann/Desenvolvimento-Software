import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("D:\\Faculdade\\Desenvolvimento de software\\_software_git\\Fixações\\Fixação5\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();

		int grupoA = 0;
		int grupoB =0;
		int grupoC = 0;
		int grupoD =0 ;
		int grupoE = 0;
		int grupoF = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dadosLinha = linha.split("\t");
			
			switch (dadosLinha[0]) {
			case "A":
				grupoA += Integer.parseInt(dadosLinha[1]);
				break;
			case "B":
				grupoB += Integer.parseInt(dadosLinha[1]);
				break;
			case "C":
				grupoC += Integer.parseInt(dadosLinha[1]);
				break;
			case "D":
				grupoD += Integer.parseInt(dadosLinha[1]);
				break;
			case "E":
				grupoE += Integer.parseInt(dadosLinha[1]);
				break;
			case "F":
				grupoF += Integer.parseInt(dadosLinha[1]);
				break;

			}
		}
		
		ImprimirGrupo("A", grupoA);
		ImprimirGrupo("B", grupoB);
		ImprimirGrupo("C", grupoC);
		ImprimirGrupo("D", grupoD);
		ImprimirGrupo("E", grupoE);
		ImprimirGrupo("F", grupoF);

		System.out.println("Valor Total: " + (grupoA+grupoB+grupoC+grupoD+grupoE+grupoE));

			leitor.close();
	}

	private static void ImprimirGrupo(String letra, int valor) {
		System.out.println("Valor total do grupo "+letra+": " + valor);
		
	}
	
}
