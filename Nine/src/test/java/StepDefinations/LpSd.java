package StepDefinations;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automation.Nine.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LpSd extends Base{
	//WebDriver driver;
	static boolean popupStatus = false;

	@Given("^Landing page is loaded$")
    public void landing_page_is_loaded() throws Throwable {
		initialize();
    }

    @When("^Subscription prompt is popped up$")
    public void subscription_prompt_is_popped_up() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 3 /*timeout in seconds*/);
    	WebElement popupEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@data-testid='SubscriptionPrompt-title']")));	
    	if(popupEle != null)
    		popupStatus = true;
    }

    @Then("^Scroll to end of the page$")
    public void validated_the_pop_up() throws Throwable {
		if(popupStatus == true) {
        	JavascriptExecutor js = ((JavascriptExecutor) driver);
        	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		}

    }

    @And("^wait for ten sec max$")
    public void wait_for_ten_sec_max() throws Throwable {
    	if(popupStatus == true) 
		TimeUnit.SECONDS.sleep(10);


    }

    @And("^pop up disappears$")
    public void pop_up_disappears() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver,0);
    	if(popupStatus == true) 
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='SubscriptionPrompt-false']")));
    	else
    	popupStatus = false;
    }


}
