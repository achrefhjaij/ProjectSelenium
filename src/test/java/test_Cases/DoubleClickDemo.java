package test_Cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
		
		// Instantiate Actions Class
		Actions action = new Actions(driver);
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btnDoubleClick).perform();
		System.out.println("button is double cliked");
		
		String message  = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals("You have done a double click ", message);
		
		
		driver.quit ();

	}
	

}
