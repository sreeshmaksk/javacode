package amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CoupenCode extends BaseClass{
	@Test(dataProvider="inputdetails")
    public void coupenCode(String username,String password) throws InterruptedException {
            
            SoftAssert s1=new SoftAssert();
            WebElement e1=driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
    		Actions a1=new Actions(driver);
    		a1.moveToElement(e1).perform();
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("Sign in")).click();
        WebElement num=driver.findElement(By.xpath("//input[@name='email']"));
        num.sendKeys(username);
        driver.findElement(By.xpath("//span[@id='continue']")).click();
        Thread.sleep(2000);
        
        WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys(password);
       driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        WebElement e2= driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
        e2.sendKeys("shoes");
       e2.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       List<WebElement>s=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
    WebElement shoe1=        s.get(1);
    shoe1.click();
  
    Set<String>window=driver.getWindowHandles();
    List<String>list=new ArrayList<String>(window);
    Iterator<String>a=list.iterator();
    String p=a.next();
    String c=a.next();
    driver.switchTo().window(c);
    Thread.sleep(2000);
    WebElement qty=driver.findElement(By.xpath("//select[@name='quantity']"));
    Select qt=new Select(qty);
    qt.selectByIndex(0);
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    driver.findElement(By.name("proceedToRetailCheckout")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("ppw-claimCode")).sendKeys("7896");
    driver.findElement(By.name("ppw-claimCodeApplyPressed")).click();
    Thread.sleep(2000);
    WebElement assert1=driver.findElement(By.xpath("//p[text()='The promotional code you entered is not valid.']"));
    s1.assertEquals(assert1.getText(), "The promotional code you entered is not valid.");
    s1.assertAll();
}
}
