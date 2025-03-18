package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateAddDaysTest {

	@Test
    public void stayInSameMonth() {
        Date startDate = new Date("June", 10, 2019);
        startDate.addOneDay();
        assertEquals(new Date("June", 11, 2019), startDate);
    }
	@Test
    public void stayInSameMonth2() {
        Date startDate = new Date("June", 10, 2019);
        assertEquals("Did not return correct value", new Date("June", 11, 2019), startDate.addOneDay());
    }

    @Test
    public void crossMonthBound() {
        Date startDate = new Date("June", 30, 2019);
        assertEquals(new Date("July", 1, 2019), startDate.addOneDay());
    }

    @Test
    public void crossYearBound() {
        Date startDate = new Date("December", 31, 2019);
        assertEquals(new Date("January", 1, 2020), startDate.addOneDay());
    }

}
