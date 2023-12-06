package PracticeHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverCommands {
	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximise the window
		
		
	}
	@Test
	public void Tc001(){
		driver.get("https://www.thetestingworld.com/"); //specify the URL of the webpage
		//driver.navigate().to("https://www.google.com/");// Putting 2nd url -  It is used to navigate from one webpage to other webpage and load new URL/webpage in the existing window of browser
		driver.navigate().back(); //click on back button(arrow) of the browser window
		driver.navigate().forward(); // click on the forward button (arrow) of the browser window
		driver.navigate().refresh();// refresh/reloads the current webpage in the browser
		
		
		/* For dropdown
		 	Select country=new Select(driver.findelement(By.id("countryId")));
			country.selectByIndex(1);
			//country.selectByVisibleText("India"); // 3rd approach
			//country.deselectByIndex(1) //deselect is only use for list, we can not use for Dropdown
		 */
	}

}
