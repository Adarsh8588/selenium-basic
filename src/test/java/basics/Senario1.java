package basics;

import javax.swing.border.TitledBorder;

import org.apache.poi.ss.usermodel.charts.TitleType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Senario1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("adarsh12@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Adarsh@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		//verification home page
		if(title.equals("Log in to Facebook"))
		{
		 System.out.println("pass");	
		}else 
		{
			System.out.println("fail");
		}
        driver.close();
        
    //   WebDriverWait wait = new WebDriverWait(driver, 30);
      
	}

	}
