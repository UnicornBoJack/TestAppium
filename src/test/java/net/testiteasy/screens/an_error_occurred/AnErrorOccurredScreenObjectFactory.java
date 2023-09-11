package net.testiteasy.screens.an_error_occurred;

import net.testiteasy.utils.variables.OSType;

import static com.codeborne.selenide.appium.ScreenObject.screen;
import static net.testiteasy.utils.config.TestProjectConfig.testConfig;

public class AnErrorOccurredScreenObjectFactory {

    public static AnErrorOccurredScreen get() {
        return testConfig().getOSType().equals(OSType.ANDROID) ?
                screen(AndroidAnErrorOccurredScreen.class) :
                screen(IOSAnErrorOccurredScreen.class);
    }
}
