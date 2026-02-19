package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchAProduct extends BaseClass{
@Test
	public void search() throws InterruptedException
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SoftAssert s1=new SoftAssert();
		
		s1.assertEquals(driver.getTitle().contains("yets"), true);
		s1.assertAll();
		
	}
}
