package stepDefinitions;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webPages.LoginPage;

public class loginStepDefinition extends SeleniumUtility {
//	@Before 
//	public void logSetUp() {
//		
//	}

	Logger loginLogs;
	LoginPage lgnPage;

	@When("User is already on login page")
	public void user_is_already_on_login_page() {
		setUp("chrome", "https://www.saucedemo.com/v1/");
		loginLogs = getLogs("loginStepDefinition");
		loginLogs.info("##################Browser is launched and url is open#################################333");
	}

	@When("user enter username from accepted {string} and {string} from password for all users")
	public void user_enter_username_from_accepted_usernames_and_password_from_password_for_all_users(String userName,
			String pass) {
		lgnPage = new LoginPage(driver);
		lgnPage.enterUsername(userName);
		lgnPage.enterPassword(pass);
		lgnPage.clickOnLgnBtn();
		loginLogs.info(
				"##################Username and password is enter and clicked on login button#################################333");
	}

	@Then("Verify that the user is navigate to inventory page")
	public void verify_that_the_user_is_navigate_to_inventory_page() {
		String expectedUrl = "https://www.saucedemo.com/v1/inventory.html";
		Assert.assertEquals(lgnPage.validateURL(), expectedUrl);
		lgnPage.logOut();
		loginLogs.info("##################logout is done#################################333");
	}
//	@After
//	public void tearDown() {
//		driver.close();
//	}

	@After
	public void snapshot(Scenario sc) {
		if (sc.isFailed()) {
			takeScreenShotOfThePage(".\\ScreenShots_" + System.currentTimeMillis() + ".jpg");
		}
	}
}
