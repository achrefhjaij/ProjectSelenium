package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KyBordEvent {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = "https://kodingwindow.com/testapp/";
		driver.get(Url);
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));

		userName.sendKeys("kodingwindow");
		userName.sendKeys(Keys.CONTROL, "a");
		userName.sendKeys(Keys.CONTROL, "c");
		password.sendKeys(Keys.CONTROL, "v");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		driver.quit();		}

}
