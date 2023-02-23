package DropDrown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty( "webdriver.crome.driver","\"F:\\java\\browser driver\\chromedriver.exe\"" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click(); 
 
		WebElement ddmm =driver.findElement(By.xpath("//select[@title='Month']"));
		ddmm.click();
		
		Select obj = new Select (ddmm);
		 obj.selectByIndex(5);
//		 obj.selectByValue("10");
//		 obj.selectByVisibleText("Jul");
		 
		 List<WebElement> list = obj.getOptions();
		 System.out.println("Size of the  Element =" +list.size());
		 
		 
	}

}
