package pages;

import action.ElementInteractions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SettingsPage extends ElementInteractions
{
    @AndroidFindBy(xpath="//android.view.View[@content-desc='Experimental Features']/preceding-sibling::android.widget.Button")
    private WebElement btn_environmentDropDown;

    @AndroidFindBy(accessibility = "OBDX 21.1")
    private WebElement tv_envOBDX;
    public SettingsPage(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clickOnEnvironmentDropDown()
    {
        Assert.assertTrue(waitForElementToAppearAndClick(btn_environmentDropDown,10));
    }

    public void selectAnyEnvironment(String environment)
    {
      scrollDropDownAndClick(environment);
    }
}
