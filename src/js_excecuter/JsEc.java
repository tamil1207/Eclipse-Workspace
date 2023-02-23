package js_excecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsEc {

public static void main(String[] args) throws Exception {
	
	System.setProperty( "webdriver.crome.driver","\"F:\\java\\browser driver\\chromedriver.exe\"" );
	WebDriver driver  = new ChromeDriver();

	driver.get("http://www.facebook.com");
	driver.manage().window().maximize(); // MWM

	// Type casting , We are adding JS methods to webdriver.
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement email = driver.findElement(By.id("email"));
	
	WebElement passWord = driver.findElement(By.name("pass"));
	
	js.executeScript("arguments[0].setAttribute('id','test@gmail.com')", email);
	
	
	js.executeScript("arguments[0].setAttribute('value','abc@123')", passWord);
	
	String userName = (String) js.executeScript("return arguments[0].getAttribute('value')", email);
	System.out.println("username-->"+userName);

	String passWordString =  (String) js.executeScript("return arguments[0].getAttribute('value')", passWord);
	System.out.println("pass-->"+passWordString);
	WebElement loginButton = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()",loginButton);
	
}

}
