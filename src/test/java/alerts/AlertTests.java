package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testEnterTextInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_enterText();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: wow", "Entered text don't match result");
    }

    @Test
    public void testEnterTextInAlert2(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_enterText();
        String text = "awesome course";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: "+ text, "Entered text don't match result");
    }
}
