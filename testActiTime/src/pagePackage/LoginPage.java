package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//Declaration
	
	@FindBy(name="username") private WebElement user;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(name="//img[contains(src,'timer')]") private WebElement logo;
	@FindBy(name="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	
	
	
	
	//initialization
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//utilization
	public void sendUsername()
	{
		user.sendKeys("admin");
	}
	
	public WebElement getUser() {
		return user;
	}


	public WebElement getPsw() {
		return psw;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	

    //Operational Methods

	public void sendPassword()
	{
		user.sendKeys("manager");
	}
	
	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
	public void delay() throws InterruptedException
	{
	 Thread.sleep(2000);
	}
	
	
	

   }
	
	
	
	
	
	
	
	
	
	
	


