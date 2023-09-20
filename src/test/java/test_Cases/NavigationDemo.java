package test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = "https://demoqa.com/text-box";
		driver.get(Url);
		driver.manage().window().maximize();

		// scroll down
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500)", "");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//driver.quit();

	}

}
