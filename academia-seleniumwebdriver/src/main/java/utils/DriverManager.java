package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	
	private static WebDriver driver;
	
	
	
	public WebDriver AbrirUrl(){
		
		if (driver==null) {
			 System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);    
		       driver = new ChromeDriver();
		       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		       driver.manage().window().maximize();
			
		}
		DriverContext.setDriver(driver);
		return driver;
	}

}