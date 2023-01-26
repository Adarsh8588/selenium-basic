package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[@id='course']"));
		Thread.sleep(3000);
        Actions a = new Actions(driver);
        a.moveToElement(ele).perform();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(.,'Selenium Training')])[2]")).click();
        WebElement ele1 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
        a.doubleClick(ele1).perform();
        //	driver.close();	
	}

}
