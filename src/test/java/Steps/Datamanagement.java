//package Steps;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Then;
//
//public class Datamanagement extends driverfactory {
//	
//	@Then("user click on data management")
//	public void userClickOnDataManagement() {
//	    driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/datamanagement/dataManagement.page\"]")).click();
//	}
//	
//	@Then("user should navigate to data management page")
//	public void userShouldNavigateToDataManagementPage() {
//		String Acttxt=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
//	   Assert.assertEquals(Acttxt.contains("Data Management"),true);
//	}
//	@Then("should click on Merge Patient Electronic Records")
//	public void shouldClickOnMergePatientElectronicRecords() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/datamanagement/mergePatients.page?app=coreapps.mergePatients\"]")).click();
//	   
//	}
//	@Then("user should navigate to Merge Patient Electronic Records page")
//	public void userShouldNavigateToMergePatientElectronicRecordsPage() {
//	 String Act_url=driver.getCurrentUrl();
//	 Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/coreapps/datamanagement/mergePatients.page?app=coreapps.mergePatients");
//	}
//	@Then("can see header test")
//	public void canSeeHeaderTest() {
//		String txt=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		Assert.assertEquals(txt.contains("Merge Patient Electronic Records"), true);
//	    
//	}
//		
//	    
//	
//
//	
//}
//
