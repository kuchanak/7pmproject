package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import commethods.Extentrep;
import objrep.Homepage;
import testbase.Browser;

public class Popularitemscheck extends Browser {
	//static WebDriver driver;
	
	@Test
	public static void popitems() throws InterruptedException {
		Browser.lunchbrowser();
		
		Homepage hp= new Homepage(driver);
		Thread.sleep(10000);
		hp.populritem().click();
	int popularitemszie=	hp.popularblock().findElements(By.tagName("div")).size();
		
	//Assert.assertEquals(popularitemszie, 3);	
	
	Extentrep.setup();
	if(popularitemszie==5) {
		
		Extentrep.testpass();
		
	}else {
		
		Extentrep.testfail();
	}
		
	Extentrep.testflush();
	
	}
	
	

}
