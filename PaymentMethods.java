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
import org.testng.annotations.Test;
public class PaymentMethods extends BaseClass
{
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
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@name='destinationSubmissionUrl']/following-sibling::i)[2]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='shipping-address-selection-panel-card-id']/descendant::input[@type='submit']")).click();
    Thread.sleep(5000);
    WebElement as1=driver.findElement(By.xpath("//span[@id='deliver-to-address-text']"));
    s1.assertEquals(as1.getText().contains("pgra-10"), true);
    WebElement payment1=driver.findElement(By.xpath("//span[text()='Cash on Delivery/Pay on Delivery']/ancestor::label/input[@type='radio']"));
    payment1.click();
    s1.assertEquals(payment1.isSelected(),true);
    Thread.sleep(2000);
    WebElement payment2=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
    payment2.click();
    s1.assertEquals(payment2.isSelected(),true);
    Thread.sleep(2000);
    WebElement payment3=driver.findElement(By.xpath("//div[@aria-label='ICICI Bank ..**98']/descendant::input[@type='radio']"));
    payment3.click();
    s1.assertEquals(payment3.isSelected(),true);
    Thread.sleep(2000);
    WebElement payment4=driver.findElement(By.xpath("//span[text()='Net Banking']/ancestor::label/input[@type='radio']"));
    payment4.click();
    WebElement slt= driver.findElement(By.name("ppw-bankSelection_dropdown"));
    Thread.sleep(2000);
    Select s2=new Select (slt);
    s2.selectByVisibleText("ICICI Bank");
    s1.assertEquals(payment4.isSelected(),true);
    Thread.sleep(2000);
    
    WebElement payment5=driver.findElement(By.xpath("//div[@aria-label='Scan and Pay with ']/descendant::input[@type='radio']"));
    payment5.click();
    s1.assertEquals(payment5.isSelected(),true);
    Thread.sleep(2000);
    WebElement payment6=driver.findElement(By.xpath("//div[@aria-label='Other UPI Apps']/descendant::input[@type='radio']"));
    payment6.click();
    s1.assertEquals(payment6.isSelected(),true);
    Thread.sleep(2000);
    WebElement payment7=driver.findElement(By.xpath("//span[text()='EMI']/ancestor::label/input[@type='radio']"));
    payment7.click();
    s1.assertEquals(payment7.isSelected(),true);
    Thread.sleep(2000);
    WebElement slt1=driver.findElement(By.name("ppw-emiCreditCardSelection"));
    Select s3=new Select (slt1);
    Thread.sleep(2000);
    s2.selectByVisibleText("Add a new card");
    WebElement payment8=	driver.findElement(By.xpath("//span[text()='Amazon accepts all major credit &  cards'])[1]"));
    payment8.click();
    s1.assertEquals(payment8.isSelected(),true);
}
}
