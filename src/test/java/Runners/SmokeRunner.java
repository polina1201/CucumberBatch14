package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue="Steps",

        //when you set dryRun to true, it stops actual execution
        //it will quickly scan all the gherkin steps whether they are implemented or not

        //when we set dryRun to false, it starts execution again --to get the code we need to enter into the steps


        dryRun = false,
        tags = "@sprint4",
        //to remove irrelevant information from console, you need to set monochrome to true.
        monochrome=true,
        plugin = {"pretty"}
        //pretty keyword prints the steps in the console to increase readability

)

public class SmokeRunner {

}
