package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelHandleFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Components\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.freecrm.com/");
			
			driver.findElement(By.name("username")).sendKeys("naveenk");
			driver.findElement(By.name("username")).sendKeys("test@123");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(5000);
			
			driver.switchTo().frame("mainpanel");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[contains(text(),''contacts)]")).click();
			Thread.sleep(5000);
			
			
			
			
	}

}
