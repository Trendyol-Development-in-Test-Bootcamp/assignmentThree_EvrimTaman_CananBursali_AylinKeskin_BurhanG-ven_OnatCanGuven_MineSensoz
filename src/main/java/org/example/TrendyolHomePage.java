package org.example;

import org.example.constants.HelpSupportConstants;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TrendyolHomePage extends BasePage {

    public static String HELP_SUPPORT = ".right > li:nth-of-type(2) > a";
    void goToPage() {
        open(HelpSupportConstants.TrendyolHomePage.URL);
    }

    public void closePopup() {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);

        $(".fancybox-close").click();

    }

    public void gotoHelpSupportTab() {
        findByCss(HELP_SUPPORT).click();
    }


}
