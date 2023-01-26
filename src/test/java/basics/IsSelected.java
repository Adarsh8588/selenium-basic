package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {

	public static void main(String[] args) throws Throwable {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
    WebElement radioButton = driver.findElement(By.xpath("//label[contains(.,'Male')]"));
    radioButton.click();
      System.out.println(radioButton.isSelected());
   
	}

}
