package org.example;

import com.codeborne.selenide.SelenideElement;
import org.example.constants.HelpSupportConstants;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SupportHelpPage extends BasePage {

    public static String ITEM_LIST = "#featured-help-questions-button";
    public static String ACCORDION_MENU = ".ui-accordion-header-active";
    public void clickItemList(String term) {
        SelenideElement elem = findByCss(ITEM_LIST);
        $(byText(term)).click();
    }

    public String getMenuText(String term) {
        return $(term).getText();
    }

    public void verifyTexts(String text1, String text2) {
        Assert.assertEquals(text1, text2);

    }

    public void verifySiparisListesiExpandMenu() {
        clickItemList(HelpSupportConstants.SupportHelpPage.ORDER_TRACK);
        String siparisTakibi = getMenuText(ACCORDION_MENU);

        clickItemList(HelpSupportConstants.SupportHelpPage.BASKET_MERGE);
        String siparisBirlestirme = getMenuText(ACCORDION_MENU);


        clickItemList(HelpSupportConstants.SupportHelpPage.REFUND_ORDER);
        String iadeIslemi = getMenuText(ACCORDION_MENU);

        //verifyTexts(siparisTakibi, siparisBirlestirme);
        verifyTexts(siparisTakibi, iadeIslemi);
    }

}
