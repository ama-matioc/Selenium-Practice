package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsPage {
    private By textInFrame=By.id("sampleHeading");
    private String iFrameBigBox="frame1";
    private By headerFramesText= By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }
    private void switchToBigBox(){
        switchToFrameString(iFrameBigBox);
    }
    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText= find(textInFrame).getText();
        System.out.println("Big Frame Text: "+ bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }
}
