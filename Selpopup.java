package p1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selpopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Components\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	
	/*to upload a file 
	 * driver.get("www.html.com/input-type-file/");
	 * driver.findElement(By.xpath("location").sendkeys(location of file in local depository); 
	 */
	
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.close();
	

	}

}
