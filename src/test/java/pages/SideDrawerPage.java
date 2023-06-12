package pages;

import action.ElementInteractions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SideDrawerPage extends ElementInteractions
{
    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Currency converter']/parent::android.view.View/following-sibling::android.widget.ImageView")
    private WebElement btn_settings;

    public SideDrawerPage(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clickOnSettingsButton()
    {
        Assert.assertTrue(waitForElementToAppearAndClick(btn_settings,10));
    }

}
