package Module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver        driver=new EdgeDriver();
         driver.get("https://grotechminds.com/registration/");
         Thread.sleep(2000);
         driver.manage().window().maximize();
         WebElement e1=        driver.findElement(By.id("file"));
         e1.sendKeys("C:/Users/Rajeev/Documents/test.pdf");
	}

}
