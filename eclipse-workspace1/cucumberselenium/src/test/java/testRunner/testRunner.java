package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/java/feature",
		glue= "stepDefinition",
		tags= "@TC1",
		plugin= {"html: target/MyReports/Report_HTML.html",
				 "json: target/MyReports/Report_JSON.json",
				 "junit: target/MyReports/Report_JUNIT.junit"
				})

public class testRunner {

}
