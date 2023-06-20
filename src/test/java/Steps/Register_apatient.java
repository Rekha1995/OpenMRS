//package Steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Then;
//
//public class Register_apatient  extends driverfactory{
//	
//
//
//@Then("user should click on Register_apatient")
//public void userShouldClickOnRegisterApatient() {
//	driver.findElement(By.cssSelector("a[href=\"/openmrs/registrationapp/registerPatient.page?appId=referenceapplication.registrationapp.registerPatient\"]")).click();
//    
//}
//@Then("user click on Register patient")
//public void userClickOnRegisterPatient() {
//  
//}
//	
//	@Then("user should navigate to Register_apatient page")
//	public void userShouldNavigateToRegisterApatientPage() {
//		String act_txt=driver.findElement(By.xpath("//ul[@id=\"breadcrumbs\"]/li[2]")).getText();
//	  Assert.assertEquals(act_txt, "Register a patient");
//	}
//	@Then("user enter the given and family name")
//	public void userEnterTheGivenAndFamilyName() {
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		driver.findElement(By.name("givenName")).sendKeys("sam");
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//input[@name='familyName']")).sendKeys("def");
//	   
//	}
//	@Then("user click on next button")
//	public void userClickOnNextButton() {
//		driver.findElement(By.id("next-button")).click();
//	 
//	   
//	}
//	@Then("user need to select gender")
//	public void userNeedToSelectGender() {
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		WebElement drop =driver.findElement(By.name("gender"));
//		Select select=new Select(drop);
//		select.selectByVisibleText("Male");
//		driver.findElement(By.id("next-button")).click();
//	 
//	   
//	}
//	@Then("user need to enter tha patient birth day details")
//	public void userNeedToEnterThaPatientBirthDayDetails() {
//		driver.findElement(By.xpath("//input[@name='birthdateDay']")).sendKeys("25");
//		WebElement option=driver.findElement(By.xpath("//select[@name='birthdateMonth']"));
//		option.click();
//		Select select=new Select(option);
//		select.selectByVisibleText("February");
//		driver.findElement(By.xpath("//input[@name='birthdateYear']")).sendKeys("1998");
//		driver.findElement(By.id("next-button")).click();
//	 
//	   
//	}
//	@Then("user need to enter the patient address")
//	public void userNeedToEnterThePatientAddress() {
//		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("banglore");
//		driver.findElement(By.id("next-button")).click();
//	   
//	}
//	
//	@Then("click on confirm button")
//	public void clickOnConfirmButton() {
//		
//		driver.findElement(By.id("confirmation_label")).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		driver.findElement(By.id("submit")).click();
//	 
//	   
//	}
//	@Then("user should navigate to particular page and patient id will be created")
//	public void userShouldNavigateToParticularPageAndPatientIdWillBeCreated() {
//	String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
//	System.out.println(header);
//	   
//	}
//
//
//
//}
