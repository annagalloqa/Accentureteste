package com.accenture.web.steps;

import com.accenture.web.commons.Commons;
import com.accenture.web.funcionalidades.SampleAppFuncionalidades;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleAppSteps {

	Commons commons = new Commons();
	SampleAppFuncionalidades funcionalidade = new SampleAppFuncionalidades();
	
	
	@Given("que estou logado no site {string}")
	public void que_estou_logado_no_site(String string) {
		funcionalidade.acessaSite(string);
	}

	@When("preencho os dados do formulário Enter Vehicle Data")
	public void preencho_os_dados_do_formulário_enter_vehicle_data() throws Exception {
	    funcionalidade.menuEnterVehicleData();
	}

	@When("preencho os dados do formulário Enter Insurant Data")
	public void preencho_os_dados_do_formulário_enter_insurant_data() throws Exception {
	    funcionalidade.menuEnterInsurantData();
	}

	@When("preencho os dados do formulário Enter Product Data")
	public void preencho_os_dados_do_formulário_enter_product_data() throws Exception {
		funcionalidade.menuEnterProductData();
	 
	}

	@When("preencho os dados do formulário Select Price Option")
	public void preencho_os_dados_do_formulário_select_price_option() throws Exception {
		funcionalidade.menuSelectPriceOption();
	}

	@When("preencho os dados do formulário Send Quote")
	public void preencho_os_dados_do_formulário_send_quote() throws Exception {
	  funcionalidade.menuSendQuote();
	}

	@Then("valido mensagem {string} de confirmação na tela")
	public void valido_mensagem_de_confirmação_na_tela(String string) throws Exception {
	    funcionalidade.mensagemSucesso(string);
	}
}
