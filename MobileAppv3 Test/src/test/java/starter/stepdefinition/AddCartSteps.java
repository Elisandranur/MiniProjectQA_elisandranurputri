package starter.stepdefinition;
import io.appium.java_client.MobileBy;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.HomeStoreScreen;
import starter.pages.LoginScreen;

public class AddCartSteps {
    HomeStoreScreen homeStoreScreen = new HomeStoreScreen();
    @Given("Im on the Home page")
    public void onHomePages()throws InterruptedException{
        boolean actual = homeStoreScreen.onHome();
        Assert.assertTrue(actual);
        Thread.sleep(1500);
    }
    @When("I click Beli1")
    public void userClickBeli1(){
        homeStoreScreen.clickBuying();
    }
    @And("I click Beli2")
    public void Beli2(){
        homeStoreScreen.clickBuying2();
    }
    @Then("Number of product in cart increase")
    public void numbercart() throws InterruptedException{
        homeStoreScreen.cartNumber();
        Thread.sleep(2000);
    }
}
