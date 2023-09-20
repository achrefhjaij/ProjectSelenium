package test_Cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demoqa.com/slider/";
		driver.get(url);
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		actions.moveToElement(slider, 30, 0).click().build().perform();
		// aller_retour
		// slider.click();
		System.out.println("Moved slider in Horizantal Direction");

		// assert
        String values = driver.findElement(By.id("sliderValue")).getAttribute("value");
		System.out.println("the values is  of the value attribute is : " + values);
		Assert.assertEquals("75", "values");
		System.out.println("Moved slider in horizental direction");
		
		driver.quit();

	}

}
