package br.edu.up;

import java.util.List;
import br.edu.up.model.Pessoa;
import br.edu.up.controller.PessoaController;
import br.edu.up.view.PessoaView;

public class Programa {
	
	public static void main(String[] args) {
	
		PessoaController controller = new PessoaController();
		List<Pessoa> pessoas = controller.listar();
		PessoaView.imprimirPessoas(pessoas);

	}
}




//PessoaController.apagar(4);
//Pessoa fulano = new Pessoa();
//fulano.setNome("Gilson");
//fulano.setIdade(35);
//
//salvar(fulano);

//Pessoa jorge = localizar(2);
//jorge.setIdade(30);
//
//atualizar(jorge);
