package Seleniumtry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webellement {
public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple 14 pro max phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		String driverUrl = driver.getCurrentUrl();
		System.out.println(driverUrl);
		driver.close();
	}
}
