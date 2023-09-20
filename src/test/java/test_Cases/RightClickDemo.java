package test_Cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "src/test/resoureces/drivers/chromedriver.exe");

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement btnRightClick  = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(btnRightClick).perform();
		System.out.println("sucess right click");
		
		String message  = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals("You have done a right click ", message);
		
		driver.quit();
		

	}

}
