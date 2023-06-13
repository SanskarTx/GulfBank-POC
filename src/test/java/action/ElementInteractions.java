package action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static base.BaseTest.driver;


public class ElementInteractions
{
    public boolean waitForElementToAppearAndClick(WebElement element, long time)
    {
        boolean result;
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            result=true;
        }
        catch(Exception e)
        {
            result=false;
        }
        return result;
    }

    public boolean waitForElementToAppear(WebElement element, long time)
    {
        boolean result;
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(element));
            result = true;
        }
        catch(Exception e)
        {
            result=false;
        }
        return result;
    }
}
