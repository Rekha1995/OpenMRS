//package Steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import Driverfactory.driverfactory;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class headerpage extends driverfactory{
//	//WebDriver driver;
//	
//	
//	@Then("user click on my account")
//	public void userClickOnMyAccount() {
//		driver.findElement(By.xpath("(//div[@id=\"navbarSupportedContent\"]//i)[1]")).click();
//		driver.findElement(By.cssSelector("a[href=\"/openmrs/adminui/myaccount/myAccount.page\"]")).click();
//	   
//	}
//	@Then("user can see details")
//	public void userCanSeeDetails() {
//		int count=driver.findElements(By.xpath("//div[@id=\"tasks\"]/a")).size();
//		Assert.assertEquals(count, 2);
//	}
//	@Then("user click on change password")
//	public void userClickOnChangePassword() {
//		driver.findElement(By.xpath("(//div[@class='task']/i)[1]")).click();
//	    
//	    
//	}
//	@Then("user enter old pwd")
//	public void userEnterOldPwd() {
//		driver.findElement(By.id("oldPassword-field")).sendKeys("Admin123");
//	    
//	}
//	@Then("user enter new pwd")
//	public void userEnterNewPwd() {
//		driver.findElement(By.id("newPassword-field")).sendKeys("Admin12345");  
//	    
//	}
//	@Then("user enter confirm pwd")
//	public void userEnterConfirmPwd() {
//		driver.findElement(By.id("confirmPassword-field")).sendKeys("Admin12345");  
//	    
//	}
//	@Then("user click on save")
//	public void userClickOnSave() {
//	    driver.findElement(By.id("save-button")).click();
//	    
//	}
//	@Then("user can get update")
//	public void userCanGetUpdate() {
//	String txt=	driver.findElement(By.xpath("//div//p[text()='Failed to change your new password']")).getText();
//	  Assert.assertEquals(txt, "Failed to change your new password");  
//	    
//	}
//	@Given("user click on My Languages")
//	public void userClickOnMyLanguages() {
//		driver.findElement(By.xpath("(//div[@class='task']/i)[2]")).click();
//		
//	   
//	   
//	}
//	@Then("user select primary language as {string}")
//	public void userSelectPrimaryLanguageAs(String primarylanguage  ) {
//		WebElement drop=driver.findElement(By.id("default-locale-field"));
//		Select select=new Select(drop);
//		if(primarylanguage.equals("English (United Kingdom)")) {
//			
//			select.selectByVisibleText("English (United Kingdom)");
//		}
//       if(primarylanguage.equals("Spanish")) {
//			
//			select.selectByVisibleText("Spanish");
//		}
//       if(primarylanguage.equals("French")) {
//			
//			select.selectByVisibleText("French");
//		}
//       if(primarylanguage.equals("Italian")) {
//			
//			select.selectByVisibleText("Italian");
//		}
//       if(primarylanguage.equals("Portuguese (Brazil)")) {
//			
//			select.selectByVisibleText("Portuguese (Brazil)");
//		}
//		}
//	@Then("user select proficient language as {string}")
//	public void userSelectProficientLanguageAs(String proficientlanguage) {
//     if(proficientlanguage.equals("English (United Kingdom)")) {
//			
//			driver.findElement(By.cssSelector("input[value=\"en_GB\"]")).click();
//			
//		}
//     if(proficientlanguage.equals("Spanish")) {
//			
//			driver.findElement(By.cssSelector("input[value=\"es\"]")).click();
//			
//		}
//     if(proficientlanguage.equals("French")) {
//			
//			driver.findElement(By.cssSelector("input[value=\"fr\"]")).click();
//			
//		}
//     if(proficientlanguage.equals("Italian")) {
//			
//			driver.findElement(By.cssSelector("input[value=\"it\"]")).click();
//			
//		}
//     if(proficientlanguage.equals("Portuguese")) {
//			
//			driver.findElement(By.cssSelector("input[value=\"pt\"]")).click();
//			
//		}
//	   
//	 }
//	@Then("user click save")
//	public void userClickSave() {
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
//	   
//	   
//	}
//	@Then("user can get update msg")
//	public void userCanGetUpdateMsg() {
//	String text=driver.findElement(By.xpath("//div//p[text()='User defaults could not be updated.']")).getText();
//	 Assert.assertEquals(text, "User defaults could not be updated.") ; 
//	   
//	}
//
//}
