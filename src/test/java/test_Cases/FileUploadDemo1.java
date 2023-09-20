package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo1 {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = ("https://demo.guru99.com/test/upload/");
		driver.get(Url);
		driver.manage().window().maximize();

		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		uploadfile.sendKeys("C:\\Users\\ACHREF\\OneDrive\\Bureau\\FORMATION ZIED HANNACHI\\Test.txt");

		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();

		boolean result1 = checkbox.isSelected();
		System.out.println(result1);

		driver.findElement(By.id("submitbutton"));

		driver.quit();

	}

}
