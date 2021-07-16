package StepDefinations;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Automation.Nine.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends Base{

	
	@AfterStep
	public void takeScreenShot(Scenario sn) throws IOException {
		System.out.println(sn.getLine());
		if(driver!= null) {
			byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sn.attach(src, "image/png", "ScreenShot");
		}
		
	}

	@After
	public void tearDown() {
		// TODO Auto-generated method stub
		driver.close();
	}
}
