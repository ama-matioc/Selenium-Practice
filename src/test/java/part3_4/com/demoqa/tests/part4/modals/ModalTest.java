package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {
    @Test
    public void testSmallModal(){
        var alertsFramesWindowsPage= homePage.goToAlertsFramesWindows().clickModalDialogs();
        alertsFramesWindowsPage.clickSmallModalButton();
        String actualText= alertsFramesWindowsPage.getSmallModalText();
        String expectedText="This is a small modal. It has very less content";
        Assert.assertEquals(actualText,expectedText);
        alertsFramesWindowsPage.clickCloseButton();
    }
}
