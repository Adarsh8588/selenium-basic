package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAllCategories {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
         Select s = new Select(dropdown);
         s.selectByIndex(5);
         Thread.sleep(3000);
         s.selectByValue("search-alias=appliances");
         Thread.sleep(3000);
         s.selectByVisibleText("Amazon Fresh");
         List<WebElement> allOption = s.getOptions();
         System.out.println(allOption.size());
         for(WebElement b:allOption) {
        	 System.out.println(b.getText());
         }
         driver.close();
	}

}
