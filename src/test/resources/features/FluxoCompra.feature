 Feature: Compra Fluxo 
 Background: abrir site compras
 Given usuario abrir site "http://automationpractice.com/index.php" 


@logar_usuario
 Scenario Outline: Acessar site logar e efetuar compra 
	
	 When usuario clicar no botao Sign in
	 And preencher o "<txtemail>" no campo Email Address
	 And  preencher o "<txtpassword>" no Passoword
	 And  clicar no botao Sign in
	 And  usuario voltar para homepage
	 And clicar no menu T-Shirts
	 And clicar no produto que apareceu na tela 
	 And clicar no botao btn_add_to_cart
	 And  Tendo o usuario colocado produto no carrinho
	 And  clicar no botao btn_add_checkout
	 And clicar no botao btn_checkout
	 And clicar no botao btn_address
	 And clicar no checkbox do termo de uso
	 And clicar no botao btn_entrega
	 And  escolher a forma de pagamento 
	 And   clicar no botao btn_confirm
	 And   Que o usuario finalizou a compra 
	 When   clicar em botao btn_out 	
   And usuario voltar para home
 
 Examples:
	|txtemail         | txtpassword|
	|QApaula@gmail.com| tequila    |




 
