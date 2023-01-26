package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/adars/OneDrive/Desktop/drop.html");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      WebElement dropdown = driver.findElement(By.id("KB"));
      Select s = new Select(dropdown);
      s.selectByIndex(1);
      s.selectByValue("K");
      s.selectByVisibleText("Lolipop");
      
      Thread.sleep(4000);
      s.deselectByIndex(1);
      s.deselectByValue("K");
      s.deselectByVisibleText("Lolipop");
      
      
     driver.close();
	}

}
