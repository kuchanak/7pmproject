package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prodbuy {
	
	static WebDriver driver;
	public Prodbuy(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="SPECIAL OFFER") static WebElement splofr;
	@FindBy(id="see_offer_btn") static WebElement seeoffer;
	@FindBy(name="save_to_cart") static WebElement addcart;
	@FindBy(id="menuCart") static WebElement mcart;
	@FindBy(id="checkOutButton") static WebElement checkout;
	@FindBy(name="usernameInOrderPayment") static WebElement username;
	@FindBy(name="passwordInOrderPayment") static WebElement pwd;
	@FindBy(id="login_btnundefined") static WebElement login;
	@FindBy(id="next_btn") static WebElement nextb;
	@FindBy(name="safepay_username") static WebElement safepayusername;
	@FindBy(name="safepay_password") static WebElement safepaypassword;
	@FindBy(id="pay_now_btn_SAFEPAY") static WebElement paynow;
	@FindBy(xpath="//*[@id=\"orderPaymentSuccess\"]/p") static WebElement orderinfo;


public static WebElement sploffer() {
	
	return splofr;
}
public static WebElement seeofferbutton() {
	
	return seeoffer;
}

public static WebElement addtocartbutton() {
	
	return addcart;
}	

public static WebElement carticon() {
	
	return mcart;
}	
	
public static WebElement checkoutbutton() {
	
	return checkout;
}	

public static WebElement uname() {
	
	return username;
}	
	
public static WebElement password() {
	
	return pwd;
}	
	
public static WebElement loginbutton() {
	
	return login;
}	
public static WebElement nextbutton() {
	
	return nextb;
}

public static WebElement safeuser() {
	
	return safepayusername;
}
	
public static WebElement ssafepwd() {
	
	return safepaypassword;
}	

public static WebElement pay() {
	
	return paynow;
}

public static WebElement orderinfomation() {
	
	return orderinfo;
}

}
