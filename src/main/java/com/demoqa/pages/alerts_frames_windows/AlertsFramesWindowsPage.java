package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFramesWindowsPage extends HomePage {
    private By modalDialogsMenuItem= By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By AlertsMenuItem= By.xpath("//li[@id='item-1']/span[text()='Alerts']");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlerts(){
        scrollToElementJS(AlertsMenuItem);
        click(AlertsMenuItem);
        return new AlertsPage();
    }

}
