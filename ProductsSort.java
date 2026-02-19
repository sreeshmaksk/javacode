package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductsSort extends BaseClass{
	@Test(dataProvider="inputdetails")
	public void sortTheProducts(String username,String password) throws InterruptedException
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
		WebElement e3=driver.findElement(By.xpath("//select[@name='s']"));
		//WebElement verifytest=driver.findElement(By.xpath("/span[@class='a-dropdown-prompt']"));
		Select s2=new Select(e3);
		s2.selectByIndex(1);
		s1.assertEquals(driver.getCurrentUrl().contains("s=price-asc-rank"),true,"not sorted on price ascending");
		Thread.sleep(2000);
		//s2.selectByVisibleText("Avg. Customer Review");
		//s2.selectByIndex(3);
		//s1.assertEquals(driver.getCurrentUrl().contains("s=review-rank"),true,"not sorted on review");
		Thread.sleep(2000);
		//s2.selectByIndex(5);
		//s1.assertEquals(driver.getCurrentUrl().contains("s=exact-aware-popularity-rank"),true,"not sorted on review");
		//Thread.sleep(2000);
		
		s1.assertAll();
	}
	
	

}
