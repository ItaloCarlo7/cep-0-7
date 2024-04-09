package page;

import Metodos.Metodos;
import elemento.Elementos;

public class HomePage {

	
	Metodos metodo = new Metodos();
	//ponteiro para metodos
	
	
	
	public void buscarCepEndereco(String dado) {
		metodo.escrever(Elementos.buscarCepEndereco, dado);

	}
	
	public void validarDadosRetornados(String logradouro, String bairro, String localidade, String cep) {
		metodo.trocarDeAba();
		metodo.validarTexto(Elementos.logradouro_nome, logradouro);
		metodo.validarTexto(Elementos.bairro_distrito, bairro);
		metodo.validarTexto(Elementos.localidade_uf, localidade);
		metodo.validarTexto(Elementos.cep, cep);
		metodo.clicar(Elementos.btn);
	}
	
	
	
	
}


