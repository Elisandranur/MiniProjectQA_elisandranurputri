package starter.pages;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;
public class RegisterScreen extends BasePageObject {
    private By loginLinkButton() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By RegisterLink(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By fillData(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By RegistButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By seeMessage(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }
    @Step
    public void onLoginPage(){
        onClick(loginLinkButton());
    }
    @Step
    public boolean Regist(){
        return waitUntilVisible(RegisterLink()).isDisplayed();
    }
    @Step
    public void clickRegist(){
        onClick(RegisterLink());
    }
    @Step
    public void fillDataReg(){
        waitUntilPresence(fillData());
    }
    @Step
    public void clickRegistAcc(){
        onClick(RegistButton());
    }
    @Step
    public void getMessage(){
        waitUntilVisible(seeMessage()).isDisplayed();
    }
}
