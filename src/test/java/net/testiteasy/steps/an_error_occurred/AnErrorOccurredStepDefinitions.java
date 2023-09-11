package net.testiteasy.steps.an_error_occurred;

import io.cucumber.java.en.When;
import net.testiteasy.screens.an_error_occurred.AnErrorOccurredScreen;
import net.testiteasy.screens.an_error_occurred.AnErrorOccurredScreenObjectFactory;
import net.testiteasy.utils.variables.OSType;

import static net.testiteasy.utils.config.TestProjectConfig.testConfig;

public class AnErrorOccurredStepDefinitions {
    private final AnErrorOccurredScreen anErrorOccurredScreen = AnErrorOccurredScreenObjectFactory.get();

    @When("user checks error text")
    public void userCheckErrorText() {
        final String errorTextIos = "Sorry, could not load the article";
        final String errorTextAndroid = "An error occurred";
        if (testConfig().getOSType() == OSType.IOS) {
            anErrorOccurredScreen.checkErrorText(errorTextIos);
        } else {anErrorOccurredScreen.checkErrorText(errorTextAndroid);}
    }

    @When("user clicks on back button")
    public void userClicksOnButton() {anErrorOccurredScreen.clickOnBackButton();}

}
