package base;



import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {

    public AndroidDriver driver;
    public static final String PACKAGE_ID="com.nopstation.nopcommerce.nopstationcart";
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "My Device");
        cap.setCapability("platformName", "Android");
cap.setCapability("uuid", "emulator-5554");
        cap.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
        cap.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("autoGrantPermissions", true);
        //loopback address and port num
        URL url=new URL("http://0.0.0.0:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        //after 30s it will show timeout error
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver; // driver is loaded here. for using this in other pages , we should return it


    }
    @AfterTest
    public void closeApp(){
        driver.quit();
    }




}
