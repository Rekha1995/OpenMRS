//package Steps;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Then;
//
//public class Appointment_Scheduling  extends driverfactory{
//	
//	@Then("user should click on Appointment Scheduling")
//	public void userShouldClickOnAppointmentScheduling() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs//appointmentschedulingui/home.page\"]")).click();
//	    
//	}
//	@Then("user should navigate to Appointment Scheduling page")
//	public void userShouldNavigateToAppointmentSchedulingPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
//	   Assert.assertEquals(header, "Appointment Scheduling");
//	}
//	@Then("user should click on Manage Service Types")
//	public void user_should_click_on_manage_service_types() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/manageAppointmentTypes.page\"]")).click();
//	    
//	}
//
//	@Then("user should navigate to Manage Service Types page")
//	public void user_should_navigate_to_manage_service_types_page() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		 Assert.assertEquals(header, "Manage Service Types");
//	   
//	}
//	@Then("user able to see Manage Service table header")
//	public void userAbleToSeeManageServiceTableHeader() {
//	  int header= driver.findElements(By.xpath("//table//th")).size();
//	  Assert.assertEquals(header, 4);
//	}
//	@Then("user should click on  Manage Appointment Blocks")
//	public void userShouldClickOnManageAppointmentBlocks() {
//	 driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/scheduleProviders.page\"]")).click();
//	}
//	@Then("user should navigate to  Manage Appointment Blocks page")
//	public void userShouldNavigateToManageAppointmentBlocksPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		 Assert.assertEquals(header, "Manage Appointment Blocks");
//		
//	   
//	}
//	@Then("user should click on  Manage Appointments")
//	public void userShouldClickOnManageAppointments() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/findpatient/findPatient.page?app=appointmentschedulingui.schedulingAppointmentApp&\"]")).click();
//	   
//	}
//	@Then("user should navigate to Manage Appointments page")
//	public void userShouldNavigateToManageAppointmentsPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		 Assert.assertEquals(header, "Manage Appointments");
//	  
//	}
//	@Then("user should click on Daily Appointments")
//	public void userShouldClickOnDailyAppointments() {
//	 driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/dailyScheduledAppointments.page\"]")).click();
//	}
//	@Then("user should navigate to Daily Appointments page")
//	public void userShouldNavigateToDailyAppointmentsPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		 Assert.assertEquals(header, "Daily Appointments");
//	  
//	}
//	@Then("user should click on Appointment Requests")
//	public void userShouldClickOnAppointmentRequests() {
//	driver.findElement(By.cssSelector("a[href=\"/openmrs/appointmentschedulingui/appointmentRequests.page\"]")).click();
//	}
//	@Then("user should navigate to Appointment Requests page")
//	public void userShouldNavigateToAppointmentRequestsPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//		 Assert.assertEquals(header, "Appointment Requests");
//	  
//	}
//	
//
//}
