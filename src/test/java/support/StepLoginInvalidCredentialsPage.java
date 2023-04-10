package support;

import Locators.Loginlocators;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepLoginInvalidCredentialsPage extends PageObject {
    Loginlocators loginLocators = new Loginlocators();

    @Step("Enter the Username")
    public void invalidinputUserName(String userName) {
        $(By.xpath("//input[@type='text']")).sendKeys((userName));
    }

    @Step("Enter the Password")
    public void invalidinputPassword(String passWord) {
        $(By.xpath("//input[@type='password']")).sendKeys((passWord));
    }

    @Step("Click the Submit Button")
    public void invalidclickLogin() {
        $(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
    }

    @Step("Get the Error")
    public void invaliderror(String userName,String passWord){
        if(userName=="ppd" && passWord!="srk1964") {
            String user = $(By.xpath(loginLocators.incorrect_username_password)).getText();
            Assert.assertEquals("Username or Password is incorrect!!",user);
        }
//        else if (userName!="ppd" && passWord=="srk1964") {
//            String pass = $(By.xpath(loginLocators.usernotfound)).getText();
//            Assert.assertEquals("User Not Found",pass);
//        }
        else if(userName!="ppd" && passWord!="srk1964"){
            String comm = $(By.xpath(loginLocators.incorrect_username_password)).getText();
            Assert.assertEquals("User Not Found",comm);
        }
    }
}
