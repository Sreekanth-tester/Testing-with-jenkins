package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"D:\\PNR255\\org.citi.tcs\\features\\AccountMaintanance.feature"},
		glue={"glue"},
		//tags="@smoketest",
		monochrome=true,
		plugin={"pretty","json:target/cucumber.json"}
		)

public class TestRunner {

}
