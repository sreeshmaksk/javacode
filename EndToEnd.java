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

public class EndToEnd extends BaseClass {
	@Test(dataProvider="inputdetails")
    public void overallFlow(String username,String password) throws InterruptedException {
            
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
    
    driver.findElement(By.linkText("Change")).click();
    Thread.sleep(5000);
    /*driver.findElement(By.xpath("//a[@id='add-new-address-desktop-sasp-tango-link']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("Sreeshma K");
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("8169507633");
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']")).sendKeys("695582");
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']")).sendKeys("pgra-10, Pragathi gardens");
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']")).sendKeys("Pallinad,Kazhakootam");
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressCity']")).sendKeys("Kazhakootam");
    driver.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']")).sendKeys("Railway station road");
    WebElement State=driver.findElement(By.xpath("//Select[@name='address-ui-widgets-enterAddressStateOrRegion']"));
    Select selct=new Select(State);
    selct.selectByVisibleText("KERALA");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='pagelet-layout-section']/span/span/span/input")).click();*/
    driver.findElement(By.xpath("(//input[@name='destinationSubmissionUrl']/following-sibling::i)[2]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='shipping-address-selection-panel-card-id']/descendant::input[@type='submit']")).click();
    Thread.sleep(5000);
    WebElement as1=driver.findElement(By.xpath("//span[@id='deliver-to-address-text']"));
    s1.assertEquals(as1.getText().contains("pgra-10"), true);
    driver.findElement(By.xpath("//span[text()='Cash on Delivery/Pay on Delivery']/ancestor::label/input[@type='radio']")).click();
    Thread.sleep(2000);
    WebElement as2=driver.findElement(By.xpath("//div[@id='checkout-paymentOptionPanel']/descendant::input[@aria-labelledby='checkout-primary-continue-button-id-announce']"));
    s1.assertEquals(as2.isEnabled(),true);
    as2.click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@id='bottomSubmitOrderButtonId']/descendant::input[@id='placeOrder']")).click();
}
}

