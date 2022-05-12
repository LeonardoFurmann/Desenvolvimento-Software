package model;

public class Animal implements Ser {

	public String nome;
	public String genero;
	public String porte;
	private int idade; // 1 a 150
	
	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idadeDeFora) throws Exception {
		if (idadeDeFora > 0 && idadeDeFora < 151) {

			this.idade = idadeDeFora;
		} else {

			throw new Exception("Idade Inválida");

// 			lança somente durante o progrma
//			throw new RuntimeException("Idade Inválida");
		}
	}
}
