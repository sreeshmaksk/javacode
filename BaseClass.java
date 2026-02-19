package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	WebDriver driver;
	@BeforeMethod
 void browserlaunch() throws InterruptedException
 {
		 driver=new ChromeDriver();
		 
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
 }
	@AfterMethod
 void browserquit()
 {
		//driver.quit();
 }
	@DataProvider
	public static Object inputdetails()
	{
		Object [][]d1=new Object[1][2];
		d1[0][0]="suratna94@gmail.com";
		d1[0][1]="Aathu@2025";
		
	    
				
		return d1;
	}
}
