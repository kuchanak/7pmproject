package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	
	
	static WebDriver driver;
	public Productpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement etext;
	
public static WebElement elementtext() {
		
		return etext;
	}
	
	
}
