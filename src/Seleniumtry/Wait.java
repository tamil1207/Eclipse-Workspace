package Seleniumtry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdrier.crome.driver", "\"F:\\java\\browser driver\\chromedriver.exe\"");
WebDriver drive = new ChromeDriver();
drive.manage().window().maximize();
drive.manage().deleteAllCookies();
drive.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
drive.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
drive.get("https://www.geeksforgeeks.org/");
WebElement alllinkText = drive.findElement(By.linkText("Algorithms"));
alllinkText.click();
}


}
