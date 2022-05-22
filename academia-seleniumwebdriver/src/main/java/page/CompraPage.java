package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class CompraPage {
	
	public CompraPage () {
		
		PageFactory.initElements(DriverContext.getDriver(),this);
				
	}

	// acessando da conta 
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
    protected WebElement linkSignin;
	
	@FindBy (id="email")
	protected WebElement txtemail;
	
	@FindBy(id ="passwd")
	protected WebElement txtpassword;
	
	@FindBy(name = "SubmitLogin")
	protected WebElement bntlogin;
	
	//selecionando o produto
	
	@FindBy(className = "icon-home")
	protected WebElement bnthome;
	
	@FindBy(linkText =  "T-SHIRTS")
	protected WebElement menu_camiseta;
	
	@FindBy(className ="product_img_link")
	protected WebElement produto;
	

	@FindBy(id="quantity_wanted")
	protected WebElement aumentar_quantidade;
	
	@FindBy(name="Orange")
	protected WebElement sel_color;
	
	@FindBy(id="add_to_cart")
	protected WebElement btn_add_to_cart;

	// inicio caminho compra 
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement btn_add_checkout;
	
	@FindBy(xpath="//*[@id=\"product_1_1_0_677884\"]/td[5]/input[2]")
	protected WebElement diminuir_product;

	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement btn_checkout;
	
	@FindBy(name="processAddress")
	protected WebElement btn_address;
	
	@FindBy(id="cgv")
	protected WebElement cbox_cgv;
	@FindBy(name="processCarrier")
	protected WebElement btn_entrega;
	
	@FindBy(partialLinkText = "Pay by bank wire")
	protected WebElement btn_pay;
		
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	protected WebElement btn_confirm;
	
	// area do usuario 
	
	@FindBy(linkText = "Paula Melo")
	protected WebElement btn_user;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	protected WebElement historico_product;
	
	@FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")
	protected WebElement btn_details;
	
	
	// processo de deslogar da area do usuario
	
	@FindBy(partialLinkText ="Home")
	protected WebElement btn_retorno_user;
	
	@FindBy(linkText = "Sign out")
	protected WebElement btn_out;
	}
	
