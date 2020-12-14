package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	static WebDriver driver;
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(att="value") static WebElement user;
	
	@FindBy(linkText="POPULAR ITEMS") static WebElement popular;
	@FindBy(xpath="/html/body/div[3]/section/article[4]/div") static WebElement items;
	@FindBy(id="details_16") static WebElement tlink;
	@FindBy(id="details_10") static WebElement llink;
	@FindBy(id="details_21") static WebElement slink;

	
	public static WebElement tabletlink() {
		
		return tlink;
	}
	
	public static WebElement laptoplink() {
		
		return llink;
	}
	
	public static WebElement spklink() {
		
		return slink;
	}
	
	
	
public static WebElement populritem() {
	
	return popular;
}
public static WebElement popularblock() {
	
	return items;
}	
	
	
}
