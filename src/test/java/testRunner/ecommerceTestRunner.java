package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.HomePageScreen;

import java.io.IOException;

public class ecommerceTestRunner extends Setup {
    @Test
    public void addCart() throws IOException, InterruptedException {
        HomePageScreen homePageScreen = new HomePageScreen(driver);
        homePageScreen.addCart();


    }
}
