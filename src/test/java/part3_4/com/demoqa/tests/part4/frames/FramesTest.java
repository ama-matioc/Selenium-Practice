package part3_4.com.demoqa.tests.part4.frames;

import io.opentelemetry.sdk.metrics.internal.concurrent.AdderUtil;
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

    @Test
    public void testFramesSmallBox(){
        var framesPage = homePage.goToAlertsFramesWindows().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText,expectedSmallBoxText,
                "\n Actual & Expected Text Do Not Match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Text Do Not Match \n");
    }
}
