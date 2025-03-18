package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateSetDateTest {
	@Test
    public void validDateTest() {
        Date date = new Date(6, 15, 2022);
        date.setDate("June", 15, 2022);
        assertEquals(new Date(6, 15, 2022), date);
    }

    @Test
    public void invalidDateTest_February30() {
        Date date = new Date(2, 28, 2022);
        date.setDate("February", 30, 2022); 
        assertEquals(new Date(2, 28, 2022), date); 
    }

    @Test
    public void invalidDateTest_November31() {
        Date date = new Date(11, 30, 2022);
        date.setDate("November", 31, 2022); 
        assertEquals(new Date(11, 30, 2022), date); 
    }

    @Test
    public void validDateTest_EndOfMonth() {
        Date date = new Date(4, 30, 2022);
        date.setDate("April", 30, 2022);
        assertEquals(new Date(4, 30, 2022), date);
    }
}

