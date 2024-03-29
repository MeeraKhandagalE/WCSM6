
package generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {

	public static WebDriver driver;


	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH,"browser");
		String url = flib.readPropertyData(PROP_PATH, "url");


		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);


		}

		else if(browserValue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);

		}

		else
		{
			System.out.println("invalid option");
		}



	}
	public void fail()
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			 File src = ts.getScreenshotAs(OutputType.FILE);
			 File dest = new File("./Screeshots/filename.png");
			 Files.copy(src, dest);
		}
		catch(Exception e)
		{
			
		}
	}




	public void closeBrowser()
	{
		driver.quit();
	}

}