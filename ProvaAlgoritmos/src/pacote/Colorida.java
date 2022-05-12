package pacote;

import java.util.Scanner;

public class Colorida {

	static int x = 2;
	public static Scanner leitor = new Scanner(System.in);
	Scanner leitorDoObjeto = new Scanner(System.in);
	int r;
	int g;
	int b;

public void Transformar(Colorida[][] cor, float[][] cinza) {
	
	//Colorida.leitor;
		
	this.leitorDoObjeto;
		
		int[][] temp = new int[x][x];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				
				 temp[i][j] = (cor[i][j].r + cor[i][j].g + cor[i][j].b)/x;
				 cinza[i][j] = temp[i][j];
				
			}
		}
		
		System.out.println("\nTransformou!");
		
	}


	
}
