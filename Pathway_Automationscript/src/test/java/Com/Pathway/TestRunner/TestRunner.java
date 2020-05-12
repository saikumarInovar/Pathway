package Com.Pathway.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"C:\\Users\\saiku\\git\\Pathway\\Pathway_Automationscript\\src\\test\\java\\Featurefiles\\CancelationRequest.Feature"},glue="Com.Pathway.Stepdefinations",
monochrome = true,dryRun = false,strict = true)
public class TestRunner {

}
