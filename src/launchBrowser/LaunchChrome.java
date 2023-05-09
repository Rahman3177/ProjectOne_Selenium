package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chromer.driver", "driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("http://www.google.com");
//			driver.get("https://www.qatarairways.com/");
			driver.get("http://www.emirates.com");
	//		driver.get("https://techfios.com/portal/login");
			
			
/*			Thread.sleep(3000);
			driver.close();
			driver.quit();
*/		
	}

}
