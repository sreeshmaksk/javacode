package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UpdateProfile extends BaseClass {
@Test(dataProvider="inputdetails")	
public void updateprofile(String username,String password) throws InterruptedException
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
WebElement e2=driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
a1.moveToElement(e2).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@cursor='pointer']/div/button")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("View")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='accordion-preferred-department-id']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Women']")).click();
	driver.findElement(By.xpath("//div[@class='survey-footer']/div/span/span/button")).click();
	WebElement validation1=driver.findElement(By.xpath("//div[@class='last-updated']"));
	String msg=validation1.getText();
	System.out.println(msg);
	s1.assertEquals(msg.contains("Last updated"), true);
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='accordion-height-and-weight-id']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='cm']")).sendKeys("150");
	driver.findElement(By.xpath("//input[@aria-label='kg']")).sendKeys("50");
	driver.findElement(By.xpath("//div[@class='survey-footer']/div/span/span/button")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='accordion-age-group-id']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='25-29']")).click();
	driver.findElement(By.xpath("//div[@class='survey-footer']/div/span/span/button")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='accordion-body-attributes-id']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-labelledby='fit-shoulder-body-attributes-survey-section-header']//button[text()='Wide']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-labelledby='fit-legs-body-attributes-survey-section-header']//button[text()='Average']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-labelledby='fit-waist-body-attributes-survey-section-header']//button[text()='Narrow']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-labelledby='fit-hips-body-attributes-survey-section-header']//button[text()='Wide']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='survey-footer']/div/span/span/button")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='accordion-shoe-sizes-id']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-labelledby='shoe-sizes-survey-section-header']//button[text()='5.5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-labelledby='shoe-modifier-shoe-sizes-survey-section-header']//button[text()='Standard']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='survey-footer']/div/span/span/button")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='pill-container ']//div[text()='Skin Care']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='pill-container ']//div[text()='Makeup']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='inline-button-container desktop']/span/span/button)[1]")).click();
}


}
