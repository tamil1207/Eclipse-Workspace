package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty( "webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"" );
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		WebElement name = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		name.click();
		WebElement name1 = driver.findElement(By.xpath("//a[@style='color: white']"));
		name1.click();
		WebElement name3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		name3.click();
		WebElement name4 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		name4.click();
		Alert alertobj= driver.switchTo().alert();
		String names= alertobj.getText();
		System.out.println(names);
		alertobj.accept();

}}

