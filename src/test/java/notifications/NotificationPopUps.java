package notifications;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUps {

	public static void main(String[] args) {

		ChromeOptions c = new ChromeOptions();
		//it will maintain the notification popups
		c.addArguments("--disable-notifications");
		c.addArguments("--disable-geolocations");
		// it will maximize the window
		c.addArguments("start-maximized");
		//when i don't want to show my history in browser we go for incognito mood
		c.addArguments("incognito");
		// headless is used to without launching the browser we will get the result  
         c.addArguments("headless");	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement ele = driver.findElement(By.xpath("//select[@class='chosen-select']"));
		Select s=new Select(ele);
		List<WebElement> lv = s.getOptions();
		
		for (WebElement string : lv) {
			System.out.println(string.getText());
			
		}

	}

}
