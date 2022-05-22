package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class CreateAccountPage {
	
	
	public CreateAccountPage(){
		PageFactory.initElements(DriverContext.getDriver(),this);
		
		
			
				
	}
	
	// Caminho para iniciar o cadastro
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
    protected WebElement linkSignIn;
	
	@FindBy(how=How.ID, using="email_create")
    protected WebElement txtEmail;
    
    @FindBy(how=How.ID, using="SubmitCreate")
    protected WebElement btnCreateAccount;
  
    // Caminho de estrutura do cadastro 
    
    @FindBy(how=How.ID, using="id_gender2")
    protected WebElement radio;
    
    @FindBy(how=How.ID, using="customer_firstname")
    protected WebElement txtfirstname;
    
    @FindBy(how=How.NAME, using="customer_lastname")
    protected WebElement txtlastname;
    
    @FindBy(how=How.ID, using="passwd")
    protected WebElement txtpassword;
    
    @FindBy(how=How.ID,using = "days")
    protected WebElement cboxdays;
    
    @FindBy (how=How.ID, using = "months")
    protected WebElement cboxmonths;
    
    @FindBy(how=How.ID, using = "years")
    protected WebElement cboxyears;
    
    @FindBy(how=How.NAME, using= "newsletter")
    protected WebElement checknews;
    
    @FindBy(how=How.NAME, using= "optin")
    protected WebElement checkoptin;
    
    // caminho do endereço
    
    @FindBy(id="company")
    protected WebElement txtcompany;
    
    @FindBy(id ="address1")
    protected WebElement txtaddress1;
    
    @FindBy(name= "address2")
    protected WebElement txtadd;
    
    @FindBy(name="city")
    protected WebElement txtcity;
    
    @FindBy(id ="id_state")
    protected WebElement sel_state;
    
    @FindBy(id = "postcode")
    protected WebElement txtpostcode;
    
    @FindBy(id ="id_country ")
    protected WebElement selcountry;
    
    @FindBy(name = "other")
    protected WebElement txtoher;
    
    @FindBy(name = "phone")
    protected WebElement txtphone;
    
    @FindBy(name ="phone_mobile")
    protected WebElement txtmobile;
    
    @FindBy(id ="alias")
    protected WebElement txtalias;
    
    @FindBy(id="submitAccount")
    protected WebElement btnregistro;
    		
    
    
    
} 


