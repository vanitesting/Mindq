package Utilies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Basepackage.BaseClass;

public class RepotingManager {
	public static String captureScreenShot() throws IOException
	{
		TakesScreenshot tc=((TakesScreenshot)BaseClass.driver);
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C://data//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(scrfile, destfile);
		String srcpath=destfile.getAbsolutePath();
		
		return srcpath;
		
	}

}
