package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AboutPage {
//    @FindBy(className = "Link--secondary")
//    List<WebElement> about;  //48

    @FindBy(linkText = "About")
    WebElement about;  //48

    public AboutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickAbout() throws InterruptedException {
        Thread.sleep(1000);
        about.click();
//        about.get(48).click();
    }

    public void verifyAbout(String url) throws InterruptedException {
        System.out.println(url);
        Assert.assertTrue(url.contains("/about"));
    }
}
