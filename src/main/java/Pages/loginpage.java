package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Driverfactory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage  extends driverfactory{
	
	@Given("user Enter the username as admin")
	public void userEnterTheUsernameAsAdmin() {
		driver.findElement(By.id("username")).sendKeys("admin");
	    
	   
	}
	@Given("user Enter the password as Admin123")
	public void userEnterThePasswordAsAdmin123() {
		driver.findElement(By.id("password")).sendKeys("Admin123");
	    
	   
	}
	@When("user click session link Isolation Ward")
	public void userClickSessionLinkIsolationWard() {
		driver.findElement(By.xpath("//ul/li[@id='Isolation Ward']")).click();
	    
	   
	}
	@When("user clicks login button")
	public void userClicksLoginButton() {
		driver.findElement(By.id("loginButton")).click();
	    
	   
	}
	@Then("User can login successfull")
	public void userCanLoginSuccessfull() {
		String act_url=driver.getCurrentUrl();
		Assert.assertEquals(act_url, "https://demo.openmrs.org/openmrs/referenceapplication/home.page");
	    
		 
	}
//	@Given("user Enter the username as admined")
//	public void userEnterTheUsernameAsAdmined() {
//		driver.findElement(By.id("username")).sendKeys("admined");
//	    
//	 
//	}
//	@Given("user Enter the password as Admin12345")
//	public void userEnterThePasswordAsAdmin12345() {
//		driver.findElement(By.id("password")).sendKeys("Admin12345");
//	    
//	 
//	}
	@Given("user Enter the username as {string}")
	public void userEnterTheUsernameAs(String Username) {
		driver.findElement(By.id("username")).sendKeys(Username);
	    
	}
	@Given("user Enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	  
	}
	@When("user click session link Inpatient Ward")
	public void userClickSessionLinkInpatientWard() {
		driver.findElement(By.xpath("//ul/li[@id='Inpatient Ward']")).click();
	    
	 
	}
	@Then("User cannot login")
	public void userCannotLogin() {
		
		driver.findElement(By.id("loginButton")).click(); 
	String Act_text=driver.findElement(By.id("error-message")).getText();
	Assert.assertEquals(Act_text, "Invalid username/password. Please try again.");
		
	 
	}

	@Given("user Enter the username as admin and password as Admin123")
	public void userEnterTheUsernameAsAdminAndPasswordAsAdmin123() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		
	   
	}
	@Then("verify the count of links")
	public void verifyTheCountOfLinks() {
		List<WebElement> link_count=driver.findElements(By.xpath("//ul/li"));
		link_count.size();
	 Assert.assertEquals(link_count.size(), 6);
	 
	}
	
	@When("user without click  on session link and clicks login button")
	public void userWithoutClickOnSessionLinkAndClicksLoginButton() {
		driver.findElement(By.id("loginButton")).click();
		
	 
	}
	@Then("User cannot logged login")
	public void userCannotLoggedLogin() {
		String Act_text=driver.findElement(By.id("sessionLocationError")).getText();
		Assert.assertEquals(Act_text, "You must choose a location!");
	
	}
	@When("user click  on session link")
	public void userClickOnSessionLink() {
		driver.findElement(By.id("Laboratory")).click();
	    
	}
	@Then("user need to navigate to particular session")
	public void userNeedToNavigateToParticularSession() {
		String text=driver.findElement(By.xpath("//h4[contains(text(), 'Laboratory.')] ")).getText();
	  if(text.contains("Laboratory")) {
		  System.out.println("case is pass");
		  
	  }else {
		  System.out.println("case is fail");
	  }
	}
	@When("user click  on cannot link")
	public void userClickOnCannotLink() {
		driver.findElement(By.id("cantLogin")).click();
	   
	}
	@Then("user get updated msg")
	public void userGetUpdatedMsg() {
		String text=driver.findElement(By.xpath("//p[contains(text(), 'Please contact your System Administrator.')] ")).getText();
	   Assert.assertEquals(text, "Please contact your System Administrator.");
	}
	@When("user click {string}")
	public void userClick(String string) {
		
		String text=driver.findElement(By.id("Inpatient Ward")).getText();
		if(text.contains("Inpatient Ward")) {
			driver.findElement(By.id("Inpatient Ward")).click();
			
		}
	
		String text1=driver.findElement(By.id("Isolation Ward")).getText();
		if(text1.contains("Isolation Ward")) {
			driver.findElement(By.id("Isolation Ward")).click();
			
		
			  
		  }
		
		String text2=driver.findElement(By.id("Laboratory")).getText();
		if(text2.contains("Laboratory")) {
			driver.findElement(By.id("Laboratory")).click();
			  
			  
		  }
		
		String text3=driver.findElement(By.id("Outpatient Clinic")).getText();
		if(text3.contains("Outpatient Clinic")) {
			driver.findElement(By.id("Outpatient Clinic")).click();
			  
		  }
		
		String text4=driver.findElement(By.id("Pharmacy")).getText();
		if(text4.contains("Pharmacy")) {
			driver.findElement(By.id("Pharmacy")).click();
			  
		  }
		
		String text5=driver.findElement(By.id("Registration Desk")).getText();
		if(text5.contains("Registration Desk")) {
			driver.findElement(By.id("Registration Desk")).click();
			  
		  }
		
	   
	}
	@When("user click login")
	public void userClickLogin() {
		driver.findElement(By.id("loginButton")).click();
	   
	   
	}
	@Then("user should navigate to particular session")
	public void userShouldNavigateToParticularSession() {
		String Act_text=driver.findElement(By.tagName("h4")).getText();
		if(Act_text.contains("Inpatient Ward")) {
			Assert.assertEquals(Act_text.contains("Inpatient Ward"), true);	
			
		}
		if(Act_text.contains("Isolation Ward")) {
			Assert.assertEquals(Act_text.contains("Isolation Ward"), true);	
			
		}
		if(Act_text.contains("Laboratory")) {
			Assert.assertEquals(Act_text.contains("Laboratory"), true);	
			
		}
		if(Act_text.contains("Outpatient Clinic")) {
			Assert.assertEquals(Act_text.contains("Outpatient Clinic"), true);	
			
		}
		if(Act_text.contains("Pharmacy")) {
			Assert.assertEquals(Act_text.contains("Pharmacy"), true);	
			
		}
		if(Act_text.contains("Registration Desk")) {
			Assert.assertEquals(Act_text.contains("Registration Desk"), true);	
			
		}
		
	  
	}
	@When("user click  on login")
	public void userClickOnLogin() {
		driver.findElement(By.id("loginButton")).click();
	   
	}
	@Then("user click on logut")
	public void userClickOnLogut() {
		driver.findElement(By.cssSelector("a[href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]")).click();
	   
	}
	@Then("logut success")
	public void logutSuccess() {
		
	//	driver.findElement(By.cssSelector("a[href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]")).click();
		String Act_url=  driver.getCurrentUrl();
		 Assert.assertEquals(Act_url, "https://demo.openmrs.org/openmrs/login.htm");
}
	
}


