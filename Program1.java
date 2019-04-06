package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Components\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.Gmail.com";
		driver.get(url);
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
		
		}

}
