package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.LoginPage;

public class LoginTest extends BaseTest
{
    @Test(description = "Validate user is not able to login without entering username and password")
    public void LoginWithoutCredentials()
    {
        LaunchPage launch = new LaunchPage(driver);
        launch.clickOnIAmGulfBankCustomer();
        LoginPage login = new LoginPage(driver);
        login.clickOnLoginButton();
        login.validateLoginPageTitle();
    }
}
