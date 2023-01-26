package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("nithin");
		Thread.sleep(4000);
     	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Ntih5iuy");
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        String title = driver.getTitle();
        System.out.println(title);
        wait.until(ExpectedConditions.titleContains("Insta"));
        driver.close();
	}

}
