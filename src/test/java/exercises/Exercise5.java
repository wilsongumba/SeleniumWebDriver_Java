package exercises;



//nested loops

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exercise5 extends BaseTests {

    @Test
    public void testNestedLoops(){
        var nestedLoopsPage = homePage.clickFrames().clickNestedFrames();
        nestedLoopsPage.getTextFromLeftFrame();
        assertEquals(nestedLoopsPage.getTextFromLeftFrame(),"LEFT", "Alert text incorrect");
        assertEquals(nestedLoopsPage.getTextFromBottomFrame(),"BOTTOM", "Alert text incorrect");
    }

}
