package support;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {

    @Step("Enter Username")
    public void inputUserName(String userName) {
        $(By.xpath("//input[@type='text']")).sendKeys((userName));
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        $(By.xpath("//input[@type='password']")).sendKeys((passWord));
    }

    @Step("Click Submit Button")
    public void clickLogin() {
        $(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
    }

   /* ------------------------------------Registration page----------------------------------------------*/

    @Step("User will be on Deshbordpage")
    public void dashbordPage()
    {

    }
}
