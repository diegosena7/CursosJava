package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Java/DriversJava/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.getCurrentUrl();
	}
}

