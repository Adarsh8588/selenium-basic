package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//step1:-typecasting
	 TakesScreenshot ts=(TakesScreenshot) driver;
	//access the method and store it in ram
		File ram = ts.getScreenshotAs(OutputType.FILE);
		//specify the location
		  File dest = new File("./takescreenshot/amazon.png");
		  //step4 copy past from ram to destination location
		  FileUtils.copyFile(ram, dest);
		  driver.close();
	}
	}