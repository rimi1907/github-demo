package Runner;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\dasso\\eclipse-workspace\\Demo1\\src\\main\\java\\Features/Login.feature",
		glue= {"StepDefinition"}
	    //format= {"pretty", "html:test-output"}	
	
		)
public class TestRunner {

}
