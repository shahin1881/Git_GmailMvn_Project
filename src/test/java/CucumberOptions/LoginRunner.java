package CucumberOptions;

//FB_Login Using... @Before Annotation used in Hooks StepDefinition.2_Way_Using_Lounching_FB.
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java//FeatureFiles",
		glue="StepDefinitionFiles",
        monochrome=true,
        strict=true,
        plugin={"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
        //dryRun=true",
         
//public class LoginRunner extends AbstractTestNGCucumberTests {
  public class LoginRunner{

}
