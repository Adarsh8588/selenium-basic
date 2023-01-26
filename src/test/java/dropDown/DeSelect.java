package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeSelect {

	public static void main(String[] args) {
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
      
      System.out.println(s.isMultiple());
      //isMultiple method is used to check wheather the selected dropdown is single select or multi select
      if(s.isMultiple()) {
    	  s.deselectAll();
      }
driver.close();
	}

}
