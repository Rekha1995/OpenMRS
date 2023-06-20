package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Driverfactory.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class hooks extends driverfactory {
	//WebDriver driver;
	@Before
	public void userShouldNavigateToTheApplication() {
		driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
	    
	   
	}
	@After
	public void AfterScenario(Scenario scenario) {
	boolean truefalse =	scenario.isFailed();
	if(truefalse) {
	TakesScreenshot tk=(TakesScreenshot)driver ;
	byte[] scenar=tk.getScreenshotAs(OutputType.BYTES);
	scenario.attach(scenar, "image/png", "After Failed Scenarion");
	
	   
	}
	driver.quit();
	


	}
}
