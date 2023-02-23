package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S-368796555%3A1671588348507233&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh51cHpgcc_hs_ftc4dW45P4-76JvRrXLD64wMv3hheat9ZLEzYGQRg612Bb6I7KwNewwdsTbw");
		 
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("tasandron@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.close();
	}
}
