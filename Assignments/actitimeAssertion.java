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

public class actitimeAssertion extends SeleniumUtility {
	WebDriver driver;
	List<WebElement> list;
	List<WebElement> taskList;
	List<String> validateTask() {
		taskList = driver.findElements(By.cssSelector(".tasksTableVerticalScrollContainer .title"));
		List<String> actualTaskName = new ArrayList<String>();
		for (int i = 0; i < taskList.size(); i++) {
			actualTaskName.add(taskList.get(i).getText());
		}
		System.out.println("Actuatal Task list: " + actualTaskName);
		return actualTaskName;
	}

	@Test(priority = 1, description = "Open browser and logiIn to ActiTime")
	public void logIn() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.TAB, Keys.ENTER);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.urlContains("user/submit_tt.do"));
		String expectedURL = "https://demo.actitime.com/user/submit_tt.do";
		String actualURL = driver.getCurrentUrl();
		System.out.println("Acrual URl is: " + actualURL);
		Assert.assertEquals(actualURL, expectedURL, "Home page validation is unsucessfull");
		WebElement logo = driver.findElement(By.id("logo_aT"));
		Assert.assertTrue(logo.isDisplayed(), "ActiTime logo is diplayed");
	}

	@Test(priority = 2)
	public void taskCreate() {
		// **********click on task menu, add new task and new tasks button********
		performClick(driver.findElement(By.id("container_tasks")));
		performClick(driver.findElement(By.xpath("//div[text()='Add New']")));
		performClick(driver.findElement(By.cssSelector(".createNewTasks")));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// *********select customer and project*************************
		// click on company drop-down
		performClick(driver.findElements(By.cssSelector(".customerOrProjectSelector .selectedItem")).get(0));
		// get company list
		list = driver.findElements(By.xpath("//div[div[@class='comboboxButton focused']]/div[2]//div[@class='searchItemList']/div"));
		// s1.performClick(customerNames.get(13)); //or
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equals("Big Bang Company")) {
				driver.findElements(By.xpath("//div[div[@class='comboboxButton focused']]/div[2]//div[@class='searchItemList']/div"));
				performClick(list.get(i));
			}
		}
		performClick(driver.findElements(By.cssSelector(".customerOrProjectSelector .selectedItem")).get(1));
		// get project list
		list = driver.findElements(By.xpath("//div[div[@class='comboboxButton focused']]/div[2]//div[@class='searchItemList']/div"));
		// performClick(projectNames.get(7)); //or
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equals("Flight operations")) {
				driver.findElements(By.xpath("//div[div[@class='comboboxButton focused']]/div[2]//div[@class='searchItemList']/div"));
				performClick(list.get(i));
			}
		}
		// ***********calender handling***************************
		performClick(driver.findElement(By.cssSelector("#ext-gen45"))); // click on set deadline
		performClick(driver.findElement(By.cssSelector(".x-date-right"))); // click on arrow for next month
		performClick(driver.findElement(By.cssSelector(".x-date-inner tbody>tr:nth-of-type(2)>td:nth-of-type(3) span"))); // click on 8
		// ************enter task name and the click on create task button******************
		// enter task name
		typeInput(driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child>input")),
				"Task_1_ActiTime");
		// click on create task button
		performClick(driver.findElement(By.xpath("//div[text()='Create Tasks']")));
		// ***********Verify task is created or not****************
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[text()='Task_1_ActiTime']")), "Task_1_ActiTime"));
		validateTask();
		Assert.assertTrue(validateTask().contains("Task_1_ActiTime"), "Task_1_ActiTime is not created");
		taskList.clear();
	}

	@Test(priority = 3)
	public void taskDelete() {
		// ***********delete task************************
		performClick(driver.findElement(By.xpath("//div[text()='Task_1_ActiTime']")));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".ext-chrome>div:nth-of-type(36) .action"))));
		performClick(driver.findElement(By.cssSelector(".ext-chrome>div:nth-of-type(36) .action")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ext-chrome>div:nth-of-type(36) .deleteButton")));
		performClick(driver.findElement(By.cssSelector(".ext-chrome>div:nth-of-type(36) .deleteButton")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ext-chrome>div:nth-of-type(36) .submitTitle")));
		performClick(driver.findElement(By.cssSelector(".ext-chrome>div:nth-of-type(36) .submitTitle")));
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		validateTask();
		Assert.assertFalse(validateTask().contains("Task_1_ActiTime"), "Task_1_ActiTime is not deleted");
		driver.close();
	}
}
