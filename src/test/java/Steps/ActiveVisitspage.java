//package Steps;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Then;
//
//public class ActiveVisitspage  extends driverfactory{
//	
//	@Then("user should click on Active Visits")
//	public void userShouldClickOnActiveVisits() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/activeVisits.page?app=coreapps.activeVisits\"]")).click();
//	    
//	}
//	@Then("user should navigate to Active Visits page")
//	public void userShouldNavigateToActiveVisitsPage() {
//		String headertxt=driver.findElement(By.xpath("//ul[@id=\"breadcrumbs\"]/li[2]")).getText();
//		Assert.assertEquals(headertxt, "Active Visits");
//	   
//	}
//	@Then("user enter value into the search field")
//	public void userEnterValueIntoTheSearchField() {
//	   driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("100HRU");
//	}
//	@Then("user can see the search results")
//	public void userCanSeeTheSearchResults() {
//		String Act_txt=driver.findElement(By.xpath("//div[@id=\"active-visits_info\"]")).getText();
//		Assert.assertEquals(Act_txt.contains("Showing 1 to 1 of 1 entries"), true);
//	    
//	}
//	@Then("user can see the header details")
//	public void userCanSeeTheHeaderDetails() {
//		List<WebElement> header=driver.findElements(By.xpath("//table//th"));
//		int count=header.size();
//		Assert.assertEquals(count, 5);
//	}
//	@Then("user can see the header details as {string}")
//	public void userCanSeeTheHeaderDetailsAs(String details) {
//		List<WebElement> table_txt=driver.findElements(By.xpath("//table//tr/td"));
//		ArrayList<String> arr=new ArrayList<String>();
//		for(WebElement e:table_txt) {
//			String act_txt=e.getText();
//			arr.add(act_txt);
//			//return arr;
//			
//		}
//		if(arr.contains(details)) {
//			Assert.assertEquals((arr.contains(details)), true);
//		}
//	   
//	}
//	@Then("user can get the particular patient details")
//	public void userCanGetTheParticularPatientDetails() {
//		String Act_url=driver.getCurrentUrl();
//	  Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/coreapps/activeVisits.page?app=coreapps.activeVisits");
//	}
//
//
//}
