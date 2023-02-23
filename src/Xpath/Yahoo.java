package Xpath;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "\"C:\\Users\\tails\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		WebElement name =driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("tamiln@yahoo.com");
		WebElement name1 =driver.findElement(By.xpath("//input[@type='submit']"));
		name1.click();
	//	driver.close();
	}

}
