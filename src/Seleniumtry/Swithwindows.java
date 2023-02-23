package Seleniumtry;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swithwindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.crome.driver", "\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462756371&hvpos=&hvnetw=g&hvrand=17183046839612098589&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMIkbz8lc6H_AIVGA4rCh0DhAHIEAAYASAAEgIQG_D_BwE");
		
		driver.manage().window().maximize();
		
		String driverUrl = driver.getCurrentUrl();
		
		System.out.println(driverUrl);
		
		String getTitle = driver.getTitle();
		
		WebElement name = driver.findElement(By.name("field-keywords"));
		name.sendKeys("iphone");
		WebElement searchBox =driver.findElement( By.id("twotabsearchtextbox"));
		
				searchBox.sendKeys(Keys.ENTER);
				String Firstwinid = driver. getWindowHandle();
				System. out. println (" Firstwinid "+ Firstwinid ) ;
				
				//WebElement secondLink = driver.findElements(By.tagName("a")).get(1);
			  //secondLink.click();

				WebElement name1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Black']"));
				name1.click();
				
				Set<String> allwindows = driver.getWindowHandles();
				System.out.println("password of all win"+ allwindows);
				
				
				for (String eachWindowId: allwindows) {
					if(Firstwinid != eachWindowId) {
			driver.switchTo( ).window( eachWindowId) ;
					}}
				
				WebElement tocart = driver.findElement(By.id("add-to-cart-button"));
				tocart.click();
				
				driver.close();
				
				driver. switchTo( ) .window(Firstwinid) ;
				
				name1.click(); 
				
				
				
	}


}
