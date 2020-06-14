package modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {

    @Test
    public void testCloseAd(){
        var adPage = homePage.clickEntryAd();
        adPage.clickCloseAdButton();
        assertEquals(adPage.getReEnableAdText(), "click here", "Modal not closed");
    }
}
