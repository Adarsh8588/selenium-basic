package dropDown;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
       Select s = new Select(dropdown);
         s.selectByValue("3");
        List<WebElement> all = s.getAllSelectedOptions();
       System.out.println(all.size());
        
       for(WebElement b:all) {
    	   System.out.println(b.getText());
    	  
       }
       System.out.println(s.isMultiple());
       if(s.isMultiple()) {
    	   s.deselectAll();
    	  
       }
       //getalloption is use to fetch all the value which is presenr in the dropdown
      List<WebElement> months = s.getOptions();
      for (WebElement webElement : months) {
		System.out.println(webElement.getText());
	}
      System.out.println(months.size());
      
     TreeSet set = new TreeSet();
     for (int i = 0; i < months.size(); i++) {
		set.add(months.get(i).getText());
	}
     
     System.out.println(set);
        driver.close();
	}

}
