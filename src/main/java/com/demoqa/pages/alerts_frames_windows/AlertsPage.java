package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowsPage{
    private By informationAlertButton= By.id("alertButton");
    private By confirmAlertButton= By.id("confirmButton");
    private By confirmationResult= By.id("confirmResult");
    private By promptAlertButton= By.id("promtButton");
    private By promptResult= By.id("promptResult");

    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }
    public void clickPromptAlertButton(){
        click(promptAlertButton);
    }
    public void clickConfirmAlertButton(){
        click(confirmAlertButton);
    }

    public String getConfirmationResult(){
        return find(confirmationResult).getText();
    }

    public String getPromptAlertButton(){
        return  find(promptResult).getText();
    }

}
