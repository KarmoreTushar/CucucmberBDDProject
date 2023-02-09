package allAssignmentWithAssertion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
	
public class vTigerAssertion extends SeleniumUtility{
	String str=".\\src\\test\\resources\\testDataForVTiger\\appDataVtiger.properties";
	WebDriver driver;
	List<WebElement> list;
  @Test (priority=1)
  public void logIn() {
	  	driver=setUp("chrome", getValueFromPropertyFile(str, "appUrl"));
		//insert id and password and click on signin btn
		typeInput(driver.findElement(By.id("username")), getValueFromPropertyFile(str, "username"));
		typeInput(driver.findElement(By.id("password")), getValueFromPropertyFile(str, "pass"));
		performClick(driver.findElement(By.xpath("//button[text()='Sign in']")));
  }
  @Test(priority=2)
  public void createLead() {
	  performClick(driver.findElement(By.id("appnavigator")));
		performClick(driver.findElement(By.cssSelector(".app-list>div:nth-of-type(2)")));   //or-->  "//span[text()=' MARKETING']"
		performClick(driver.findElement(By.cssSelector("#mCSB_1_container>li:nth-of-type(2)>a")));
		performClick(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//data enter
		//click on arrow of prefix
		performClick(driver.findElement(By.cssSelector("#s2id_autogen1 b")));//arrow
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("#select2-results-2>li>div"))));
		list=driver.findElements(By.cssSelector("#select2-results-2>li>div"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals(getValueFromPropertyFile(str, "prefix"))){
				performClick(list.get(i));
				break;
			}}
		list.clear();
		typeInput(driver.findElement(By.name("firstname")), getValueFromPropertyFile(str, "fName"));
		typeInput(driver.findElement(By.name("lastname")), getValueFromPropertyFile(str, "lName"));
		typeInput(driver.findElement(By.name("phone")), getValueFromPropertyFile(str, "pPhone"));
		typeInput(driver.findElement(By.name("company")), getValueFromPropertyFile(str, "company"));
		typeInput(driver.findElement(By.name("mobile")), getValueFromPropertyFile(str, "mPhone"));
		typeInput(driver.findElement(By.name("designation")), getValueFromPropertyFile(str, "designation"));
		typeInput(driver.findElement(By.name("fax")), getValueFromPropertyFile(str, "fax"));
		
		//select lead source
		performClick(driver.findElement(By.cssSelector("#s2id_autogen3 b")));//arrow
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("#select2-results-4>li>div"))));
		list=driver.findElements(By.cssSelector("#select2-results-4>li>div"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals(getValueFromPropertyFile(str, "leadSource"))){
				performClick(list.get(i));
				break;
			}}
		list.clear();
		typeInput(driver.findElement(By.name("email")), getValueFromPropertyFile(str, "pEmail"));
		
		//industry 
		performClick(driver.findElement(By.cssSelector("#s2id_autogen5 b")));//arrow
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("#select2-results-6>li>div"))));
		list=driver.findElements(By.cssSelector("#select2-results-6>li>div"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals(getValueFromPropertyFile(str, "industry"))){
				performClick(list.get(i));
				break;
			}}
		list.clear();
		typeInput(driver.findElement(By.name("website")), getValueFromPropertyFile(str, "website"));
		typeInput(driver.findElement(By.name("annualrevenue")), getValueFromPropertyFile(str, "aRevenue"));
		//Lead status
		performClick(driver.findElement(By.cssSelector("#s2id_autogen7 b")));//arrow
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("#select2-results-8>li>div"))));
		list=driver.findElements(By.cssSelector("#select2-results-8>li>div"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals(getValueFromPropertyFile(str, "leadStatus"))){
				performClick(list.get(i));
				break;
			}}
		list.clear();
		typeInput(driver.findElement(By.name("noofemployees")), getValueFromPropertyFile(str, "nOfEmp"));
		typeInput(driver.findElement(By.name("secondaryemail")), getValueFromPropertyFile(str, "sEmai"));
		typeInput(driver.findElement(By.name("lane")), getValueFromPropertyFile(str, "street"));
		typeInput(driver.findElement(By.name("pobox")), getValueFromPropertyFile(str, "pBox"));
		typeInput(driver.findElement(By.name("code")), getValueFromPropertyFile(str, "pCode"));
		typeInput(driver.findElement(By.name("city")), getValueFromPropertyFile(str, "city"));
		typeInput(driver.findElement(By.name("country")), getValueFromPropertyFile(str, "country"));
		typeInput(driver.findElement(By.name("state")), getValueFromPropertyFile(str, "state"));
		typeInput(driver.findElement(By.name("description")), getValueFromPropertyFile(str, "description"));
		//click on save button
		performClick(driver.findElement(By.xpath("//button[text()='Save']")));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		performClick(driver.findElement(By.cssSelector("#mCSB_8_container>ul:nth-of-type(2)")));//click on lead side menu
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//validate is lead keval is present or not
		list=driver.findElements(By.cssSelector("tbody.overflow-y>tr>td:nth-of-type(2) a")); //list of all lead names
		List<String> actualTaskName = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			actualTaskName.add(list.get(i).getText());
		}
		Assert.assertTrue(actualTaskName.contains(getValueFromPropertyFile(str, "fName")), "Lead Keval is not present");
		list.clear();
  }	
  @Test(priority=3)
  public void update() {
	  		//edit
			//click on three dot
			waitTillElementIsClickable(driver.findElement(By.cssSelector(".more i")));
			performClick(driver.findElement(By.cssSelector(".more i")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#page>ul:nth-of-type(3)>li:nth-of-type(2)")));
			performClick(driver.findElement(By.cssSelector("#page>ul:nth-of-type(3)>li:nth-of-type(2)"))); //click on edit
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			typeInput(driver.findElement(By.name("company")), getValueFromPropertyFile(str, "compEdit"));
			//click on save button
			performClick(driver.findElement(By.xpath("//button[text()='Save']")));
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			//validate is lead company name is updated or not
			Assert.assertTrue(driver.findElement(By.xpath("//tr[td[span[span[a[text()='Keval']]]]]/td[4]/span/span")).getText().equals(getValueFromPropertyFile(str, "compEdit")), "Company name is nor uppdated");
		  }

  @Test(priority=4)
  public void delete() {
	  list=driver.findElements(By.cssSelector("tbody.overflow-y>tr>td:nth-of-type(2) a")); //list of all lead names
	  for(int i=0;i<list.size();i++) {
		 if(list.get(i).getText().equals(getValueFromPropertyFile(str, "fName"))){
			  list.get(i).click();
		  }
	  }
	  list.clear();
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  performClick(driver.findElement(By.cssSelector(".btn-toolbar>div .dropdown-toggle")));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Delete Lead']")));
	  performClick(driver.findElement(By.xpath("//a[text()='Delete Lead']")));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']")));
	  performClick(driver.findElement(By.xpath("//button[text()='Yes']")));
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  list=driver.findElements(By.cssSelector("tbody.overflow-y>tr>td:nth-of-type(2) a")); //list of all lead names
	  List<String> actualTaskName = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			actualTaskName.add(list.get(i).getText());
		}
		Assert.assertFalse(actualTaskName.contains(getValueFromPropertyFile(str, "fName")), "Lead Keval is not deleted");
		driver.close();
  }
}



	
	
