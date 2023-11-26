package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;
public class InventoryPage extends SeleniumUtility{
	
	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[div[a[div[text()='Sauce Labs Backpack']]]]/div[3] /button")
	WebElement sauceLabBackpackAddToCartBtn;
	
	@FindBy(css=".shopping_cart_link")
	WebElement cartButton;
	
	@FindBy(css=".inventory_item_name")
	WebElement inventoryItemName;
	
	@FindBy(css="a.btn_secondary")
	WebElement continueShopping;
	
	public void addToCart() {
		clickOnElement(sauceLabBackpackAddToCartBtn);
		clickOnElement(cartButton);
//		sauceLabBackpackAddToCartBtn.click();
//		cartButton.click();
		
	}

	public WebElement getInventoryItemName() {
		return inventoryItemName;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}
}
