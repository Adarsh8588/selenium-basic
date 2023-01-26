package findElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//span[text()='Sign In']")).click();
         Thread.sleep(3000);
         driver.switchTo().frame(0);
         Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
        Thread.sleep(3000);
         driver.switchTo().defaultContent();
         Thread.sleep(3000);
         driver.close();
	}

}
