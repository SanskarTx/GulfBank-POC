package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.LoginPage;
import pages.SettingsPage;
import pages.SideDrawerPage;

public class PaymentTest extends BaseTest
{
    @Test(description = "Validate user is able to transfer the amount to another user")
    public void transferTheAmountToUser()
    {
        LaunchPage launch = new LaunchPage(driver);
        launch.clickOnIamGulfBankCustomer();

        LoginPage login = new LoginPage(driver);
        login.navigateToSideDrawerPage();

        SideDrawerPage sideDrawer=new SideDrawerPage(driver);
        sideDrawer.clickOnSettingsButton();

        SettingsPage settings = new SettingsPage(driver);
        settings.clickOnEnvironmentDropDown();
        settings.selectOBDXEnvironment();

        launch.clickOnIamGulfBankCustomer();

        login.clickOnTestingUsers();
        login.selectUser();
        login.clickOnLoginButton();
    }
}
