/*
Optional Independent Exercise
For your optional independent exercise, go to our site, The Internet, and click on the Forgot Password link.

Enter an email address here. The email can be anything.

For example, “tau@example.com” so it doesn't have to be a real email address.

Click this Retrieve Password button and verify on this new page that you have this message saying, “Your e-mail's been sent!”.

Good luck!

*/

package exercises;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class Exercise2 extends BaseTests {

    @Test
    public void testSuccessfulPasswordReset(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("test@tau.com");

        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getConfirmationText().contains("Your e-mail's been sent!"),"The text do not exist");
    }
}
