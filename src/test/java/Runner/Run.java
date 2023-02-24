package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, glue = {"StepDefinations"}, monochrome = true, plugin = {"pretty","html:target/report.html"})
public class Run{
}
