package net.testiteasy.steps.search;

import io.cucumber.java.en.When;
import net.testiteasy.screens.search.SearchScreen;
import net.testiteasy.screens.search.SearchScreenObjectFactory;

// TODO -->
// -- This step for the Search screen should be changed and finished in courses.
// -- You need to think over the logic of using this Search screen.
public class SearchStepDefinitions {

    private final SearchScreen searchScreen = SearchScreenObjectFactory.get();

    @When("user types in Search field {string} text")
    public void userTypeInSearchField(final String searchInput) {
        searchScreen.fillOutSearchField(searchInput);
    }

    @When("user can see suggestion text")
    public void userCanSeeSearchSuggestion() {
            searchScreen.waitForSearchSuggestion();
    }

    @When("user scroll to view with {string} and click")
    public void userScrollToView(final String text) {
        searchScreen.scrollIntoViewWithTextAndClick(text);
    }
}
