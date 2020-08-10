package PrintCalendar_cdy;
import static org.junit.Assert.*;
import org.junit.Test;
public class PrintCalendarTest1 {
	public static PrintCalendar pc=new PrintCalendar();
	public static String result1;
	public static int result2;

	@Test
	public void testGetMonthName() {
		result1=pc.getMonthName(3);
		assertEquals("March",result1);

		
	}
	@Test
	public void testGetNumberOfDaysInMonth() {
		result2=pc.getNumberOfDaysInMonth(2019, 2);
		assertEquals(28,result2);

	}
	@Test
	public void testIsLeapYear() {
		assertEquals(false,pc.isLeapYear(2016));
	}
}
