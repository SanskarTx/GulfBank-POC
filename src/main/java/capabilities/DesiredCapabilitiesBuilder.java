package capabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesBuilder
{
    public static DesiredCapabilities desiredCapabilities() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"31");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 API 31");
        dc.setCapability("appPackage","com.gulfbank.GBK.uat");
        dc.setCapability("appActivity","com.ofss.gbkprodret.MainActivity");
        return dc;
    }
}
