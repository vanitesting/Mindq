package Basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void applicationlaunch()
	{
		WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		
		driver.get("https://studio.cucumber.io/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void closeBrowser()
	{
		driver.close();
	}

}
