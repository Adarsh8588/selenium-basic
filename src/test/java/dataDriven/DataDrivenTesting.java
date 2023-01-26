package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args) throws Throwable {
		
		//step1 create a obj for property file
		Properties p = new Properties();
		//step2 create a obj for fileInputSteam
		FileInputStream fis = new FileInputStream("./src/test/resources/comondata.properties");
		p.load(fis);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(p.getProperty("password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).sendKeys(Keys.ENTER);
	}
}
