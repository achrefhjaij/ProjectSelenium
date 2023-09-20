package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demoqa.com/droppable/";
		driver.get(url);
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).perform();
		
		// verify text changed in to dropped!
		
		String textTarget = target.getText();
		if(textTarget.equals("Dropped!")) {
			System.out.println("Pass:source dropped to target as expected");
		} else {
			System.out.println("Fail:source could not be dropped to target as expected ");
		}
	//driver.quit();
	}
}
	

	
