package StepDefinition;


import Locators.Loginlocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import support.StepDashboardPage;
import support.StepLoginInvalidCredentialsPage;
import support.StepLoginPage;


public class LoginPageDefinitions extends PageObject {

    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashboardPage dashPage;

    @Steps
    StepLoginInvalidCredentialsPage stepLoginInvalidCredentialsPage;


    Loginlocators loginLocators = new Loginlocators();

    //---------------------------------Scenario 1 started here-------------------------------------
    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginLocators.getatime();
        System.out.println("Page is opened");
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword(String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
    }

    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
        loginLocators.getatime();
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dashPage.loginVerify();
    }


    //------------------------------------Scenario 1 Ended here--------------------------------------------

    //--------------------------------------Scenario 2 started here-------------------------------------------
    @Given("User will be on Homepage")
    public void User_will_be_on_Homepage() {
       open();
        loginLocators.getatime();
    }

    @When("User enters Username as {string}")
    public void User_enters_Username(String usernameinv) {
        stepLoginInvalidCredentialsPage.invalidinputUserName(usernameinv);
    }

    @And("User enters Password as {string}")
    public void User_enters_Password(String passinv) {
        stepLoginInvalidCredentialsPage.invalidinputPassword(passinv);
        stepLoginInvalidCredentialsPage.invalidclickLogin();
    }

    @Then("User will get an error message from this {string} and {string}")
    public void User_will_get_as_error(String uinvalid, String pinvalid) {
        loginLocators.getatime();
        stepLoginInvalidCredentialsPage.invaliderror(uinvalid, pinvalid);
    }



}




