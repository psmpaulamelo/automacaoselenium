package action;

import java.sql.DriverAction;
import java.util.function.Function;

import javax.swing.JSeparator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.CreateAccountPage;
import utils.DriverContext;

public class CreateAccounAction extends CreateAccountPage {

	protected WebDriverWait wait;
	
	
		 // Caminho para iniciar o cadastro
		    
		    public CreateAccounAction() {
		        wait = new WebDriverWait(DriverContext.getDriver(), 10);
		        //PageFactory.initElements(DriverContext.getDriver(), this);//chamar o driver
		    }
		    
		    public void clicarSignIn() {
		        wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
		    }
		    
		    public void preencherEmail(String email) {
		        wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
		    }
		    
		    public void clicarCreateAccount() {
		        wait.until(ExpectedConditions.elementToBeClickable(btnCreateAccount)).click();
		    }

		 //  Caminho de estrutura do cadastro 

		    public void preencherfirst_name(String First_name) {
				  wait.until(ExpectedConditions.visibilityOf(txtfirstname)).sendKeys(First_name);
				}
			
			public void preencherlast_name(String last_name) {
				 wait.until(ExpectedConditions.visibilityOf(txtlastname)).sendKeys(last_name);
			}
			
			public void preencher_password(String password) {
				wait.until(ExpectedConditions.visibilityOf(txtpassword)).sendKeys(password);
				
			}
			
			public void selectday(String days) {
			
				Select cboxday = new Select(cboxdays);
				cboxday.selectByValue(days);
				}
			
			
			public void selectmonth(String months) {
			Select cboxmonth = new Select(cboxmonths);
			cboxmonth.selectByValue(months);
				
			}
			
			 public void selectyears(String years) {
				Select cboxyear = new Select(cboxyears);
				cboxyear.selectByValue(years);
				}

			public void checknews() {
				if(!checknews.isSelected()) {
					checknews.click();
				}
				
			}
			
			public void checkoptin() {
				if(!checkoptin.isSelected()) {
					checkoptin.click();
				}
			}
			
			// ação cadastro endereço 
			
			public void preenchercompany(String company ) {
				wait.until(ExpectedConditions.visibilityOf(txtcompany)).sendKeys(company );
			}
			
			public void preencheraddress1(String address1) {
				wait.until(ExpectedConditions.visibilityOf(txtaddress1)).sendKeys(address1 );
			}
			
			public void preencheraddress2(String address2) {
				wait.until(ExpectedConditions.visibilityOf(txtadd)).sendKeys(address2 );
			}
			
			public void preenchercity(String city) {
				wait.until(ExpectedConditions.visibilityOf(txtcity)).sendKeys(city );
			}
		
			public void selecionarestado (String state) {
				Select sel_estado = new Select(sel_state);
				sel_estado.selectByValue(state);
			}
			public void preencherpostcode (String postcode) {
				wait.until(ExpectedConditions.visibilityOf(txtpostcode)).sendKeys(postcode) ;
			}
			public void selcountry () {}
			
			public void preencherother(String other) {
				wait.until(ExpectedConditions.visibilityOf(txtoher)).sendKeys(other) ;
			}
			
			public void preencherphone(String phone) {
				wait.until(ExpectedConditions.visibilityOf(txtphone)).sendKeys(phone) ;
			}
			
			public void preencherphone_mobile(String phone_mobile) {
				wait.until(ExpectedConditions.visibilityOf(txtmobile)).sendKeys(phone_mobile); 
			}
			
			public void preencherreferencia (String alias) {
				wait.until(ExpectedConditions.visibilityOf(txtalias)).clear(); 
				wait.until(ExpectedConditions.visibilityOf(txtalias)).sendKeys(alias); 
				
			}
			public void clicarconfirmar() {
			 wait.until(ExpectedConditions.elementToBeClickable(btnregistro)).click();
			}
					
}			




	


