package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateApi {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//forward
		driver.navigate().forward();
		Thread.sleep(3000);
		//back
		driver.navigate().back();
		Thread.sleep(3000);
		//refresh
        driver.navigate().refresh();
		Thread.sleep(3000);
        driver.close();

	}

}
