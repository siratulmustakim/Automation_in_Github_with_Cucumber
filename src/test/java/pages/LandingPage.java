package pages;

import io.cucumber.java.jv.Lan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage {
    @FindBy(css = "[type = 'button']")
    List<WebElement> searchBar;  // index 5

    @FindBy(id = "query-builder-test")
    WebElement txtsearch;

    @FindBy(className = "ActionListContent")
    WebElement rsltSearch;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnSearchBar(){
        searchBar.get(5).click();
    }

    public void doSearch(){
        txtsearch.sendKeys("create-react-app");
    }

    public void resultSearch(){
        rsltSearch.click();
    }
}
