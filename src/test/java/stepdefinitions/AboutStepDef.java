package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.guieffect.qual.UIType;
import pages.AboutPage;
import setup.Setup;
import utils.Utils;

public class AboutStepDef extends Setup {

    AboutPage aboutPage;

    @Given("user is on the landing page of github.com")
    public void user_is_on_the_landing_page_of_github_com() {
        driver.get("https://github.com/");
//        Utils.doScroll(driver);
    }

    @When("user clicks the about button")
    public void user_clicks_the_about_button() throws InterruptedException {
        Utils.doScroll(driver);
        aboutPage = new AboutPage(driver);
        aboutPage.clickAbout();
    }

    @Then("user is taken to the about page")
    public void user_is_taken_to_the_about_page() throws InterruptedException {

        Thread.sleep(2000); // for the page to be loaded
        String url = driver.getCurrentUrl();
        aboutPage.verifyAbout(url);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
