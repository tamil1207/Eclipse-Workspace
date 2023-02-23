package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty( "webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"" );
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
		name.click();
		WebElement baner1 = driver.findElement(By.xpath("//*[@id='item-1']/span"));		
		baner1.click();
		WebElement baner2 = driver.findElement(By.xpath("//span[@class='text']"));
		baner2.click();
		WebElement baner3 = driver.findElement(By.xpath("//span[text()='Alerts']"));
		baner3.click();
		driver.close();

	}

}

