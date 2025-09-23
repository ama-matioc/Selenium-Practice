package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;
@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert(){
        var alertPage= homePage.goToAlertsFramesWindows().clickAlerts();
        alertPage.clickInformationAlertButton();
        String expectedText="You clicked a button";
        Assert.assertEquals(getAlertText(), expectedText, "Actual and expected message don't match");
        acceptAlert();

    }

    public void testConfirmationAlert(){
        var alertPage= homePage.goToAlertsFramesWindows().clickAlerts();
        alertPage.clickConfirmAlertButton();
        dismissAlert();
        String expectedResult="You selected Cancel";
        Assert.assertEquals(alertPage.getConfirmationResult(), expectedResult, "You didn't select cancel ");
    }
    public void testPromptAlert(){
        String alertText="John Doe";
        String expectedResult= "You entered "+alertText;
        var alertPage= homePage.goToAlertsFramesWindows().clickAlerts();
        alertPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult= alertPage.getPromptAlertButton();
        Assert.assertEquals(actualResult, expectedResult, "Actual and expected message don't match");
    }
}
