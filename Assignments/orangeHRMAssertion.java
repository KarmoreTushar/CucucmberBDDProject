package allAssignmentWithAssertion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
	
public class orangeHRMAssertion extends SeleniumUtility{
	static String str=".\\src\\test\\resources\\orangeHRMData\\orangeHRMData.properties";
	WebDriver driver;
	List<WebElement> list;
	WebElement element;
  @Test(priority=1)
  public void logIn() {
	  	driver=setUp("chrome", getValueFromPropertyFile(str, "url"));
		typeInput(driver.findElement(By.name("username")), getValueFromPropertyFile(str, "id"));
		driver.findElement(By.name("password")).sendKeys(getValueFromPropertyFile(str, "pass"),Keys.ENTER);
		//validate home page
		String expectedTitle="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		wait.until(ExpectedConditions.urlContains("/dashboard/index"));
		String actualTitle=driver.getCurrentUrl();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page validation is unsucessfull");
  }
  @Test(priority=2)
  public void createPIM() {
	  	performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		performClick(driver.findElement(By.cssSelector(".bi-plus")));
		//*****************add all credentials*********************
		typeInput(driver.findElement(By.name("firstName")), getValueFromPropertyFile(str, "fName"));
		typeInput(driver.findElement(By.name("middleName")), getValueFromPropertyFile(str, "mName"));
		typeInput(driver.findElement(By.name("lastName")), getValueFromPropertyFile(str, "lName"));
		driver.findElement(By.cssSelector(".oxd-grid-2 input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
		typeInput(driver.findElement(By.cssSelector(".oxd-grid-2 input")),getValueFromPropertyFile(str, "empId"));
		performClick(driver.findElement(By.xpath("//button[@type='submit']"))); 
		//**************validate whether PIM is created or not***********************
		wait.until(ExpectedConditions.urlContains("/pim/viewPersonalDetails/empNumber/"));
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));//click on PIM
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		list=driver.findElements(By.xpath("//div[@role='table']/div[2]/div/div/div[2]/div")); //list of all id's
		List<String> actualTaskName = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			actualTaskName.add(list.get(i).getText());
		}
		Assert.assertTrue(actualTaskName.contains(getValueFromPropertyFile(str, "empId")), "EmpId 5055 is not present");
		list.clear();
  }
  @Test(priority=3)
  public void updatePIM() {
	  //search id
	  	typeInput(driver.findElement(By.cssSelector(".oxd-form-row input.oxd-input")), getValueFromPropertyFile(str, "empId"));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oxd-button:nth-of-type(2)")));
		performClick(driver.findElement(By.cssSelector(".oxd-button:nth-of-type(2)"))); // search btn
		//***************click on edit button**********************
		performClick(driver.findElement(By.cssSelector(".oxd-table-card .bi-check")));// click on check box
		performClick(driver.findElement(By.cssSelector(".bi-pencil-fill")));// click on pencil to update
		//*******************to select job title in the drop-down*****************
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		performClick(driver.findElement(By.xpath("//a[text()='Job']")));// click on job tab
		//wait.until(ExpectedConditions.urlContains("/pim/viewJobDetails/"));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div i"))));
		element=driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div i"));//click on the job title arrow
		element.click();
		for(int i=0;i<100;i++) {
			element=driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div i"));
			action.moveToElement(element).sendKeys(Keys.ARROW_DOWN);
			list=driver.findElements(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div"));
		for (int j = 0; j < list.size(); j++) {
			if(list.get(j).getText().equals("QA Engineer")) {
				wait.until(ExpectedConditions.textToBePresentInElement(list.get(j), "QA Engineer"));
				list.get(j).click();
				break;														//setTimeout(function(){debugger;}, 5000)
			}}
				break;
		}
		performClick(driver.findElement(By.xpath("//button[@type='submit']")));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));//click on PIM
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//div[div[div[text()='5055']]]/div[5]/div")).getText().equals("QA Engineer"), "Job title is not updated");
		list.clear();
		
  }
  @Test(priority=4)
  public void deletePIM() {
	  	performClick(driver.findElement(By.xpath("//span[text()='PIM']")));//click on PIM
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//*****************search id and click on search button******************************
		typeInput(driver.findElement(By.cssSelector(".oxd-form-row input.oxd-input")), getValueFromPropertyFile(str, "empId"));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oxd-button:nth-of-type(2)")));
		performClick(driver.findElement(By.cssSelector(".oxd-button:nth-of-type(2)"))); // search btn
		//click on the chec-kbox
		// check box click
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".orangehrm-container .oxd-table-cell>div")));
		driver.findElement(By.cssSelector(".orangehrm-container .oxd-table-cell>div")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".bi-trash")));
		// delete btn click
		performClick(driver.findElement(By.cssSelector(".bi-trash")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='document']/div[3]/button[2]/i")));     
		performClick(driver.findElement(By.xpath("//div[@role='document']/div[3]/button[2]/i")));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));//click on PIM
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		list.clear();
		list=driver.findElements(By.xpath("//div[@role='table']/div[2]/div/div/div[2]/div")); //list of all id's
		List<String> actualTaskName = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			actualTaskName.add(list.get(i).getText());
		}
		Assert.assertFalse(actualTaskName.contains(getValueFromPropertyFile(str, "empId")), "EmpId 5055 is present");
		driver.close();
  }
}
//validate by flash msg
//for delete flash msd -->		.oxd-toast-start p.oxd-text--toast-message   or #oxd-toaster_1>div>div>div:nth-of-type(2)>p:nth-of-type(2)
//		element=driver.findElement(By.cssSelector(".oxd-toast-start p.oxd-text--toast-message"));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".oxd-toast-start p.oxd-text--toast-message")));   	
//		if (element.isDisplayed()) {
//			System.out.println("PIM id 5055 is "+element.getText());
//		}
//		else {
//			System.out.println("PIM id 5055 is failed to delete");
//		}