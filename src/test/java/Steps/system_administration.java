//package Steps;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Then;
//
//public class system_administration extends driverfactory {
//	@Then("user should click on System Administration")
//	public void userShouldClickOnSystemAdministration() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/coreapps/systemadministration/systemAdministration.page\"]")).click();
//	   
//	}
//	@Then("user should navigate to System Administration page")
//	public void userShouldNavigateToSystemAdministrationPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[2]")).getText();
//	    Assert.assertEquals(header, "System Administration");
//		
//	  
//	}
//	@Then("user should click on Manage Extensions")
//	public void userShouldClickOnManageExtensions() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/referenceapplication/manageExtensions.page\"]")).click();
//	    
//	}
//	@Then("user should navigate to Manage Extensions page")
//	public void userShouldNavigateToManageExtensionsPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//	    Assert.assertEquals(header, "Manage Extensions");
//	   
//	}
//	@Then("user is able to see Manage Extensions table header")
//	public void userIsAbleToSeeManageExtensionsTableHeader() {
//		 int header= driver.findElements(By.xpath("//table//th")).size();
//		  Assert.assertEquals(header, 3);
//	}
//	@Then("user should click on Manage Apps")
//	public void userShouldClickOnManageApps() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/referenceapplication/manageApps.page\"]")).click();
//	   
//	}
//	@Then("user should navigate to Manage Apps page")
//	public void userShouldNavigateToManageAppsPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//	    Assert.assertEquals(header, "Manage Apps");
//	    
//	}
//	@Then("user able to see Manage Apps table header")
//	public void userAbleToSeeManageAppsTableHeader() {
//		 int header= driver.findElements(By.xpath("//table//th")).size();
//		  Assert.assertEquals(header, 4);
//	   
//	}
//	@Then("user should click on Manage Global Properties")
//	public void userShouldClickOnManageGlobalProperties() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/systemadmin/globalproperties/manageGlobalProperties.page\"]")).click();
//	  
//	}
//	@Then("user should navigate to Manage Global Properties page")
//	public void userShouldNavigateToManageGlobalPropertiesPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//	    Assert.assertEquals(header, "Manage Global Properties");
//	    
//	}
//	@Then("user should click on Manage Accounts")
//	public void userShouldClickOnManageAccounts() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/systemadmin/accounts/manageAccounts.page\"]")).click();
//	    
//	}
//	@Then("user should navigate to Manage Accounts page")
//	public void userShouldNavigateToManageAccountsPage() {
//		String header=driver.findElement(By.xpath("//ul[@id='breadcrumbs']/li[3]")).getText();
//	    Assert.assertEquals(header, "Manage Accounts");
//	 
//	}
//	@Then("user able to see Manage Accounts table header")
//	public void userAbleToSeeManageAccountsTableHeader() {
//		 int header= driver.findElements(By.xpath("//table//th")).size();
//		  Assert.assertEquals(header, 5);
//	}
//	@Then("user should click on Style Guide")
//	public void userShouldClickOnStyleGuide() {
//	    driver.findElement(By.cssSelector("a[href=\"/openmrs/uicommons/styleGuide.page\"]")).click();
//	}
//	@Then("user should navigate to Style Guide page")
//	public void userShouldNavigateToStyleGuidePage() {
//		String Act_url=driver.getCurrentUrl();
//	   Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/uicommons/styleGuide.page");
//	}
//	@Then("user able to see Style Guide page header")
//	public void userAbleToSeeStyleGuidePageHeader() {
//	   String Act_txt= driver.findElement(By.xpath("//h1[text()='OpenMRS RAP Style Guide']")).getText();
//	   Assert.assertEquals(Act_txt, "OpenMRS RAP Style Guide");
//	}
//	@Then("user should click on Advanced Administration")
//	public void userShouldClickOnAdvancedAdministration() {
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/admin/index.htm\"]")).click();
//	    
//	}
//	@Then("user should navigate to Advanced Administration page")
//	public void userShouldNavigateToAdvancedAdministrationPage() {
//		String Act_url=driver.getCurrentUrl();
//		Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/admin/index.htm");
//	 
//	}
//	@Then("user able to see Advanced Administration header")
//	public void userAbleToSeeAdvancedAdministrationHeader() {
//	   String Act_txt= driver.findElement(By.tagName("h2")).getText();
//	   Assert.assertEquals(Act_txt, "Administration");
//	}
//	@Then("user able to see available Administration links")
//	public void userAbleToSeeAvailableAdministrationLinks() {
//		List<WebElement> linkcount=  driver.findElements(By.xpath("//div[@id='tasks']//a"));
//		int count=linkcount.size();
//		Assert.assertEquals(count, 6);
//	}
//	
//
//
//
//}
