package PerfectWard.PerfectWard.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(

			features = {"src/test/resources/features"}, //this references the folder path of the package where features exist
			glue={"PerfectWard/PerfectWard/StepDefinitions"},	//this references the folder name of the package where step def's exist. shows where the step def is. 
			plugin={"pretty", "html:test-output", "json:target/json_output/cucumber.json", "junit:target/junit_xml/cucumber.xml"},	//it will create a html report under the folder test-output under your project. 
			monochrome = true, 			//display the console output in a proper readable format
			strict = true,		    	//it will check if any step is not defined in the step def file
			dryRun = false,			//to check the mapping is proper between feature file and step def file
    	    tags = {"@Testing"}		//indicates which tags you want to run. If you don't provide a tag, it will run all scenarios in this feature file
			)	

	
public class TestRunner {
 
		
}
	
	
	
