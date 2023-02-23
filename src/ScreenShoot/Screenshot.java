package ScreenShoot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy/mm/dd-HH:MM:SS");
		LocalDateTime now = LocalDateTime.now() ;
		System.out.println(date.format(now));
		
		System.setProperty("webdriver.crome.driver","\"C:\\Users\\tails\\eclipse-workspace\\Eclipse liberary\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		TakesScreenshot scr = (TakesScreenshot) driver;
		File src = scr.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		System.out.println("Screenshot-->"+ src);
		String 
		myLocation = "./screenshot/screenshot"+timestamp()+".png";
//		myLocation = "C:\\Users\\tails\\eclipse-workspace\\Selinumtry\\screenshot"+timestamp()+".png";
		File destFile = new File(myLocation);
		FileUtils.copyFile(src, destFile);
	//	driver.close();

	}

	private static String timestamp() {
		return new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date());
	}

}

