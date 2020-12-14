package uitest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commethods.Excelmethod;
import commethods.Extentrep;
import commethods.Screenshot;
import objrep.Homepage;
import objrep.Productpage;
import testbase.Browser;

public class Populatimescheck extends Browser {
	static Productpage pp;
	static Homepage hp;
	@BeforeTest
	public static void setup() {
		Extentrep.setup();
		
		
	}
	@BeforeMethod
	public static void openapp() throws InterruptedException {
		Browser.lunchbrowser();
		Thread.sleep(10000);
		 hp= new Homepage(driver);
		hp.populritem().click();
	}
	@Test
public static void table() throws InterruptedException, IOException {
		Thread.sleep(5000);
	hp.tabletlink().click();
	 pp= new Productpage(driver);
	String tabactval=pp.elementtext().getText();
	String tabexpt=Excelmethod.readdata(3, 0);
	if(tabactval.contains(tabexpt)) {
		System.out.println("test is pass");
		Excelmethod.writedata(3, 1, "valid data");
		Extentrep.testpass();
		
	}else {
		
		System.out.println("test is fail");
		Excelmethod.writedata(3, 1, "invalid data");
		Screenshot.schot();
		Extentrep.testfail();
	}
	
		
	
}
	@Test
	public static void laptop() throws IOException, InterruptedException {
		hp.laptoplink().click();
		pp= new Productpage(driver);
	String lapactval=	pp.elementtext().getText();
	String lapexpt=Excelmethod.readdata(1, 0);

	if(lapactval.contains(lapexpt)) {
		
		System.out.println("valid data");
		Excelmethod.writedata(1, 1, "valid data");
		Extentrep.testpass();
	} else {
		
		System.out.println("valid data");
		Excelmethod.writedata(1, 1, "invalid data");
		Screenshot.schot();

		Extentrep.testfail();
		
	}
	
	
	
	}
	
	@Test
	public static void spekr() throws IOException, InterruptedException {
		
	
		hp.laptoplink().click();
		pp= new Productpage(driver);
	String spkact=	pp.elementtext().getText();
	String spkexp=Excelmethod.readdata(2, 0);

	if(spkact.contains(spkexp)) {
		
		System.out.println("valid data");
		Excelmethod.writedata(2, 1, "valid data");
		Extentrep.testpass();
	} else {
		
		System.out.println("valid data");
		Excelmethod.writedata(2, 1, "invalid data");
		Screenshot.schot();

		Extentrep.testfail();
		
	}
		
		
	}
	
	@AfterMethod
	public static void after() {
		driver.close();
		
	}
	
	@AfterTest
	public static void endtest() {
		
		Extentrep.testflush();
		
	}
	
	
	
}
