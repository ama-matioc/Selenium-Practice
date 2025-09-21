package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowsPage{
    private By informationAlertButton= By.id("alertButton");
    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }
}
