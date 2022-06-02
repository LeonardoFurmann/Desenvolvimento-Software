package br.edu.up.view;

import java.util.List;

import br.edu.up.model.Pessoa;

public class PessoaView {
	
	@SuppressWarnings("unused")
	public static void imprimir(Pessoa pessoa) {		
		System.out.println(pessoa);
    }
	
	public static void imprimirPessoas(List<Pessoa> pessoas)
	{
		for (Pessoa pessoa : pessoas) {
			System.out.println();
			System.out.println("------------------");
			System.out.println();
			System.out.println("ID: " + pessoa.getId());
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
		}
	}
	
}
