//package Steps;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Then;
//
//public class reportpage extends driverfactory {
//
//	@Then("user click on reports")
//	public void userClickOnReports() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/reportingui/reportsapp/home.page\"]")).click();
//	   
//	}
//	@Then("user should navigate to reportpage")
//	public void userShouldNavigateToReportpage() {
//		
//		String Act_url=driver.getCurrentUrl();
//		Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/reportingui/reportsapp/home.page");
//		}
//	@Then("user should navigate to particular page")
//	public void userShouldNavigateToParticularPage() {
//		String Act_url=driver.getCurrentUrl();
//		Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/reportingui/reportsapp/home.page");
//		}
//	@Then("user can see the text")
//	public void userCanSeeTheText() {
//		String act_txt=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
//		Assert.assertEquals(act_txt.contains("Reports"), true);
//		
//	    
//	}
//	
//}
