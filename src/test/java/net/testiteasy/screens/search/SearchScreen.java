package net.testiteasy.screens.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.testiteasy.utils.variables.OSType;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static net.testiteasy.utils.config.TestProjectConfig.testConfig;

@SuppressWarnings("unused")
// TODO -->
// -- This screen should be changed and finished in courses.
// -- You need to change the selectors to the correct ones
// -- and think over the logic of using this screen.
public class SearchScreen {

    private final By SKIP_BUTTON = By.id("Skip");
    private final By A_PAGE_LIST_ITEM_DESCRIPTION = By.id("page_list_item_description");
    private final By I_PAGE_LIST_ITEM_DESCRIPTION = By.xpath("//XCUIElementTypeStaticText[@name=\"Television series\"]");

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Explore\"]")
    private SelenideElement EXPLORE_ICON;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Wikipedia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSearchField")
    private SelenideElement EDIT_TEXT;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Did you mean open so?\"]")
    private SelenideElement SEARCH_SUGGESTION;

    public void waitForMainContainerToAppear() {
        if (testConfig().getOSType() == OSType.IOS) {
            if ($(SKIP_BUTTON).is(Condition.visible)) {
                $(SKIP_BUTTON).click();
            }
        }

        EXPLORE_ICON.shouldBe(Condition.visible);
    }

    public void fillOutSearchField(String innerText) {
        EDIT_TEXT.shouldBe(Condition.visible).setValue(innerText);
    }

    public void waitForSearchSuggestion() {
        SEARCH_SUGGESTION.shouldBe(Condition.visible);
    }

    public void scrollIntoViewWithTextAndClick(String text) {
        if (testConfig().getOSType() == OSType.IOS) {
            $(I_PAGE_LIST_ITEM_DESCRIPTION)
                    .scrollTo().shouldBe(Condition.visible).click();
        } else {
            $$(A_PAGE_LIST_ITEM_DESCRIPTION).findBy(Condition.text(text))
                    .scrollTo()
                    .shouldBe(Condition.visible).click();
        }
    }
}