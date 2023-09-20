package test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommands {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String Url = ("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(Url);
		driver.manage().window().maximize();

		String TittlePage = driver.getTitle();
		int titleLength = TittlePage.length();
		System.out.println("Title of page is : " + TittlePage);
		System.out.println("Lenght of the title page is  : " + titleLength);

		String actuelUrl = driver.getCurrentUrl();
		if (actuelUrl.equals(Url)) {
			System.out.println("Succesafull - the correct url in opned");
		} else {
			System.out.println("failed - an incorrect url is opned ");
		}
	        System.out.println(" The actuel URL is : "+actuelUrl);
	        System.out.println("The Expected URL is : "+ Url );

            String sourcePage = driver.getPageSource();
            int lengthSourcePage = sourcePage.length();
            System.out.println("Length of the source page is : " + lengthSourcePage );
            
           // driver.quit();
}
}