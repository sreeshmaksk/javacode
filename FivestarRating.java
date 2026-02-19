package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FivestarRating extends BaseClass{
	@Test(dataProvider="inputdetails")
	public void rateFivestar(String username,String password) throws InterruptedException
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
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
}
}
