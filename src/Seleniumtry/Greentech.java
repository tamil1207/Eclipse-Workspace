package Seleniumtry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greentech {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/flutter-and-dart-training-in-chennai.html");
		driver.manage().window().maximize();
		String driverUrl = driver.getCurrentUrl();
		System.out.println(driverUrl);
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		driver.close();
	}

}
