package pomscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.objectRepository.ActiTimeLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://demo.actitime.com/login.do");
		
		//create a object for ActiTimeLoginPage which is in object repository
		ActiTimeLoginPage login = new ActiTimeLoginPage(driver);
		login.actiTimeLogin("admin","manager");//business lib method name
		
		
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//		driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
//		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
//		WebElement ele = driver.findElement(By.xpath("//span[.='18']"));
//        System.out.println(ele.getText());         
//         System.out.println(ele.getSize());
//         ele.click();
	}
}
