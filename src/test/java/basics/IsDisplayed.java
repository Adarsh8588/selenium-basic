package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
   if(username.isDisplayed()) {
	   System.out.println("pass: element is displayed");
	   
   }
   else {
	System.out.println("fail: element is not displayed");
       }
   driver.close();
	   }
   
	}

