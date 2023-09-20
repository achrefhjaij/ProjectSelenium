package test_Cases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resoureces\\drivers\\chromedriver.exe");

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// delate cookies
		driver.manage().deleteAllCookies();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL swaglabs
		driver.get("https://www.saucedemo.com/");

		// Maximaise browser
		driver.manage().window().maximize();

		// Fill login
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Fill user name
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Click on login button
		// driver.findElement(By.id("login-button")).click();

		// click on login button with Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnlogin;
		btnlogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		btnlogin.click();

		// Check if Product Display in home page 
		String products = driver.findElement(By.xpath("//span[contains(text(),'Products'))")).getText();
		Assert.assertEquals("Products", products);

		// Print a log in login button
		System.out.println("successfully authentification");

		// close browser // kill session
		// driver.quit();

	}

}
