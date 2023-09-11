package net.testiteasy.screens.main;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.testiteasy.utils.variables.OSType;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static net.testiteasy.utils.config.TestProjectConfig.testConfig;

@SuppressWarnings("unused")
public class MainScreen {

    private final By SKIP_BUTTON = By.id("Skip");
    private final By A_SEARCH_WIKIPEDIA_FIELD = By.id("search_container");
    private final By I_SEARCH_WIKIPEDIA_FIELD = By.id("corner_light");

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Explore\"]")
    private SelenideElement EXPLORE_ICON;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"corner_light\"]")
    private SelenideElement SEARCH_WIKIPEDIA_FIELD;

    public void waitForMainContainerToAppear() {
        if (testConfig().getOSType() == OSType.IOS) {
            if ($(SKIP_BUTTON).is(Condition.visible)) {
                $(SKIP_BUTTON).click();
            }
        }
    }

    public void checkExploreIcon() {
        EXPLORE_ICON.shouldBe(Condition.visible);
    }

    public void clickOnSearchField() {
        $(SEARCH_WIKIPEDIA_FIELD).shouldBe(Condition.visible).click();
    }
}
