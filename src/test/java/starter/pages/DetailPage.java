package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class DetailPage extends PageObject{
    private By detailButt1(){
        return By.xpath("//*[@id=\"12887\"]/div/div[3]/div[2]/button[1]");
    }
    private By detailProduct1(){
        return By.xpath("//*[@id=\"app\"]/div/main/div");
    }
    private By Homepage(){
        return By.xpath("//h3[contains(text(),'AltaShop')]");
    }
    private By detailButt2(){
        return By.xpath("//*[@id=\"12890\"]/div/div[3]/div[2]/button[1]");
    }
    private By detailProduct2(){
        return By.xpath("//*[@id=\"app\"]/div/main/div");
    }
    @Step
    public void detail1()throws InterruptedException{
        $(detailButt1()).click();
        $(detailProduct1()).isDisplayed();
        Thread.sleep(2000);
        $(Homepage()).click();
    }
    @Step
    public void detail2()throws InterruptedException{
        $(detailButt2()).click();
        $(detailProduct2()).isDisplayed();
        Thread.sleep(2000);
    }
}
