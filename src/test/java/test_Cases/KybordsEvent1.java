package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KybordsEvent1 {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = "https://demoqa.com/text-box";
		driver.get(Url);
		driver.manage().window().maximize();

		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

		fullName.sendKeys("achrefhjaij");
		userEmail.sendKeys("hjaij.achref@gmail.com");
		currentAddress.sendKeys("66 rue hadi nouira h-lif");

		currentAddress.sendKeys(Keys.CONTROL, "a");
		currentAddress.sendKeys(Keys.CONTROL, "c");
		permanentAddress.sendKeys(Keys.CONTROL, "v");

		// btnLogin.click();

		// driver.quit();

		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSubmit);

		//driver.quit();
		
		

	}

}
