package pages;

import action.ElementInteractions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends ElementInteractions
{
    @AndroidFindBy(accessibility = "Log in")
    private WebElement btn_Login;

    @AndroidFindBy(accessibility = "Log in to Gulf Bank")
    private WebElement tv_logInToGulfBank;

    public LoginPage(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clickOnLoginButton()
    {
        Assert.assertTrue(waitForElementToAppearAndClick(btn_Login,10));
    }


    public void validateLoginPageTitle()
    {
        Assert.assertTrue(waitForElementToAppear(tv_logInToGulfBank,10));
    }
}
