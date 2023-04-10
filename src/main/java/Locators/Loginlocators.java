package Locators;

public class Loginlocators {
    public final String lusername = "//input[@type='text']";
    public final String lpassword = "//input[@type='password']";
    public final String lLogin_Button = "//span[@class='ui-button-text ui-clickable']";
    public final String incorrect_username_password = "//body/app-root[1]/app-login[1]/p-messages[1]/div[1]/ul[1]/li[1]";
    public final String usernotfound = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']";
    public final String ldashboard = "//section//h3[contains(text(),'Dashboard')]";

    //     ---------------------------regestration-------------------------------------------//

    public static final String MenuBar = "//body/app-root[1]/app-index[1]/div[1]/app-sidebar-navigation[1]/div[1]/ul[1]/li[1]/a[1]/em[1]";

    public static final String UserReg = "//span[contains(text(),'User Registration')]";
    public static final String NewEntry = "//body/app-root[1]/app-index[1]/div[1]/div[1]/div[1]/div[1]/app-user-registration[1]/div[1]/div[2]/div[1]/div[1]/app-user-registration-search[1]/div[1]/div[1]/div[6]/button[1]";

    public static final String JOD = "//body/app-root[1]/app-index[1]/div[1]/div[1]/div[1]/div[1]/app-user-registration[1]/div[1]/div[2]/div[1]/div[2]/app-user-registration-details[1]/div[1]/form[1]/div[1]/div[2]/div[2]/p-calendar[1]/span[1]/input[1]";
    public static final String JOD1 = "//a[contains(text(),'20')]";


    public static final String comp = "//body/app-root[1]/app-index[1]/div[1]/div[1]/div[1]/div[1]/app-user-registration[1]/div[1]/div[2]/div[1]/div[2]/app-user-registration-details[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/p-dropdown[1]/div[1]/label[1]";
    public static final String comp1 = "//li[@aria-label='SRK']";

//    public String select = "//h4[normalize-space()='SRK Information']";

    public static final String Loc = "//label[normalize-space()='Select Location']";
    public static final String Loc1 = "//span[normalize-space()='INDIA']";

    public static final String Dep = "//label[normalize-space()='Select Department']";
    public static final String Dep1 = "//span[normalize-space()='Test']";

    public static final String Cat = "//label[@class='ng-tns-c19-20 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']";
    public static final String Cat1 = "//li[@aria-label='User']";


    public static final String SDV = "//label[contains(text(),'Select stone detail view')]";
    public static final String SDV1 = "//span[normalize-space()='GMS Certificate Module']";


    public static final String URA = "//div[@class='ng-tns-c20-22 ui-multiselect ui-widget ui-state-default ui-corner-all']//span[@class='ui-multiselect-label ui-corner-all'][normalize-space()='Choose']";
    public static final String URA1 = " //body/div[1]/div[2]/ul[1]/p-multiselectitem[5]/li[1]";
    public static final String URA2 = "//div[@class='col-md-6 col-sm-6 col-xs-12']";

    public static final String Fname = "//input[@placeholder='First Name']";

    public static final String DOB = "//button[contains(@class,'ui-datepicker-trigger ui-calendar-button ng-tns-c21-23 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted')]//span[contains(@class,'ui-button-icon-left ui-clickable pi pi-calendar')]";
    public static final String DOBDATE = "//a[contains(text(),'27')]";

    public static final String Gender = "//label[text()='Male']";
    public static final String MS = "//label[contains(text(),'Un-Married')]";
    public static final String MN = "//div//input[@formcontrolname='mobileNo']";
    public static final String MN1 = "//div//input[@formcontrolname='mobileNo']";
    public String Email = "//div//input[@placeholder='Office E-Mail']";
    public String Save = "//span[normalize-space()='Save']";

    public void getatime(){
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


