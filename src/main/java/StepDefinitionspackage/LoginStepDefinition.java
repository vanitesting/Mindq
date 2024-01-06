package StepDefinitionspackage;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Pagepackage.PageLogin;
import Utilies.RepotingManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends PageLogin {
   @Given("^user is in login page$")
	public void user_is_in_login_page() throws IOException
	{
		applicationlaunch();	
        ExtentCucumberAdapter.addTestStepLog("application launched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(RepotingManager.captureScreenShot());
	}
	@When("^user enter email id \"([^\"]*)\"$")
	public void user_enter_email_id(String emailid) throws IOException
	{
	enterEmail(emailid);
	ExtentCucumberAdapter.addTestStepLog("User enters emailid successfully"+emailid);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(RepotingManager.captureScreenShot());
	}
	@And("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String pwd) throws IOException
	{
		enterPassword(pwd);
		ExtentCucumberAdapter.addTestStepLog("user enters poassword successfully"+pwd);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(RepotingManager.captureScreenShot());
	}
	@And("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws IOException
	{
		submit();
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(RepotingManager.captureScreenShot());
	}
	@Then("^close application$")
	public void close_application()
	{
		closeBrowser();
	}
	@Then("^User should see error message on the screen$")
    public void user_should_see_error_message_on_the_screen()  {
        
    	String actual = captureInvalidErrorMessage().trim();
    	String expected = "Invalid email or password.";
    	SoftAssert sa = new SoftAssert();
    	
    	sa.assertEquals(actual, expected);
    	sa.assertAll();
    	
    	
    	
    }
	

}
