package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceHolderDemo {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();

		WebElement placeHoder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHoder.getAttribute("placeHoder");
		System.out.println("The place holder is : " + textPlaceHolder);
		// driver.quit();

	}

}
