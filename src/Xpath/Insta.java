package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

public static void main(String[] args) {
	
	System.setProperty("webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	WebElement name = driver.findElement(By.name("username"));
	name.sendKeys("tamilsan@gmail.com");
	String username = name.getAttribute("username");
	System.out.println(username);
	
	WebElement typesss = driver.findElement(By.name("password"));
	typesss.sendKeys("Tamil17");
	String pass = typesss.getAttribute("username");
	System.out.println(typesss);
	
	driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]")).click();
//	driver.close();
}

}
