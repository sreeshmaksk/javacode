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

public class AddCartWithoutLogin extends BaseClass {
	@Test
    public void addingtoCartWithoutlogin() throws InterruptedException {
            
            SoftAssert s1=new SoftAssert();
            
        WebElement e2= driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
        e2.sendKeys("shoes");
       e2.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       List<WebElement>s=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
    WebElement shoe1=        s.get(0);
    shoe1.click();
    //shift to page
    Set<String>window=driver.getWindowHandles();
    List<String>list=new ArrayList<String>(window);
    Iterator<String>a=list.iterator();
    String p=a.next();
    String c=a.next();
    driver.switchTo().window(c);
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    WebElement Actual1=        driver.findElement(By.xpath("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1"));
    WebElement Actual2=        driver.findElement(By.name("proceedToRetailCheckout"));

    s1.assertEquals(Actual1.getText(), "Added to cart");
    s1.assertEquals(Actual2.isDisplayed(), true);


}
}
