package starter.stepdefinition;
import io.appium.java_client.MobileBy;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.RegisterScreen;

public class RegisterSteps {
    RegisterScreen registerScreen = new RegisterScreen();
    @Given("Im on the login page")
    public void onLoginPages(){
        registerScreen.onLoginPage();
        boolean actual = registerScreen.Regist();
        Assert.assertTrue(actual);
    }
    @And("I click register account to registering new account")
    public void clickRegist(){
        registerScreen.clickRegist();
    }
    @When("I fill the data register with already exist")
    public void fillDataRegist(){
        registerScreen.fillDataReg();
    }
    @And("I click register account to regist the new account")
    public void clickRegisterData(){
        registerScreen.clickRegistAcc();
    }
    @Then("I got message GAGAL on screen")
    public void gotGAGALMessage(){
        registerScreen.getMessage();
    }
}
