package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement ClickMe = driver.findElement(By.id("alertButton"));
		ClickMe.click();
		
		// accept alert 
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println("title of the page in :"+title);
		
	
		
		//driver.quit();

	}

}
