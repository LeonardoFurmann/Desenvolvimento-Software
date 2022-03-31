/*2.	Faça um algoritmo que apresenta na tela a soma obtida dos 100 primeiros números inteiros. Ex.: 1 + 2 + 3 + 4 + 5 + ... + 97 + 98 + 99 + 100.*/

public class Ex2{
	public static void main(String[] args) {
		
		int s = 0;
		for(int i = 1;i<100; i++) {
			s = s + i;
		}
		System.out.println("Soma:" + s);
	}
}
