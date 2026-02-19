package amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductDetailsPage extends BaseClass {
	@Test
	public void search() throws InterruptedException
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("laptop");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		SoftAssert s1=new SoftAssert();
		
List<WebElement> e1list1=driver.findElements(By.xpath("//div[@class='a-section a-spacing-base desktop-grid-content-view']"));
		
		e1list1.get(0).click();
		Set<String> s2=driver.getWindowHandles();
		System.out.println(s2);
		List<String> ist1=new ArrayList(s2);
		Iterator<String> i2=ist1.iterator();
		String parentid=i2.next();
		String Childid=i2.next();
		
		driver.switchTo().window(Childid);
		Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']/span[2]/span[2]"));
		
		s1.assertEquals(price.getText().isEmpty(), false,"Price detailes not availabe");
		Thread.sleep(2000);
		WebElement description=driver.findElement(By.xpath("//div[@id='feature-bullets']"));
		System.out.println(description.getText());
		s1.assertEquals(description.getText().contains("About this item"), true,"No description availabe");
		
		WebElement review=driver.findElement(By.xpath("//h2[@id='averageCustomerReviewsAnchor']"));
		s1.assertEquals(review.getText(), "Customer reviews","No review availabe");
		
		s1.assertAll();
	}
}
