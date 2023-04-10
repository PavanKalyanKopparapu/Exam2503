package StepDefinition;

import Locators.Loginlocators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import support.StepDashboardPage;

public class Register

{


    @Steps
    StepDashboardPage dashboardPage;

    @Steps
    required required;

Loginlocators loginlocators1;
    private PageObject dashPage;

    public Register(PageObject dashPage) {
        this.dashPage = dashPage;
        loginlocators1 = new Loginlocators();
    }

    @Given("User will be on Dashbaord page")
    public void userWillBeOnDashbordpage()
    {
//        dashPage.open();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        loginLocators.getatime();
        System.out.println("Page Open");

    }
    @When("user Registration page")
    public void userRegistrationPage() throws InterruptedException {
//        required.Field();
    }

    @Then("submit details")
    public void submitDetails()
    {
    }
}
