package org.example;

import org.testng.annotations.Test;

public class AssistantTest extends BasePage {
    @Test
    public void featuredHelpQuestionListResult() {

        TrendyolHomePage homePage = new TrendyolHomePage();
        SupportHelpPage orderList = new SupportHelpPage();

        homePage.goToPage();
        homePage.closePopup();
        homePage.gotoHelpSupportTab();
        orderList.verifySiparisListesiExpandMenu();


    }


}
