package commethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testbase.Browser;

public class Screenshot extends Browser{
	
	
	public static void schot() throws IOException {
		
		File scrsht= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrsht, new File("D:\\orderpage123.png"));
		
	}

}
