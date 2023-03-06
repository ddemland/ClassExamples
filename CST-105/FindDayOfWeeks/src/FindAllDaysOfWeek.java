import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class FindAllDaysOfWeek
{
	public static int GetCountOfDayInMonth(DayOfWeek dow, LocalDate startDate)
	{
        var date = startDate;
        int count = 0;
        while (date.getMonth() == startDate.getMonth())
        {
            if (date.getDayOfWeek() == dow)
            {
                count++;
            }
            
            date = date.plusDays(1);
        }
        
        return count;
	}

	public static LocalDate GetLastDayOfMonth(Month month, int year, DayOfWeek dow)
	{
		var now = LocalDate.of(year, month, 1);
		var lastInMonth = now.with(TemporalAdjusters.lastInMonth(dow));
		return lastInMonth;
	}
}
