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
//public class Configure_metadata extends driverfactory {
//	@Then("user should click on Configure_metadata")
//	public void userShouldClickOnConfigureMetadata() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/configureMetadata.page\"]")).click();
//	 
//	}
//	@Then("user should navigate to Configure_metadata page")
//	public void userShouldNavigateToConfigureMetadataPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
//	    Assert.assertEquals(header, "Configure Metadata");
//	}
//	@Then("user able to see metadata information  as {string}")
//	public void userAbleToSeeMetadataInformationAs(String details) {
//		List<WebElement> detail=driver.findElements(By.tagName("h6"));
//		ArrayList<String> arr=new ArrayList<String>();
//		  for(WebElement e:detail) {
//			  String Act=e.getText();
//			  arr.add(Act) ;
//		  }
//		 if(arr.contains(details)) {
//			 Assert.assertEquals((arr.contains(details)), true);
//		   
//	}
//	}
//	@Then("user should click on Manage Encounter Types")
//	public void userShouldClickOnManageEncounterTypes() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/encounters/encountertypes/manageEncounterTypes.page\"]")).click();
//	   
//	}
//	@Then("user should navigate to Manage Encounter Types")
//	public void userShouldNavigateToManageEncounterTypes() {
//	String header=	driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//	Assert.assertEquals(header, "Manage Encounter Types");
//	
//	}
//	@Then("user able to see Manage Encounter Types table information")
//	public void userAbleToSeeManageEncounterTypesTableInformation() {
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		List<WebElement> count=	driver.findElements(By.xpath("//table//th"));
//		int tablecount=count.size();
//		Assert.assertEquals(tablecount, 3);
//	}
//	@Then("user should click on Manage Forms")
//	public void userShouldClickOnManageForms() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/formentryapp/forms.page?app=formentryapp.forms\"]")).click();
//	    
//	}
//	@Then("user should navigate to Manage Forms")
//	public void userShouldNavigateToManageForms() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		Assert.assertEquals(header, "Manage Forms");
//	   
//	}
//	@Then("user able to see Manage Forms table information")
//	public void userAbleToSeeManageFormsTableInformation() {
//		List<WebElement> count=driver.findElements(By.xpath("//table//th"));
//		int tablecount=count.size();
//		Assert.assertEquals(tablecount, 5);
//	}
//	@Then("user should click on Manage Locations")
//	public void userShouldClickOnManageLocations() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/locations/manageLocations.page\"]")).click();
//	    
//	}
//	@Then("user should navigate to Manage Locations")
//	public void userShouldNavigateToManageLocations() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		Assert.assertEquals(header, "Manage Locations");
//	   
//	}
//	@Then("user able to see Manage Locations table details")
//	public void userAbleToSeeManageLocationsTableDetails() {
//		List<WebElement> count=driver.findElements(By.xpath("//table//th"));
//		int tablecount=count.size();
//		Assert.assertEquals(tablecount, 4);
//	    
//	}
//	@Then("user should click on Manage Patient Identifier Types")
//	public void userShouldClickOnManagePatientIdentifierTypes() {
//		 driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/patients/patientidentifiertypes/managePatientIdentifierTypes.page\"]")).click();
//	}
//	@Then("user should navigate to Manage Patient Identifier Types")
//	public void userShouldNavigateToManagePatientIdentifierTypes() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		Assert.assertEquals(header, "Manage Patient Identifier Types");
//		
//	   
//	}
//	@Then("user able to see Manage Patient Identifier Types table details")
//	public void userAbleToSeeManagePatientIdentifierTypesTableDetails() {
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		List<WebElement> count=driver.findElements(By.xpath("//table//th"));
//		int tablecount=count.size();
//		Assert.assertEquals(tablecount, 3);
//		
//	   
//	}
//}
//	
//
//
