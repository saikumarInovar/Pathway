package Com.Pathway.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"C:\\Users\\saiku\\git\\Pathway\\Pathway_Automationscript\\src\\test\\java\\Featurefiles\\Renewalprocess.feature"},glue="Com.Pathway.Stepdefinations",
monochrome = true,dryRun = false,strict = true,
format = {
        "pretty",
        "html:test-output",
       "json:target/Pathwayreports/Cucumber.json",
         "junit:junit_xml/cucumber.xml"})
public class TestRunner {

}
