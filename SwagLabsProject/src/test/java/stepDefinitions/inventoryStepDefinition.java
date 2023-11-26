package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webPages.InventoryPage;
import webPages.LoginPage;

public class inventoryStepDefinition extends SeleniumUtility {
	LoginPage getLoginPage;
	InventoryPage getInventoryPage;
	Logger inventoryLogs;
//	Logger logs;
	@When("user enter username and password and click on login btn")
	public void user_enter_username_and_password_and_click_on_login_btn() {
//		logs=LogManager.getLogger("inventoryStepDefinition");
		inventoryLogs=getLogs("inventoryStepDefinition");
		getLoginPage = new LoginPage(driver);
		String[] allAcceptedUserNames = getLoginPage.accpetedUsernames();
		String[] acceptedPwd = getLoginPage.accpetedPassword();
		getLoginPage.enterUsername(allAcceptedUserNames[1]);
		getLoginPage.enterPassword(acceptedPwd[1]);
		getLoginPage.clickOnLgnBtn();
	}

	@Then("Verify that user is on inventory page")
	public void Verify_that_user_is_on_inventory_page() {
		String expectedUrl="https://www.saucedemo.com/v1/inventory.html";
		Assert.assertEquals(getLoginPage.validateURL(), expectedUrl);
		inventoryLogs.info("###########Verify inventory page is completed####################");
	}

	@When("user click on add to cart button of Sauce Lab Backpack")
	public void user_click_on_add_to_cart_button_of_sauce_lab_backpack() {
		getInventoryPage=new InventoryPage();
		getInventoryPage.addToCart();
	}

	@Then("Verify that sauce Lab Backpack product is added to the cart")
	public void verify_that_sauce_lab_backpack_product_is_added_to_the_cart() {
		Assert.assertTrue(getInventoryPage.getInventoryItemName().getText().equals("Sauce Labs Backpack"));
		inventoryLogs.info("Verify Sauce Labs Backpack is completed");
	}

	@Then("Click on continue shopping link")
	public void click_on_continue_shopping_link() {
		getInventoryPage.getContinueShopping().click();
		inventoryLogs.info("Click on continue button is successful");
	}
//	@After
//	public void tearDown() {
//		driver.close();
//	}
	@After
	public void snapshot(Scenario sc) {
	if (sc.isFailed()) {
		takeScreenShotOfThePage(".\\ScreenShots\\ScreenShots_"+System.currentTimeMillis()+".jpg");
		inventoryLogs.info("Screenshot of failed test case is teken and saved");
	}
	}
}
