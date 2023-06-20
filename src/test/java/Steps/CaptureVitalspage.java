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
//public class CaptureVitalspage extends driverfactory {
//	@Then("user should click on Capture Vitals")
//	public void userShouldClickOnCaptureVitals() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/findpatient/findPatient.page?app=referenceapplication.vitals\"]")).click();
//	    
//	}
//	@Then("user should navigate to Capture Vitals page")
//	public void userShouldNavigateToCaptureVitalsPage() {
//		String Act_txt=driver.findElement(By.xpath("//ul[@id=\"breadcrumbs\"]/li[2]")).getText();
//	   Assert.assertEquals(Act_txt, "Capture Vitals");
//	}
//	@Then("user should pass the value in search field")
//	public void userShouldPassTheValueInSearchField() {
//		driver.findElement(By.xpath("//input[@id=\"patient-search\"]")).sendKeys("100HRS");
//	    
//	}
//	@Then("user can get search results")
//	public void userCanGetSearchResults() {
//		List<WebElement> header=driver.findElements(By.xpath("//table//th"));
//		int count=header.size();
//		Assert.assertEquals(count, 5);
//		ArrayList<String> arr=new ArrayList<String>();
//		for(WebElement e:header) {
//			String act_txt=e.getText();
//			arr.add(act_txt);
//		}
//		String act=arr.get(1);
//	  Assert.assertEquals(act, "Name");
//	}
//	@Then("user can get search results as {string}")
//	public void userCanGetSearchResultsAs(String details ) {
//		List<WebElement> detail=driver.findElements(By.xpath("//table//tr/td"));
//		ArrayList<String> arr=new ArrayList<String>();
//		for(WebElement e:detail) {
//			String act_txt=e.getText();
//			arr.add(act_txt);
//		}
//		if(arr.contains(details)) {
//			Assert.assertEquals((arr.contains(details)), true);
//			
//		}
//	  }
//	@Then("user should able to see the patient details")
//	public void userShouldAbleToSeeThePatientDetails() {
//		String header= driver.findElement(By.tagName("h2")).getText();
//		Assert.assertEquals(header, "Capture Vitals for Patient");
//	}
//
//	
//
//}
