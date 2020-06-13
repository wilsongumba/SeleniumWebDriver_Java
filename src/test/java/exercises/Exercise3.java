package exercises;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Exercise3 extends BaseTests {

    @Test
    public void moveSliderRight(){
        var sliderPage = homePage.clickArrows();
        sliderPage.pressArrows();
        assertEquals(sliderPage.getNumber(), "4");
    }

}
