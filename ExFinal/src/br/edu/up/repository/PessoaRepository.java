package br.edu.up.repository;

import br.edu.up.model.Pessoa;

public class PessoaRepository extends GenericRepository<Pessoa> {
	

	public PessoaRepository() {
		super("Pessoa", Pessoa.class);		
	}


}
