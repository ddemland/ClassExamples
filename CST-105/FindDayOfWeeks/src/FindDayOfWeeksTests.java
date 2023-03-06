import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class FindDayOfWeeksTests {

	@Test
	void test()
	{
		var dow = DayOfWeek.FRIDAY;
        var startDate = LocalDate.of(2022, 1, 1);
        var answer = FindAllDaysOfWeek.GetCountOfDayInMonth(dow, startDate);
        assertEquals(4, answer);
        var day = FindAllDaysOfWeek.GetLastDayOfMonth(Month.JANUARY, 2022, dow);
        assertEquals(1, day.getMonthValue());
        assertEquals(28, day.getDayOfMonth());
        assertEquals(2022, day.getYear());

        startDate = LocalDate.of(2022, 2, 1);
        answer = FindAllDaysOfWeek.GetCountOfDayInMonth(dow, startDate);
        assertEquals(4, answer);
        day = FindAllDaysOfWeek.GetLastDayOfMonth(Month.FEBRUARY, 2022, dow);
        assertEquals(2, day.getMonthValue());
        assertEquals(25, day.getDayOfMonth());
        assertEquals(2022, day.getYear());

        startDate = LocalDate.of(2022, 4, 1);
        answer = FindAllDaysOfWeek.GetCountOfDayInMonth(dow, startDate);
        assertEquals(5, answer);
        day = FindAllDaysOfWeek.GetLastDayOfMonth(Month.APRIL, 2022, dow);
        assertEquals(4, day.getMonthValue());
        assertEquals(29, day.getDayOfMonth());
        assertEquals(2022, day.getYear());
	}

}
