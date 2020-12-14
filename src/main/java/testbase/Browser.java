package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	static String browser = "firefox";
	public static WebDriver driver;
	public static void lunchbrowser() {
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
	}

}
