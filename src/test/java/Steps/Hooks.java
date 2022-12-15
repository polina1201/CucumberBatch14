package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends CommonMethods {

    //use io.cucumber.java to import this hook
    @Before
    public void preCondition(){
        openBrowserAndLaunchApplication();
    }

    //here we use special class called Scenario Class from cucumber
    //this class holds the complete information of your execution
    @After
    public void postCondition(Scenario scenario){
        byte[]pic;
        if (scenario.isFailed()){
            //failed screenshot will be available inside failed folder
           pic= takeScreenshot("failed/"+scenario.getName());
        }else {
            pic = takeScreenshot("passed/"+scenario.getName());
        }

    //to attach the screenshot in our report
    scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }

}