package test_Cases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resoureces/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
				
	
		driver.get("https://www.google.com/");
		
		 
		 
		 
		 
		 System.out.println("products");
		 
		

	}

}
