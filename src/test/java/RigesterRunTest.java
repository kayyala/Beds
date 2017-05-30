/**
 * Created by Sudhakar on 15/06/2016.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","html:target/sudha-html-report",
        "json:target/kayyala.json"}
)
public class RigesterRunTest {
}
