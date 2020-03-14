


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/firstTestFeaturs/baiduSearch.feature"},
//        glue = {"src/test/java/stepDefinitions"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
        )
public class RunTest {



}


