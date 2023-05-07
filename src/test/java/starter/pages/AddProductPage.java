package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class AddProductPage extends PageObject{
    private By Buy1But(){
        return By.xpath("//*[@id=\"12889\"]/div/div[3]/div[2]/button[2]");
    }
    private By Buy2But(){
        return By.xpath("//*[@id=\"12888\"]/div/div[3]/div[2]/button[2]");
    }
    private By CartButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");
    }
    private By bodyDashboard(){
        return By.xpath("//*[@id=\"app\"]/div/main/div");
    }
    @Step
    public void buyProduct()throws InterruptedException  {
        $(Buy1But()).click();
        Thread.sleep(3000);
        $(Buy2But()).click();
        Thread.sleep(3000);
    }
    @Step
    public void numberIconCart()throws InterruptedException {
        $(bodyDashboard()).shouldBeVisible();
        Thread.sleep(3000);
    }
    @Step
    public void cartCheck()throws InterruptedException{
        $(CartButton()).click();
        Thread.sleep(5000);
    }

}
