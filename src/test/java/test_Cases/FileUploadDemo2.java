package test_Cases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo2 {

	public WebDriver driver;
	public WebDriverWait wait;
	private static String filepath = "C:\\Users\\ACHREF\\OneDrive\\Bureau\\FORMATION ZIED HANNACHI\\Test.txt.txt";

	@BeforeMethod
	public void setup() {

		// fi methode hadhi on fait la configuration navigateur et de l'application

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		String url = "https://blueimp.github.io/jQuery-File-Upload/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

	@Test
	public void robotTest() throws InterruptedException {

		// click on add files
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		uploadFileWithRobot(filepath);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public void uploadFileWithRobot(String pathFile) {
		StringSelection stringselection = new StringSelection(pathFile);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringselection, null);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
