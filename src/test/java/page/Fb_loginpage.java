package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_loginpage 
{
		WebDriver driver;
		
		@FindBy(id="email")
		WebElement fbEmail;
		
		@FindBy(id="pass")
		WebElement fbPass;
		
		@FindBy(name="login")
		WebElement fbLogin;
		
		public Fb_loginpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void setValues(String email,String pswd)
		{
			fbEmail.sendKeys(email);
			fbPass.sendKeys(pswd);
		}
		public void loginClick()
		{
			fbLogin.click();
		}
		

}



