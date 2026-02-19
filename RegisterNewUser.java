package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterNewUser extends BaseClass{
	@Test
	public void registartion() throws InterruptedException
	{
		WebElement e1=driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("sreeshmaksk94@gmail.com");
		
		Thread.sleep(3000);
		WebElement buttn=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		//Actions act=new Actions(driver);
		//act.doubleClick(buttn).perform();
		buttn.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-text-center']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8169507633");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_customer_name")).sendKeys("sreeshma");
		
		driver.findElement(By.id("ap_password")).sendKeys("sreeshma123");
		driver.findElement(By.xpath("//span[@id='auth-continue']")).click();
		Thread.sleep(2000);
		
		/*
		 * WebElement frame1=driver.findElement(By.id("cvf-aamation-challenge-iframe"));
		 * WebElement frame2=driver.findElement(By.id("aacb-arkose-frame")); WebElement
		 * frame3=driver.findElement(By.xpath("/iframe[@title='Verification challenge']"
		 * )); WebElement frame4=driver.findElement(By.id("game-core-frame"));
		 * driver.switchTo().frame(frame1); driver.switchTo().frame(frame2);
		 * driver.switchTo().frame(frame3); driver.switchTo().frame(frame4); WebElement
		 * puzzlebutton=driver.findElement(By.
		 * xpath("//button[@aria-label='Start Puzzle']"));
		 * Assert.assertEquals(puzzlebutton.isDisplayed(), true);
		 */
		Thread.sleep(5000);
		WebElement frame1=driver.findElement(By.id("cvf-aamation-challenge-iframe"));
		driver.switchTo().frame(frame1);
		Thread.sleep(5000);
		WebElement textmsg=driver.findElement(By.xpath("//div[@class='a-row a-spacing-mini'][1]"));
		Assert.assertEquals(textmsg.getText().contains("puzzle"), true);
	}
	

}
