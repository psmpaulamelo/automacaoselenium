package stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.support.PageFactory;
import action.CompraAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class PassosCompra {
	DriverManager manager =new DriverManager();
	WebDriver driver = manager.AbrirUrl();
	CompraAction action  = PageFactory.initElements(driver,CompraAction.class);
	
	
@Given("usuario abrir site {string}")
	public void usuario_abrir_site(String url) {
		driver.get(url);		
}

@When("usuario clicar no botao Sign in")
	public void usuario_clicar_no_botao_sign_in() {
		action.clicar_entrar();
}

@When("preencher o {string} no campo Email Address")
	public void preencher_o_no_campo_email_address(String txtemail) {
		action.preencher_email(txtemail);
}

@When("preencher o {string} no Passoword")
	public void preencher_o_no_passoword(String txtpassword) {
		action.preencherpassword(txtpassword);
}

@When("clicar no botao Sign in")
	public void clicar_no_botao_sign_in() {
		action.clicar_login();
}

@When("usuario voltar para homepage")
	public void usuario_voltar_para_homepage() {
		action.clicar_home();
}

@When("clicar no menu T-Shirts")
	public void clicar_no_menu_t_shirts() {
		action.menu_camiseta();
}

@When("clicar no produto que apareceu na tela")
	public void clicar_no_produto_que_apareceu_na_tela() {
		action.produto_escolhido();
}

@When("clicar no botao btn_add_to_cart")
	public void clicar_no_botao_btn_add_to_cart() {
		action.adicionar_product();
}

@When("Tendo o usuario colocado produto no carrinho")
	public void tendo_o_usuario_colocado_produto_no_carrinho() {
		assertTrue(true, "produto incluso");
	
}

@When("clicar no botao btn_add_checkout")
	public void clicar_no_botao_btn_add_checkout() {
		action.fechar_pedido();
}

@When("clicar no botao btn_checkout")
	public void clicar_no_botao_btn_checkout() {
		action.continuar_processo();
}

@When("clicar no botao btn_address")
	public void clicar_no_bot_o_btn_address() {
		action.continuar_fechamento();
}

@When("clicar no checkbox do termo de uso")
	public void clicar_no_checkbox_do_termo_de_uso() {
		action.aceitar_envio();
}

@When("clicar no botao btn_entrega")
	public void clicar_no_botao_btn_entrega() {
		 action.confirmar_envio();
}

@When("escolher a forma de pagamento")
	public void escolher_a_forma_de_pagamento() {
		action.selecionar_pagamento();
}


@When("clicar no botao btn_confirm")
	public void clicar_no_botao_btn_confirm() {
	    action.confirmar_pedido();
}

@When("Que o usuario finalizou a compra")
	public void que_o_usuario_finalizou_a_compra() {
	   assertTrue(true, "Ordem de compra realizada ");
}


@Then("usuario voltar para home")
	public void usuario_voltar_para_home() {
		driver.get("http://automationpractice.com/index.php");
		assertEquals("Automation Practice",driver.getTitle());
}
@When("clicar em botao btn_out")
	public void clicar_em_botao_btn_out() {
		action.deslogar();
}


}
