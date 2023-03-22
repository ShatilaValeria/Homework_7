package checkingTheSubmenu;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "CucumberExample/src/test/java/resources/scenarios",
        glue = "checkingTheSubmenu")
public class RunnerTest {
}