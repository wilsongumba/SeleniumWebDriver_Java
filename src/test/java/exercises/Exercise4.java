package exercises;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Exercise4 extends BaseTests {

    @Test
    public void openContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInTheBox();
        String alerttext = contextMenuPage.getPopUpText();
        assertEquals(alerttext, "You selected a context menu", "Result text incorrect");
        contextMenuPage.acceptPopUp();
    }
}
