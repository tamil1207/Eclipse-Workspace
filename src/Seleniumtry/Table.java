package Seleniumtry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		jhh
	}
	
}
