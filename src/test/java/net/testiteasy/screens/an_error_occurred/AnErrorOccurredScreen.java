package net.testiteasy.screens.an_error_occurred;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

import static com.codeborne.selenide.Selenide.*;
import static net.testiteasy.utils.config.TestProjectConfig.testConfig;

public class AnErrorOccurredScreen {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private SelenideElement ERROR_BUTTON;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sorry, could not load the article\"]")
    private SelenideElement ERROR_TEXT;

    public void checkErrorText(String errorText) {
        ERROR_TEXT.shouldBe(Condition.visible).shouldHave(Condition.text(errorText));
    }

    public void clickOnBackButton() {ERROR_BUTTON.shouldBe(Condition.visible).click();}

}
