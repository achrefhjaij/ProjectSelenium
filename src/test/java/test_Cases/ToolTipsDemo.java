package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipsDemo {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		WebElement ToolTip  = driver.findElement(By.id("toolTipButton"));
		String ToolTipsText = ToolTip.getText();
		
		// Check the tool tips of the button " Hover me to see "
		if (ToolTipsText.equals("Hover me to see")) {
			System.out.println("Pass : Tool Tips matching expected value");
			
		} 
		else {
				System.out.println("Fail : Tool Tips not match expected value");
		}
				//driver.quit();
				
			
				
		}

	}


