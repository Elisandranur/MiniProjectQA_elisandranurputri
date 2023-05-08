package starter.pages;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;
public class HomeStoreScreen extends BasePageObject {
    private By BuyButton1(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By BuyButton2(){
        return MobileBy.xpath("\t\n" +
                "(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }
    private By buying2(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"2\"]");
    }
    @Step
    public boolean onHome(){
        return waitUntilPresence(BuyButton1()).isDisplayed();
    }
    @Step
    public void clickBuying(){
        onClick(BuyButton1());
    }
    @Step
    public void clickBuying2(){
        onClick(BuyButton2());
    }
    @Step
    public boolean cartNumber(){
        return waitUntilVisible(buying2()).isDisplayed();
    }
}
