package Reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {


public static void main(String[] args) {
	ReuseMethod reuseobj = new ReuseMethod();
	     WebDriver driver = reuseobj.webdriverSetup();
	//System.setProperty( "webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"" );
	//WebDriver driver=new ChromeDriver();
	     reuseobj.maximizeWindow();
	//driver.manage().window().maximize();
	     reuseobj.deleteAllCookies();
	//driver.manage().deleteAllCookies();
	     reuseobj.launchUrl("https://www.facebook.com/");
	//driver.get("https://www.facebook.com/");
	     
	     
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yaredane@gmail.com");

	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sandron1");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	//driver.findElement(By.xpath("//button[@type='Yes, Continue']")).click();
	//driver.close();
}
}
