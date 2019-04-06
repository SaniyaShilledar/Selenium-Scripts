package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelCustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Mobiles");
		
		/*driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'btn btn-prim gh-spr')]")).click();
		
		//we can use startwith() method also to find dynamic web elements.we can use endwith() method to find 
		a perticular id.*/
		
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		/*
		 * To count the links and texts on the text
		  for that we will use FindElements 
		 *inside the findElemnts will use tagName() method
		 */
		
	}

}
