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
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class findpatientrecord extends driverfactory {
//	
//	@Given("user should login")
//	public void userShouldLogin() {
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("Admin123");
//		driver.findElement(By.xpath("//ul/li[@id='Isolation Ward']")).click();
//		driver.findElement(By.id("loginButton")).click();
//	}
//	@Then("user click on find patient record")
//	public void userClickOnFindPatientRecord() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient\"]")).click();
//	    
//	}
//	@Then("user should navigate to find patient record page")
//	public void userShouldNavigateToFindPatientRecordPage() {
//		String act_url=driver.getCurrentUrl();
//		Assert.assertEquals(act_url, "https://demo.openmrs.org/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient");
//	    
//	}
//	@Then("user enter patient id in search box")
//	public void userEnterPatientIdInSearchBox() {
//	    driver.findElement(By.id("patient-search")).sendKeys("100HRU");
//	 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			}
//	}
//	@Then("user can get particular patient detail")
//	public void userCanGetParticularPatientDetail() {
//		String Act_txt=driver.findElement(By.id("patient-search-results-table_info")).getText();
//		Assert.assertEquals(Act_txt, "Showing 1 to 1 of 1 entries");
//	   
//	}
//	@Then("user can get patient details\\(By table header)")
//	public void userCanGetPatientDetailsByTableHeader() {
//	int headercount=driver.findElements(By.xpath("//table//th")).size();
//	Assert.assertEquals(headercount, 5);////div[@class='info-header']//h3
//	}
//	
//	 @Then("user can get particular patient details {string}")
//	 public void userCanGetParticularPatientDetails(String details) {
//		 List<WebElement> detail= driver.findElements(By.xpath("//table//tr[1]/td"));
//		  ArrayList<String> arr=new ArrayList<String>();
//		  for(WebElement e:detail) {
//			  String Act=e.getText();
//			  arr.add(Act) ;
//		  }
//		 if(arr.contains(details)) {
//			 Assert.assertEquals((arr.contains(details)), true);////div[@class='float-sm-right']
//	    
//	 }
//}
//	 @Then("user able to see the health description")
//	 public void userAbleToSeeTheHealthDescription() {
//		  List<WebElement> detail = driver.findElements(By.xpath("//div[@class='info-header']//h3"));
//		  detail.size();
//
//}
//	
//}
