package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice {
	@Override
	public AppiumDriver create() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Note 9 Pro");
		capabilities.setCapability("platformVersion", "11 RKQ1.200826.002");
		capabilities.setCapability("appPackage", "com.vrproductiveapps.whendo");
		capabilities.setCapability("appActivity", "com.vrproductiveapps.whendo.ui.HomeActivity");
		capabilities.setCapability("platformName", "Android");
		AppiumDriver appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return appiumDriver;
	}
}