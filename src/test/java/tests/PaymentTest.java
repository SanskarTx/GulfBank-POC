package tests;

import FileUtility.Constants;
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
        launch.clickOnIAmGulfBankCustomer();

        LoginPage login = new LoginPage(driver);
        login.navigateToSideDrawerPage();

        SideDrawerPage sideDrawer=new SideDrawerPage(driver);
        sideDrawer.clickOnSettingsButton();

        SettingsPage settings = new SettingsPage(driver);
        settings.clickOnEnvironmentDropDown();
        settings.scrollDropDownAndClick("OBDX 21.1");

        launch.clickOnIAmGulfBankCustomer();
    }
}