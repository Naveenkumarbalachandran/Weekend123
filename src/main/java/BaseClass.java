import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
	
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		 return driver;
		 
	}
	
	public static void urlLaun(String url) {
		driver.get(url);
        driver.manage().window().maximize();
	}

}
