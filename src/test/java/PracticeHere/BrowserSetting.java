package PracticeHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetting {
	WebDriver driver;

	@Test
	public void test1() {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		/*
		 * Google chrome browser System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\ManjiriGosavi\\Downloads\\IMP\\Drivers\\chromedriver_win32\\chromedriver.exe"
		 * ); driver=new ChromeDriver();
		 */

		/*
		 * Mozilla firefox browser System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\ManjiriGosavi\\Downloads\\IMP\\Drivers\\geckodriver_win32\\geckodriver.exe"
		 * ); driver=new FirefoxDriver();
		 */

		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		/*
		 * microsoft egde browser System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\ManjiriGosavi\\Downloads\\IMP\\Drivers\\edgedriver_win32\\
		 * edgedriver.exe driver = new EdgeDriver();
		 */

		driver.get("https://www.google.co.in/");

	}

}
