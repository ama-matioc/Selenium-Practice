package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropdownTest extends BaseTest {

    @Test
    public void testMultiSelectDropdown(){
        var selectMenuPage= homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMultiSelect("Volvo");
        selectMenuPage.selectStandardMultiSelect(1);
        selectMenuPage.selectStandardMultiSelect("Audi");
        selectMenuPage.selectStandardMultiSelect(2);

        selectMenuPage.deselectStandardMultiSelect("audi");

        List<String> actualSelectedOptions= selectMenuPage.getAllSelectedStandardMultiSelectOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertTrue(actualSelectedOptions.contains("Saab"));
        Assert.assertFalse(actualSelectedOptions.contains("Audi"));


    }
}
