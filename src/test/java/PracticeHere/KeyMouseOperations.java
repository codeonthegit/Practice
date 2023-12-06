package PracticeHere;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyMouseOperations {
	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximise the window
		driver.get("https://magento.softwaretestingboard.com/"); //specify the URL of the webpage
	}

	@Test
	public void Tc001() {
		//driver.findElement(By.xpath("//div[@class=\"page-wrapper\"]/header/div/div/ul/li[2]/a")).click();
		//driver.findElement(By.id("email")).sendKeys("Robert@yopmail.com"); //specify the locator
		Actions act = new Actions(driver); //create an object for the Actions class and pass the driver argument 
		// act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform(); //Combination of keys
		
		// act.click(driver.findElement(By.xpath("//a[@class=\"action remind\"]/span"))).perform(); // mouse click() – clicks at the current location
		//act.doubleClick(driver.findElement(By.xpath("//a[@class=\"action remind\"]/span"))).perform(); // Mouse doubleClick() – performs a Double click at the current mouse location
		//act.contextClick(driver.findElement(By.xpath("//a[@class=\"action remind\"]/span"))).perform(); // Mouse contextClick() – performs a Right click at the current mouse location
		
		
		/* act.sendKeys(Keys.TAB).perform(); // key operations
		act.sendKeys("Team@123").perform();
		act.sendKeys(Keys.ENTER).perform(); */
		
		act.moveToElement(driver.findElement(By.xpath("//a[@id=\"ui-id-4\"]/span[2]"))).perform(); // mouse moveToElement(WebElement target) – moves to the target element
		driver.findElement(By.xpath("//a[@id=\"ui-id-4\"]/span[2]")).click();
		
	}
	
	

}
