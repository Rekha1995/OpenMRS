package Runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/main/java/feature"},
		dryRun = !true,
		glue = {"Pages","Hooks"},
			//	tags =  "@login" ,
		plugin = {"pretty",
				"html:reports/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE
		//monochrome = true
	
	)
	


public class Test_Runner extends AbstractTestNGCucumberTests{

}
