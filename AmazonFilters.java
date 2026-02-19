package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonFilters extends BaseClass {
	@Test(dataProvider="inputdetails")
	public void filters(String username,String password) throws InterruptedException
	{
		SoftAssert s1=new SoftAssert();
		
		WebElement e1=driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		WebElement emailorusername=driver.findElement(By.id("ap_email_login"));
		emailorusername.sendKeys(username);
		emailorusername.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.id("ap_password"));
		psw.sendKeys(password);
		psw.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("bags");
		e2.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[text()='₹2,200 - ₹4,800']/parent::a")).click();
		Thread.sleep(4000);
		//System.out.println(driver.getTitle());
		//s1.assertEquals(driver.getTitle().contains("₹2,200 - ₹4,800"), true,"not in correct price range");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Business to narrow results']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		s1.assertEquals(driver.getTitle().contains("Business"), true,"not in correct category");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Fabric to narrow results']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		s1.assertEquals(driver.getTitle().contains("Fabric"), true,"not correct material");
		s1.assertAll();
		
		
	}
	
	
}
