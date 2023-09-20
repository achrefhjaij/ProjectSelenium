package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		String url = "https://demoqa.com/menu";
		driver.get(url);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement mainItem2 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		actions.moveToElement(mainItem2).perform();
		//driver.quit()
		 

	}

}
