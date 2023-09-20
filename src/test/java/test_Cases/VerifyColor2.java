package test_Cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyColor2 {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = "https://demoqa.com/buttons";
		driver.get(Url);
		driver.manage().window().maximize();
		
		// Get elelment colot 
		
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("color");
		String[] hexValue = color.replace("rgba(","").replace(")", "").split(",");
		
	    int hexValue1 = Integer.parseInt(hexValue[0]);
	    hexValue[1]= hexValue[1].trim();
	    
	    int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2]= hexValue[2].trim();
		
		int hexValue3 = Integer.parseInt(hexValue[2]);
		
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		Assert.assertEquals("#ffffff", actualColor);
		
		System.out.println("the color of the button is: "  + actualColor );
		
		driver.quit();
	}

}
