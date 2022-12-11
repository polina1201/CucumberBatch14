package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends CommonMethods {

    //use io.cucumber.java to import this hook
    @Before
    public void preCondition(){
        openBrowserAndLaunchApplication();
    }

    @After
    public void postCondition(){
        closeBrowser();
    }

}