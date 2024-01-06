package Pagepackage;

import org.openqa.selenium.By;

import Basepackage.BaseClass;

public class PageLogin extends BaseClass {
	public static By emailid=By.xpath("//input[@id='user_email']");
	public static By pwdid=By.xpath("//input[@id='user_password']");
	public static By submitbutton=By.xpath("//input[@name='commit']");
	public static By invaliderrorMessage=By.xpath("//p[text()='Invalid email or password.']");
	public static void enterEmail(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}
	public static void enterPassword(String pwd)
	{
		driver.findElement(pwdid).sendKeys(pwd);
	}
	public static void submit()
	{
		driver.findElement(submitbutton).click();
	}
	public static String captureInvalidErrorMessage()
	{
		String text=driver.findElement(invaliderrorMessage).getText();
		return text;
	}
}


