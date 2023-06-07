package base;

import capabilities.DesiredCapabilitiesBuilder;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

public class BaseTest
{
    public static AndroidDriver driver;

    @BeforeSuite
    public void beforeSuite()
    {

    }
    @BeforeMethod
    public void beforeMethod() throws Exception
    {
        DesiredCapabilities dc1=DesiredCapabilitiesBuilder.desiredCapabilities();
        driver =new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc1);
    }
    @AfterMethod
    public void afterMethod()
    {

        driver.quit();
    }

    @AfterSuite
    public void afterSuite()
    {
        //server.stop();
    }
}
