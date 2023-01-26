package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateFromOneApplToAnother 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.navigate().forward();
		 driver.navigate().back();
		 driver.navigate().refresh();
		 driver.navigate().to("https://www.flipkart.com/");
		 driver.close();
	}
}
