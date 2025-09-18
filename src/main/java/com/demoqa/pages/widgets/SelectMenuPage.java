package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.*;
import static utilities.DropdownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {
    private By standardMultiSelect = By.id("cars");

    public void selectStandardMultiSelect(String text){
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    //overloading the above function
    public void selectStandardMultiSelect(int index){
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMultiSelect(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiSelectOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }
}
