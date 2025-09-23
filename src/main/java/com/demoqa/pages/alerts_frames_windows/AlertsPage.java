package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowsPage{
    private By informationAlertButton= By.id("alertButton");
    private By confirmAlertButton= By.id("confirmButton");
    private By confirmationResult= By.id("confirmResult");
    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }
    public void clickConfirmAlertButton(){
        click(confirmAlertButton);
    }
    public String getConfirmationResult(){
        return find(confirmationResult).getText();
    }
}
