package pages;

import action.ElementInteractions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LaunchPage extends ElementInteractions
{
    @AndroidFindBy(accessibility = "I am a Gulf Bank customer")
    private WebElement btn_iAmGulfCustomer;

    public LaunchPage(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void  clickOnIamGulfBankCustomer()
    {
        Assert.assertTrue(waitForElementToAppearAndClick(btn_iAmGulfCustomer,10));
    }
}
