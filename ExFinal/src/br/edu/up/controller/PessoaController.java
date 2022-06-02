package br.edu.up.controller;

import java.util.List;

import br.edu.up.model.Pessoa;
import br.edu.up.repository.PessoaRepository;

public class PessoaController {

	
	PessoaRepository repository = new PessoaRepository();
	
	public List<Pessoa> listar() {	
		return repository.listar();
	}
	
	public void salvar(Pessoa pessoa) {
		repository.salvar(pessoa);
	}

	public Pessoa localizar(Integer id) {		
		return repository.localizar(id);
	}
	

	public void atualizar(Pessoa pessoa) {
		repository.atualizar(pessoa);
	}

	public void apagar(Integer id) {
		repository.apagar(id);
	}
}
