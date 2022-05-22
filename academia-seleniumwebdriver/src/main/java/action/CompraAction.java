package action;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.CompraPage;
import utils.DriverContext;

public class CompraAction extends CompraPage {
	

	protected WebDriverWait wait;
	public CompraAction() {
		
		  wait = new WebDriverWait(DriverContext.getDriver(), 40);
		//PageFactory.initElements(DriverContext.getDriver(), this);//chamar o driver
		 
		   }
	    
	   //  logar  usuario
	
		public void clicar_entrar() {
			 wait.until(ExpectedConditions.elementToBeClickable(linkSignin)).click();
		}
		
		public void preencher_email(String email) {
	        wait.until(ExpectedConditions.visibilityOf(txtemail)).sendKeys(email);
	    }
		
		public void preencherpassword(String password) {
	        wait.until(ExpectedConditions.visibilityOf(txtpassword)).sendKeys(password);
	    }
		
		public void clicar_login() {
		 wait.until(ExpectedConditions.elementToBeClickable(bntlogin)).click();
		 }
	
		//escolha do produto 
		
		public void clicar_home(){
			 wait.until(ExpectedConditions.elementToBeClickable(bnthome)).click();
			 }
		
		public void menu_camiseta() {
			 wait.until(ExpectedConditions.elementToBeClickable(menu_camiseta)).click();
		}
		
		public void produto_escolhido() {
			
			 wait.until(ExpectedConditions.elementToBeClickable(produto)).click();
		}
	
		public void quantidade_maior(String quantity_wanted) {
			wait.until(ExpectedConditions.visibilityOf(aumentar_quantidade)).clear(); 
			wait.until(ExpectedConditions.visibilityOf(aumentar_quantidade)).sendKeys(quantity_wanted);
		}
			
		public void selecioar_cor(String cor) {
			wait.until(ExpectedConditions.elementToBeClickable(sel_color)).click();
		}
		
		public void adicionar_product() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_add_to_cart)).click();
		}
		
		// fechamento do pedido 
		
		public void fechar_pedido() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_add_checkout)).click();
		}
		
		public void quantidade_menor(String menos) {
			wait.until(ExpectedConditions.visibilityOf(diminuir_product)).clear();
			 wait.until(ExpectedConditions.visibilityOf(diminuir_product)).sendKeys(menos);
		}
		
		public void continuar_processo() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_checkout)).click();
			
		}
		
		public void continuar_fechamento() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_address)).click();
		}
		
		public void aceitar_envio() {
			if(!cbox_cgv.isSelected()) {
				cbox_cgv.click();
			}
		}
		
		public void confirmar_envio() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_entrega)).click();
		}
		
		public void selecionar_pagamento() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_pay)).click();
		}
		
		public void confirmar_pedido() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_confirm)).click();
		}
		
		// painel da area do usuario
		
		public void  cadastro_user() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_user)).click();
		}
		
		public void historico_compra () {
			wait.until(ExpectedConditions.elementToBeClickable(historico_product)).click();	
		}
		
		public void historico_detalhado() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_details)).click();
		}
		
		// deslogar usuario
		
		public void voltar_home() {
				wait.until(ExpectedConditions.elementToBeClickable(btn_retorno_user)).click();
		}
		
		public void deslogar() {
			wait.until(ExpectedConditions.elementToBeClickable(btn_out)).click();
			}
		
}

		
		




		
			
		
		
			
			
			
					
		


		

