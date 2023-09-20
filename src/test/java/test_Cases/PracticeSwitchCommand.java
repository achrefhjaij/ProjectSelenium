package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement imgPub = driver.findElement(By.id("a077aa5e"));
		imgPub.click();

	}

}
