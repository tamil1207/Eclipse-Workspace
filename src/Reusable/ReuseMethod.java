package Reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReuseMethod {
 WebDriver driver ;
 
	public WebDriver webdriverSetup() {
		System.setProperty("Webdriver.Chrome.driver", "\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		 driver = new ChromeDriver();
		 return driver;
	}
	 public void maximizeWindow() {
		 driver.manage().window().maximize();
	 
	 }
	 public void deleteAllCookies() {
		 driver.manage().deleteAllCookies();
	 }
	 public void launchUrl (String url) {
		 driver.get(url);
	 }
	 public void sendInput(WebElement element,String inputStr) {
		 element.sendKeys(inputStr);
	 }
	 
	 public void buttonClick(WebElement button) {
		button.click();
	 }
}
