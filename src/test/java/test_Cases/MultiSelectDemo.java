package test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDemo {

	public static void main(String[] args) {
		 
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		driver.manage().window().maximize();

	}

}
