package test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommands {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = ("http://opensource-demo.orangehrmlive.com/");
		driver.get(Url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.clear();
		usernameField.sendKeys("Admin");

		String attUsername = usernameField.getAttribute("name");
		System.out.println("the attribue is : " + attUsername);

		WebElement passameField = driver.findElement(By.name("password"));
		passameField.clear();
		passameField.sendKeys("admin123");

		String attPassword = passameField.getAttribute("placeholder");
		System.out.println("the attribute is : " + attPassword);

		// Dimension height , width // hauteur // largeur
		Dimension dimensions = usernameField.getSize();
		System.out.println("Height : " + dimensions.height);
		System.out.println("Width : " + dimensions.width);

		// point ==> X , Y
		Point points = passameField.getLocation();
		System.out.println("X coodinate : " + points.x);
		System.out.println("Y coodinate : " + points.y);

		// vérifier le bouton affiché vrai / faux
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type = 'submit']"));
		boolean result = btnLogin.isDisplayed();
		System.out.println(result);

		// vérifier si le bouton activé vrai / faux
		boolean result1 = btnLogin.isEnabled();
		System.out.println(result1);

		// véerifier si le bouton existe
		List<WebElement> login = driver.findElements(By.xpath("//button[@type = 'submit']"));
		if (login.size() != 0) {
			System.out.println("the button is exist");
		} else {
			System.out.println("ther button is not exist ");

			driver.quit();
		}

	}

}
