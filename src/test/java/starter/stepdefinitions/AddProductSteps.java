package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jfr.events.ThreadSleepEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import starter.pages.AddProductPage;
import starter.pages.LoginPage;

public class AddProductSteps  {
    AddProductPage addProductPage;
    @Given("User already in AltaShop dashboard")
    public void iOpenBrowser() throws InterruptedException {
        addProductPage.open();
        Thread.sleep(1000);
    }
    @When("I click BELI on product")
    public void openWebsiteSepulsaCom() throws InterruptedException {
        addProductPage.buyProduct();
    }
    @Then("number on cart icon will appear")
    public void iEnterAValidUsernameAndPassword()throws InterruptedException {
        addProductPage.numberIconCart();
    }

    @And("product are added to the cart")
    public void iClickMasukButton() throws InterruptedException{
        addProductPage.cartCheck();
    }
}
