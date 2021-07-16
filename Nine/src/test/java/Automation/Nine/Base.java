package Automation.Nine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public void initialize() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath+"/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.afr.com/policy/foreign-affairs/capability-edge-and-keeping-south-china-sea-open-crucial--christopher-pyne-20180924-h15rq9");
		
	}
}
