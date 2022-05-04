
public class Programa {
	
	public static void main(String[] args) {

		
		double nota = 9.9;
		
		//nota.
		
		String frase = "Só sei que nada sei (Socrates).";
		
		int contador = frase.length();
		System.out.println("Tam:  " + contador);
				
		char c = frase.charAt(3);
		System.out.println("Char:  " + c);
		
		boolean contem = frase.contains("-");
		System.out.println("Contem:  " + contem);		
		
		String[] palavras = frase.split(" ");
//		for (int i = 0; i < palavras.length; i++) {
//			String palavra = palavras[i];
//			System.out.println("Palavra: " + palavra);
//		}
		for (String palavra : palavras) {
			System.out.println("Palavra: " + palavra);
		}
		
		
		String f = frase.replace(" ", "-");
		System.out.println(f);
		
		
		
		//Soluo convencional
		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);
			System.out.println(caractere); 
		}
		
		//Soluo POG
		String[] chars = frase.split("");
		for (String caractere : chars) {
			System.out.println(caractere);
		}
		
		//Soluo avançada
		char[] caracteres = frase.toCharArray();
		for (char caract : caracteres) {
			System.out.println(caract);
		}
		
		
		
		
		
	}

}
