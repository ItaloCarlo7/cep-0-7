package steps;

import config.IniciarTeste;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class ConsultaTeste {

	HomePage home = new HomePage();
	// Ponteiro para Home

	@Before
	public void iniciarTeste() {

		IniciarTeste.configurarAmbiente();

	}

	@After
	public void finalizarTeste() {

		IniciarTeste.encerrarTeste();

	}

	@When("enviar os dados para busca")
	public void enviar_os_dados_para_busca() {
		home.buscarCepEndereco("08472-710");

	}

	@Then("validar os dados retornados")
	public void validar_os_dados_retornados() {

		home.validarDadosRetornados("Rua semente do amor", "Conj. Hab. Inacio Monteiro", "São Paulo/SP", "08472-710");

	}

}
