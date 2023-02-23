package Xpath;

import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

public static void main(String[] args) {
	
	System.setProperty( "webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
	driver.findElement(By.xpath("//input[@name='text']")).sendKeys("yaredane@gmail.com");
//
//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sandron1");
//	driver.findElement(By.xpath("//button[@name='login']")).click();
	//driver.findElement(By.xpath("//button[@type='Yes, Continue']")).click();
	//driver.close();
}

}
