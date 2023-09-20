package test_Cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyColor1 {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = ("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(Url);
		driver.manage().window().maximize();
		
		// Get element color 
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		Color color1 = Color.fromString(color);
		String actuelColor = color1.asHex();
		Assert.assertEquals(actuelColor, "007bff");
		System.out.println("The background color is : " + actuelColor );
		
		driver.quit();
		
		
		

	}

}
