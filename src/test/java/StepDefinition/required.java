package StepDefinition;

import Locators.Loginlocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class required extends PageObject {

    Loginlocators loginLocators = new Loginlocators();

    public void Field() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(loginLocators.MenuBar)).click();
        $(By.xpath(loginLocators.UserReg)).click();
    $(By.xpath(loginLocators.NewEntry)).click();
    $(By.xpath(loginLocators.JOD)).click();
    $(By.xpath(loginLocators.JOD1)).click();
    $(By.xpath(loginLocators.comp)).click();
    $(By.xpath(loginLocators.comp1)).click();
//    $(By.xpath(loginLocators.select)).click();

        $(By.xpath(loginLocators.Loc)).click();
        $(By.xpath(loginLocators.Loc1)).click();
        $(By.xpath(loginLocators.Dep)).click();
        $(By.xpath(loginLocators.Dep1)).click();
        $(By.xpath(loginLocators.Cat)).click();
        $(By.xpath(loginLocators.Cat1)).click();
        $(By.xpath(loginLocators.SDV)).click();
        $(By.xpath(loginLocators.SDV1)).click();
        $(By.xpath(loginLocators.URA)).click();
        $(By.xpath(loginLocators.URA1)).click();
        $(By.xpath(loginLocators.URA2)).click();
        $(By.xpath(loginLocators.Fname)).sendKeys("Pavan");
        $(By.xpath(loginLocators.DOB)).click();
        $(By.xpath(loginLocators.DOBDATE)).click();
        $(By.xpath(loginLocators.Gender)).click();
        $(By.xpath(loginLocators.MS)).click();
        $(By.xpath(loginLocators.MN)).sendKeys("+91");
        $(By.xpath(loginLocators.MN1)).sendKeys("8897814073");
        $(By.xpath(loginLocators.Email)).sendKeys("pavan88978@gmail.com");
        $(By.xpath(loginLocators.Save)).click();
    }
}
