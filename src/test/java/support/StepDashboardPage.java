package support;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDashboardPage extends PageObject {

    @Step("Successful login")
    public void loginVerify() {
        String dashboardTitle = $(By.xpath("//section//h3[contains(text(),'Dashboard')]")).getText();
        assertEquals(dashboardTitle, "Dashboard");
    }
}

