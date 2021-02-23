package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {
	//declaration
	@FindBy(id="email")
    private WebElement email;
	
	@FindBy(id="pass")
    private WebElement password;
	
	@FindBy(name="login")
    private WebElement loginbutton;
	
	//intialization
	public Facebook_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setemail(String mail)
	{
		email.sendKeys(mail);
		
	}
	public void setpass(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	public void pressbtn()
	{
		loginbutton.click();
		
	}

}
