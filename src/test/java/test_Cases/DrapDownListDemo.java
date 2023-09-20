package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrapDownListDemo {

	public static void main(String[] args) {

		// liste deroulente

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));

		Select dropDownlist = new Select(selectMenu);

		// select the option by index
		dropDownlist.selectByIndex(5);

		// slect the option by value
		dropDownlist.selectByValue("9");

		// select thr option by visible text
		dropDownlist.selectByVisibleText("Yellow");
		
		 

		driver.quit();

	}

}
