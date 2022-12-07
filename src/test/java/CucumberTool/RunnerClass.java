package CucumberTool;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\polin\\SDETBatch14JavaNew\\CucumberBatch14\\src\\test\\java\\CucumberTool\\Login.feature"
)
//Right click on Login -->Copy Path/Reference --> Absolute Path
//Right click on test -->Click on New -->click on Directory -->type resources ---To create Resources folder
//Rick click on resources --->Click New --> Click Directory -->name it "features"


public class RunnerClass {

}
