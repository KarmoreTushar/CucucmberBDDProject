package webPages;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	@FindBy(id = "login_credentials")
	WebElement acceptedUsernameList;

	@FindBy(css = ".login_password")
	WebElement passwordForAllUser;
	
	@FindBy(css=".bm-burger-button")
	WebElement sideBarOpenMenu;
	
	@FindBy(css=".bm-item-list>a")
	List<WebElement> sideMenuList;

	public void enterUsername(String userName) {
		typeInput(username, userName);
	}

	public void enterPassword(String pass) {
		typeInput(password, pass);
	}

	public String[] accpetedUsernames() {
		String[] acceptedUserNames = acceptedUsernameList.getText().split("\n");
		return acceptedUserNames;
	}
	public String[] accpetedPassword() {
		String[] acceptedpass = passwordForAllUser.getText().split("\n");
		return acceptedpass;
	}
	public void clickOnLgnBtn() {
		loginBtn.click();
	}
	public void logOut() {
		sideBarOpenMenu.click();
		for(int i=0;i<sideMenuList.size();i++) {
			if(sideMenuList.get(i).getText().equals("Logout")) {
				clickOnElement(sideMenuList.get(i));
//				sideMenuList.get(i).click();
			}
		}
	}
	public String validateURL() {
		String url=getCurrentUrlOfApplication("inventory.html");
		return url;
	}
	
}
