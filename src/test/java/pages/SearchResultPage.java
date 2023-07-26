package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage {
    @FindBy(className = "fIqerb")
    List<WebElement> fb; // index 0

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void isFB() throws InterruptedException {
        Thread.sleep(2000);  // for loading the result page
        String fstResult = fb.get(0).getText();
        Assert.assertTrue(fstResult.contains("facebook/create-react-app"));
    }
}
