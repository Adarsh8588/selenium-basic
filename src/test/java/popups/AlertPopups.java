package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://demoapp.skillrary.com/");
         
         WebElement ele = driver.findElement(By.xpath("//a[@id='course']"));
         Actions a = new Actions(driver);
         a.moveToElement(ele).perform();
     
         driver.findElement(By.xpath("(//a[.='Selenium Training'])[1]")).click();
         driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.ENTER);
        
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a1 = driver.switchTo().alert();
        System.out.println(a1.getText());
        //this method is is used to cancel the alert message
         a1.dismiss();
         //this method is is used to ok the alert message
          // a1.accept();
        driver.close();
	}

}
