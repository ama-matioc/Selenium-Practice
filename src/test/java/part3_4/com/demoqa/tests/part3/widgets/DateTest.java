package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {
    String month="December";
    String monthNumber="12";
    String day="31";
    String year="2034";
    @Test
    public void testSelectingDate(){
        var datePickerPage= homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate= datePickerPage.getDate();
        String expectedDate= monthNumber+"/"+day+"/"+year;
        Assert.assertEquals(actualDate,expectedDate, "\n Actual & Expected Dates do not match \n");
    }
}
