package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Driverfactory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homepage extends driverfactory {
	
	@Given("user should login")
	public void userShouldLogin() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//ul/li[@id='Isolation Ward']")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	@Then("user click on find patient record")
	public void userClickOnFindPatientRecord() {
		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient\"]")).click();
	    
	}
	@Then("user should navigate to find patient record page")
	public void userShouldNavigateToFindPatientRecordPage() {
		String act_url=driver.getCurrentUrl();
		Assert.assertEquals(act_url, "https://demo.openmrs.org/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient");
	    
	}
	@Then("user enter patient id in search box")
	public void userEnterPatientIdInSearchBox() {
	    driver.findElement(By.id("patient-search")).sendKeys("100HRU");
	 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			}
	}
	@Then("user can get particular patient detail")
	public void userCanGetParticularPatientDetail() {
		String Act_txt=driver.findElement(By.id("patient-search-results-table_info")).getText();
		Assert.assertEquals(Act_txt, "Showing 1 to 1 of 1 entries");
	   
	}
	@Then("user can get patient details\\(By table header)")
	public void userCanGetPatientDetailsByTableHeader() {
	int headercount=driver.findElements(By.xpath("//table//th")).size();
	Assert.assertEquals(headercount, 5);////div[@class='info-header']//h3
	}
	
	 @Then("user can get particular patient details {string}")
	 public void userCanGetParticularPatientDetails(String details) {
		 List<WebElement> detail= driver.findElements(By.xpath("//table//tr[1]/td"));
		  ArrayList<String> arr=new ArrayList<String>();
		  for(WebElement e:detail) {
			  String Act=e.getText();
			  arr.add(Act) ;
		  }
		 if(arr.contains(details)) {
			 Assert.assertEquals((arr.contains(details)), true);////div[@class='float-sm-right']
	    
	 }
}
	 @Then("user able to see the health description")
	 public void userAbleToSeeTheHealthDescription() {
		  List<WebElement> detail = driver.findElements(By.xpath("//div[@class='info-header']//h3"));
		  detail.size();

}
	 @Then("user should click on Active Visits")
		public void userShouldClickOnActiveVisits() {
			driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/activeVisits.page?app=coreapps.activeVisits\"]")).click();
		    
		}
		@Then("user should navigate to Active Visits page")
		public void userShouldNavigateToActiveVisitsPage() {
			String headertxt=driver.findElement(By.xpath("//ul[@id=\"breadcrumbs\"]/li[2]")).getText();
			Assert.assertEquals(headertxt, "Active Visits");
		   
		}
		@Then("user enter value into the search field")
		public void userEnterValueIntoTheSearchField() {
		   driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("100HRU");
		}
		@Then("user can see the search results")
		public void userCanSeeTheSearchResults() {
			String Act_txt=driver.findElement(By.xpath("//div[@id=\"active-visits_info\"]")).getText();
			Assert.assertEquals(Act_txt.contains("Showing 1 to 1 of 1 entries"), true);
		    
		}
		@Then("user can see the header details")
		public void userCanSeeTheHeaderDetails() {
			List<WebElement> header=driver.findElements(By.xpath("//table//th"));
			int count=header.size();
			Assert.assertEquals(count, 5);
		}
		@Then("user can see the header details as {string}")
		public void userCanSeeTheHeaderDetailsAs(String details) {
			List<WebElement> table_txt=driver.findElements(By.xpath("//table//tr/td"));
			ArrayList<String> arr=new ArrayList<String>();
			for(WebElement e:table_txt) {
				String act_txt=e.getText();
				arr.add(act_txt);
				//return arr;
				
			}
			if(arr.contains(details)) {
				Assert.assertEquals((arr.contains(details)), true);
			}
		   
		}
		@Then("user can get the particular patient details")
		public void userCanGetTheParticularPatientDetails() {
			String Act_url=driver.getCurrentUrl();
		  Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/coreapps/activeVisits.page?app=coreapps.activeVisits");
		}
		@Then("user should click on Capture Vitals")
		public void userShouldClickOnCaptureVitals() {
			driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/findpatient/findPatient.page?app=referenceapplication.vitals\"]")).click();
		    
		}
		@Then("user should navigate to Capture Vitals page")
		public void userShouldNavigateToCaptureVitalsPage() {
			String Act_txt=driver.findElement(By.xpath("//ul[@id=\"breadcrumbs\"]/li[2]")).getText();
		   Assert.assertEquals(Act_txt, "Capture Vitals");
		}
		@Then("user should pass the value in search field")
		public void userShouldPassTheValueInSearchField() {
			driver.findElement(By.xpath("//input[@id=\"patient-search\"]")).sendKeys("100HRS");
		    
		}
		@Then("user can get search results")
		public void userCanGetSearchResults() {
			List<WebElement> header=driver.findElements(By.xpath("//table//th"));
			int count=header.size();
			Assert.assertEquals(count, 5);
			ArrayList<String> arr=new ArrayList<String>();
			for(WebElement e:header) {
				String act_txt=e.getText();
				arr.add(act_txt);
			}
			String act=arr.get(1);
		  Assert.assertEquals(act, "Name");
		}
		@Then("user can get search results as {string}")
		public void userCanGetSearchResultsAs(String details ) {
			List<WebElement> detail=driver.findElements(By.xpath("//table//tr/td"));
			ArrayList<String> arr=new ArrayList<String>();
			for(WebElement e:detail) {
				String act_txt=e.getText();
				arr.add(act_txt);
			}
			if(arr.contains(details)) {
				Assert.assertEquals((arr.contains(details)), true);
				
			}
		  }
		@Then("user should able to see the patient details")
		public void userShouldAbleToSeeThePatientDetails() {
			String header= driver.findElement(By.tagName("h2")).getText();
			Assert.assertEquals(header, "Capture Vitals for Patient");
		}
		@Then("user should click on Register_apatient")
		public void userShouldClickOnRegisterApatient() {
			driver.findElement(By.cssSelector("a[href=\"/openmrs/registrationapp/registerPatient.page?appId=referenceapplication.registrationapp.registerPatient\"]")).click();
		    
		}
		@Then("user click on Register patient")
		public void userClickOnRegisterPatient() {
		  
		}
			
			@Then("user should navigate to Register_apatient page")
			public void userShouldNavigateToRegisterApatientPage() {
				String act_txt=driver.findElement(By.xpath("//ul[@id=\"breadcrumbs\"]/li[2]")).getText();
			  Assert.assertEquals(act_txt, "Register a patient");
			}
			@Then("user enter the given and family name")
			public void userEnterTheGivenAndFamilyName() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				driver.findElement(By.name("givenName")).sendKeys("sam");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//input[@name='familyName']")).sendKeys("def");
			   
			}
			@Then("user click on next button")
			public void userClickOnNextButton() {
				driver.findElement(By.id("next-button")).click();
			 
			   
			}
			@Then("user need to select gender")
			public void userNeedToSelectGender() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				WebElement drop =driver.findElement(By.name("gender"));
				Select select=new Select(drop);
				select.selectByVisibleText("Male");
				driver.findElement(By.id("next-button")).click();
			 
			   
			}
			@Then("user need to enter tha patient birth day details")
			public void userNeedToEnterThaPatientBirthDayDetails() {
				driver.findElement(By.xpath("//input[@name='birthdateDay']")).sendKeys("25");
				WebElement option=driver.findElement(By.xpath("//select[@name='birthdateMonth']"));
				option.click();
				Select select=new Select(option);
				select.selectByVisibleText("February");
				driver.findElement(By.xpath("//input[@name='birthdateYear']")).sendKeys("1998");
				driver.findElement(By.id("next-button")).click();
			 
			   
			}
			@Then("user need to enter the patient address")
			public void userNeedToEnterThePatientAddress() {
				driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("banglore");
				driver.findElement(By.id("next-button")).click();
			   
			}
			
			@Then("click on confirm button")
			public void clickOnConfirmButton() {
				
				driver.findElement(By.id("confirmation_label")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				driver.findElement(By.id("submit")).click();
			 
			   
			}
			@Then("user should navigate to particular page and patient id will be created")
			public void userShouldNavigateToParticularPageAndPatientIdWillBeCreated() {
			String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
			System.out.println(header);
			   
			}
			@Then("user should click on Appointment Scheduling")
			public void userShouldClickOnAppointmentScheduling() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs//appointmentschedulingui/home.page\"]")).click();
			    
			}
			@Then("user should navigate to Appointment Scheduling page")
			public void userShouldNavigateToAppointmentSchedulingPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
			   Assert.assertEquals(header, "Appointment Scheduling");
			}
			@Then("user should click on Manage Service Types")
			public void user_should_click_on_manage_service_types() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/manageAppointmentTypes.page\"]")).click();
			    
			}

			@Then("user should navigate to Manage Service Types page")
			public void user_should_navigate_to_manage_service_types_page() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				 Assert.assertEquals(header, "Manage Service Types");
			   
			}
			@Then("user able to see Manage Service table header")
			public void userAbleToSeeManageServiceTableHeader() {
			  int header= driver.findElements(By.xpath("//table//th")).size();
			  Assert.assertEquals(header, 4);
			}
			@Then("user should click on  Manage Appointment Blocks")
			public void userShouldClickOnManageAppointmentBlocks() {
			 driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/scheduleProviders.page\"]")).click();
			}
			@Then("user should navigate to  Manage Appointment Blocks page")
			public void userShouldNavigateToManageAppointmentBlocksPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				 Assert.assertEquals(header, "Manage Appointment Blocks");
				
			   
			}
			@Then("user should click on  Manage Appointments")
			public void userShouldClickOnManageAppointments() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/findpatient/findPatient.page?app=appointmentschedulingui.schedulingAppointmentApp&\"]")).click();
			   
			}
			@Then("user should navigate to Manage Appointments page")
			public void userShouldNavigateToManageAppointmentsPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				 Assert.assertEquals(header, "Manage Appointments");
			  
			}
			@Then("user should click on Daily Appointments")
			public void userShouldClickOnDailyAppointments() {
			 driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/dailyScheduledAppointments.page\"]")).click();
			}
			@Then("user should navigate to Daily Appointments page")
			public void userShouldNavigateToDailyAppointmentsPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				 Assert.assertEquals(header, "Daily Appointments");
			  
			}
			@Then("user should click on Appointment Requests")
			public void userShouldClickOnAppointmentRequests() {
			driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/appointmentRequests.page\"]")).click();
			}
			@Then("user should navigate to Appointment Requests page")
			public void userShouldNavigateToAppointmentRequestsPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				 Assert.assertEquals(header, "Appointment Requests");
			  
			}
			@Then("user click on reports")
			public void userClickOnReports() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/reportingui/reportsapp/home.page\"]")).click();
			   
			}
			@Then("user should navigate to reportpage")
			public void userShouldNavigateToReportpage() {
				
				String Act_url=driver.getCurrentUrl();
				Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/reportingui/reportsapp/home.page");
				}
			@Then("user should navigate to particular page")
			public void userShouldNavigateToParticularPage() {
				String Act_url=driver.getCurrentUrl();
				Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/reportingui/reportsapp/home.page");
				}
			@Then("user can see the text")
			public void userCanSeeTheText() {
				String act_txt=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
				Assert.assertEquals(act_txt.contains("Reports"), true);
				
			    
			}
			
			@Then("user click on data management")
			public void userClickOnDataManagement() {
			    driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/datamanagement/dataManagement.page\"]")).click();
			}
			
			@Then("user should navigate to data management page")
			public void userShouldNavigateToDataManagementPage() {
				String Acttxt=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
			   Assert.assertEquals(Acttxt.contains("Data Management"),true);
			}
			@Then("should click on Merge Patient Electronic Records")
			public void shouldClickOnMergePatientElectronicRecords() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/datamanagement/mergePatients.page?app=coreapps.mergePatients\"]")).click();
			   
			}
			@Then("user should navigate to Merge Patient Electronic Records page")
			public void userShouldNavigateToMergePatientElectronicRecordsPage() {
			 String Act_url=driver.getCurrentUrl();
			 Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/coreapps/datamanagement/mergePatients.page?app=coreapps.mergePatients");
			}
			@Then("can see header test")
			public void canSeeHeaderTest() {
				String txt=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				Assert.assertEquals(txt.contains("Merge Patient Electronic Records"), true);
			    
			}
			
			@Then("user should click on Configure_metadata")
			public void userShouldClickOnConfigureMetadata() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/configureMetadata.page\"]")).click();
			 
			}
			@Then("user should navigate to Configure_metadata page")
			public void userShouldNavigateToConfigureMetadataPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
			    Assert.assertEquals(header, "Configure Metadata");
			}
			@Then("user able to see metadata information  as {string}")
			public void userAbleToSeeMetadataInformationAs(String details) {
				List<WebElement> detail=driver.findElements(By.tagName("h6"));
				ArrayList<String> arr=new ArrayList<String>();
				  for(WebElement e:detail) {
					  String Act=e.getText();
					  arr.add(Act) ;
				  }
				 if(arr.contains(details)) {
					 Assert.assertEquals((arr.contains(details)), true);
				   
			}
			}
			@Then("user should click on Manage Encounter Types")
			public void userShouldClickOnManageEncounterTypes() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/encounters/encountertypes/manageEncounterTypes.page\"]")).click();
			   
			}
			@Then("user should navigate to Manage Encounter Types")
			public void userShouldNavigateToManageEncounterTypes() {
			String header=	driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
			Assert.assertEquals(header, "Manage Encounter Types");
			
			}
			@Then("user able to see Manage Encounter Types table information")
			public void userAbleToSeeManageEncounterTypesTableInformation() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List<WebElement> count=	driver.findElements(By.xpath("//table//th"));
				int tablecount=count.size();
				Assert.assertEquals(tablecount, 3);
			}
			@Then("user should click on Manage Forms")
			public void userShouldClickOnManageForms() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/formentryapp/forms.page?app=formentryapp.forms\"]")).click();
			    
			}
			@Then("user should navigate to Manage Forms")
			public void userShouldNavigateToManageForms() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				Assert.assertEquals(header, "Manage Forms");
			   
			}
			@Then("user able to see Manage Forms table information")
			public void userAbleToSeeManageFormsTableInformation() {
				List<WebElement> count=driver.findElements(By.xpath("//table//th"));
				int tablecount=count.size();
				Assert.assertEquals(tablecount, 5);
			}
			@Then("user should click on Manage Locations")
			public void userShouldClickOnManageLocations() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/locations/manageLocations.page\"]")).click();
			    
			}
			@Then("user should navigate to Manage Locations")
			public void userShouldNavigateToManageLocations() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				Assert.assertEquals(header, "Manage Locations");
			   
			}
			@Then("user able to see Manage Locations table details")
			public void userAbleToSeeManageLocationsTableDetails() {
				List<WebElement> count=driver.findElements(By.xpath("//table//th"));
				int tablecount=count.size();
				Assert.assertEquals(tablecount, 4);
			    
			}
			@Then("user should click on Manage Patient Identifier Types")
			public void userShouldClickOnManagePatientIdentifierTypes() {
				 driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/metadata/patients/patientidentifiertypes/managePatientIdentifierTypes.page\"]")).click();
			}
			@Then("user should navigate to Manage Patient Identifier Types")
			public void userShouldNavigateToManagePatientIdentifierTypes() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
				Assert.assertEquals(header, "Manage Patient Identifier Types");
				
			   
			}
			@Then("user able to see Manage Patient Identifier Types table details")
			public void userAbleToSeeManagePatientIdentifierTypesTableDetails() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List<WebElement> count=driver.findElements(By.xpath("//table//th"));
				int tablecount=count.size();
				Assert.assertEquals(tablecount, 3);
				
			   
			}
			
			@Then("user should click on System Administration")
			public void userShouldClickOnSystemAdministration() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/systemadministration/systemAdministration.page\"]")).click();
			   
			}
			@Then("user should navigate to System Administration page")
			public void userShouldNavigateToSystemAdministrationPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
			    Assert.assertEquals(header, "System Administration");
				
			  
			}
			@Then("user should click on Manage Extensions")
			public void userShouldClickOnManageExtensions() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/referenceapplication/manageExtensions.page\"]")).click();
			    
			}
			@Then("user should navigate to Manage Extensions page")
			public void userShouldNavigateToManageExtensionsPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
			    Assert.assertEquals(header, "Manage Extensions");
			   
			}
			@Then("user is able to see Manage Extensions table header")
			public void userIsAbleToSeeManageExtensionsTableHeader() {
				 int header= driver.findElements(By.xpath("//table//th")).size();
				  Assert.assertEquals(header, 3);
			}
			@Then("user should click on Manage Apps")
			public void userShouldClickOnManageApps() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/referenceapplication/manageApps.page\"]")).click();
			   
			}
			@Then("user should navigate to Manage Apps page")
			public void userShouldNavigateToManageAppsPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
			    Assert.assertEquals(header, "Manage Apps");
			    
			}
			@Then("user able to see Manage Apps table header")
			public void userAbleToSeeManageAppsTableHeader() {
				 int header= driver.findElements(By.xpath("//table//th")).size();
				  Assert.assertEquals(header, 4);
			   
			}
			@Then("user should click on Manage Global Properties")
			public void userShouldClickOnManageGlobalProperties() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/systemadmin/globalproperties/manageGlobalProperties.page\"]")).click();
			  
			}
			@Then("user should navigate to Manage Global Properties page")
			public void userShouldNavigateToManageGlobalPropertiesPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
			    Assert.assertEquals(header, "Manage Global Properties");
			    
			}
			@Then("user should click on Manage Accounts")
			public void userShouldClickOnManageAccounts() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/systemadmin/accounts/manageAccounts.page\"]")).click();
			    
			}
			@Then("user should navigate to Manage Accounts page")
			public void userShouldNavigateToManageAccountsPage() {
				String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
			    Assert.assertEquals(header, "Manage Accounts");
			 
			}
			@Then("user able to see Manage Accounts table header")
			public void userAbleToSeeManageAccountsTableHeader() {
				 int header= driver.findElements(By.xpath("//table//th")).size();
				  Assert.assertEquals(header, 5);
			}
			@Then("user should click on Style Guide")
			public void userShouldClickOnStyleGuide() {
			    driver.findElement(By.cssSelector("a[href=\"/openmrs/uicommons/styleGuide.page\"]")).click();
			}
			@Then("user should navigate to Style Guide page")
			public void userShouldNavigateToStyleGuidePage() {
				String Act_url=driver.getCurrentUrl();
			   Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/uicommons/styleGuide.page");
			}
			@Then("user able to see Style Guide page header")
			public void userAbleToSeeStyleGuidePageHeader() {
			   String Act_txt= driver.findElement(By.xpath("//h1[text()='OpenMRS RAP Style Guide']")).getText();
			   Assert.assertEquals(Act_txt, "OpenMRS RAP Style Guide");
			}
			@Then("user should click on Advanced Administration")
			public void userShouldClickOnAdvancedAdministration() {
				driver.findElement(By.cssSelector("a[href=\"/openmrs/admin/index.htm\"]")).click();
			    
			}
			@Then("user should navigate to Advanced Administration page")
			public void userShouldNavigateToAdvancedAdministrationPage() {
				String Act_url=driver.getCurrentUrl();
				Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/admin/index.htm");
			 
			}
			@Then("user able to see Advanced Administration header")
			public void userAbleToSeeAdvancedAdministrationHeader() {
			   String Act_txt= driver.findElement(By.tagName("h2")).getText();
			   Assert.assertEquals(Act_txt, "Administration");
			}
			@Then("user able to see available Administration links")
			public void userAbleToSeeAvailableAdministrationLinks() {
				List<WebElement> linkcount=  driver.findElements(By.xpath("//div[@id='tasks']//a"));
				int count=linkcount.size();
				Assert.assertEquals(count, 6);
			}
			



			
			





		



}
