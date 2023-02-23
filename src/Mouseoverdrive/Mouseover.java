package Mouseoverdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.crome.driver","\"F:\\java\\browser driver\\chromedriver.exe\"" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		WebElement name = driver.findElement(By.xpath("//button[.='✕']"));
		name.click();
		WebElement name1 = driver.findElement(By.xpath("(//div[.='Electronics'])[1]"));
		Actions bilder = new Actions(driver);
		bilder.moveToElement(name1).perform();
		driver.findElements(By.linkText("Laptop and Desktop"));
		name1.click();
	//	driver.close();
		
		}

}
