package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {
    @Test
    public void testInformationAlert(){
        var alertPage= homePage.goToAlertsFramesWindows().clickAlerts();
        alertPage.clickInformationAlertButton();
        String expectedText="You clicked a button";
        Assert.assertEquals(getAlertText(), expectedText, "Actual and expected message don't match");
        acceptAlert();

    }
}
