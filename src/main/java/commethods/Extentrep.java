package commethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrep {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	static ExtentTest test;
	
	public static void setup() {
		
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test=extent.createTest("MyFirstTest");
		
}
	
	public static void testpass() {
		test.pass("test is pass");
		
	}

	public static void testfail() throws InterruptedException {
		
		test.fail("test is failed");
		Thread.sleep(5000);
		test.addScreenCaptureFromPath("D:\\errorsc124.png");
	}
	
	public static void testflush() {
		extent.flush();
		
	}
	
}
