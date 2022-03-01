package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutlink;
	@FindBy(name="userSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	@FindBy(id="SubmiTTButton") private WebElement saveLeaveTimeButton;
	
	
	
	//Initialization
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	
	}
	
	
	//Utilization
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}
	
	//Generic reusable
	public void logout()
	{
	   logoutlink.click();
	}
	

}
