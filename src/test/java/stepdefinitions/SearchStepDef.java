package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.SearchResultPage;
import setup.Setup;
import utils.Utils;

public class SearchStepDef extends Setup {

    LandingPage land;

    @Given("user visits the website")
    public void user_visits_the_website() {

        driver.get("https://github.com/");
    }

    @When("user clicks the search-bar")
    public void user_clicks_the_search_bar() {
        land = new LandingPage(driver);
        land.clickOnSearchBar();
    }

    @When("user enters key-words in search bar")
    public void user_enters_key_words_in_search_bar() {
        land = new LandingPage(driver);
        land.doSearch();
    }

    @When("user press the Enter key")
    public void user_press_the_enter_key() {
        land.resultSearch();
    }

    @Then("user can see the matching results")
    public void user_can_see_the_matching_results() throws InterruptedException {

        SearchResultPage resultPage = new SearchResultPage(driver);
        resultPage.isFB();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
