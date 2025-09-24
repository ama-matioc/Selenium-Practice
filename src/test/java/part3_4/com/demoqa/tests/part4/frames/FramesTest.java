package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {
    @Test
    public void testFramesBigBox(){
        var framesPage= homePage.goToAlertsFramesWindows().clickFrames();
        String actualBigBoxText= framesPage.getTextInBigFrame();
        String expectedText= "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedText, "Actual and expected text do not match");
        String actualHeaderText=framesPage.getHeaderFramesText();
        String expectedHeaderText= "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "Actual and expected header do not match");
    }
}
