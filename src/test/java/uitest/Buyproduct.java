package uitest;

import java.io.IOException;

import org.testng.annotations.Test;

import commethods.Screenshot;
import objrep.Prodbuy;
import testbase.Browser;

public class Buyproduct extends Browser {
	
	@Test
	public static void buyp() throws InterruptedException, IOException {
		
		Browser.lunchbrowser();
		Thread.sleep(10000);
		Prodbuy pb= new Prodbuy(driver);
		pb.sploffer().click();
		Thread.sleep(5000);
		pb.seeofferbutton().click();
		Thread.sleep(5000);

		pb.addtocartbutton().click();
		pb.carticon().click();
		pb.checkoutbutton().click();
		pb.uname().sendKeys("kirank");
		pb.password().sendKeys("0123456kK");
		pb.loginbutton().click();
		Thread.sleep(5000);

		pb.nextbutton().click();
		pb.safeuser().clear();
		pb.safeuser().sendKeys("kirank");
		pb.ssafepwd().clear();
		pb.ssafepwd().sendKeys("123456hhH");
		Thread.sleep(5000);
		pb.pay().click();
		Thread.sleep(5000);
		String ordertex=pb.orderinfomation().getText();
		System.out.println(ordertex);
		Screenshot.schot();
		

		
	}
	

}
