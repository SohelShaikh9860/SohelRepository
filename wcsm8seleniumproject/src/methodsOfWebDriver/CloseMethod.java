package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod
{   
	//it is use to close the parent browser.   ReturnType is void
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
	
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
