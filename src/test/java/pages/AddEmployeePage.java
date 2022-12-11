package pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "btnSave")
    public WebElement saveButton;


    //constructor
    public AddEmployeePage(){
        //page factory is the concept of selenium which we use to implement page
        //object model design pattern, which is responsible to initialize all the
        //objects of the class. When we say Objects, we mean locators, what we also call
        //object repository.
        //if someone asks this to you in the interview you have to write the same thing
        PageFactory.initElements(driver,this);
    }

}
