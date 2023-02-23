package Seleniumtry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "\"F:\\java\\browser driver\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.Google.com");
		driver.manage().window().maximize();
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		String driverUrl = driver.getCurrentUrl();
		System.out.println(driverUrl);
		if ("Google".equals(getTitle)) {
			System.out.println("Test match. Test case passed");
		} else {
			System.out.println("Test case Failled");
		}
		driver.close();
	}


}
