package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", 
   dryRun =  false, strict = true,plugin= {"html:C:\\Users\\T JOHNVEDANAYAGAM\\eclipse-workspace\\Cucumber\\Reports\\htmlreport",
		   "json:C:\\Users\\T JOHNVEDANAYAGAM\\eclipse-workspace\\Cucumber\\Reports\\jsonreport\\fb.json",
		   "junit:C:\\Users\\T JOHNVEDANAYAGAM\\eclipse-workspace\\Cucumber\\Reports\\junitreport\\face.xml"})
public class TestRunner {
	
@AfterClass
public static void report() {
	JVMReport.generateJvmReport("C:\\Users\\T JOHNVEDANAYAGAM\\eclipse-workspace\\Cucumber\\Reports\\jsonreport\\fb.json");
	

}
}
