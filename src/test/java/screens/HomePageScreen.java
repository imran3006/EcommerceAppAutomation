package screens;
//import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageScreen {

    @FindBy(
            xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[4]\n"
    )
    public WebElement electronicsOptionElement;

    public HomePageScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void addCart(){
        electronicsOptionElement.click();

    }

}
