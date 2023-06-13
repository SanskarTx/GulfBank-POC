package base;

import capabilities.DesiredCapabilitiesBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

public class BaseTest
{
    public static AndroidDriver driver;
    public static AppiumDriverLocalService server;
    @BeforeSuite
    public void beforeSuite()
    {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingPort(4723);
        server= AppiumDriverLocalService.buildService(builder);
        server.start();
    }
    @BeforeMethod
    public void beforeMethod()
    {
        DesiredCapabilities dc1=DesiredCapabilitiesBuilder.desiredCapabilities();
        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }

    @AfterSuite
    public void afterSuite()
    {
        server.stop();
    }
}
