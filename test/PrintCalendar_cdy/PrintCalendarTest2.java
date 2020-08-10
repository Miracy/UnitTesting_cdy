package PrintCalendar_cdy;
import static org.junit.Assert.*;
import org.junit.Test;
public class PrintCalendarTest2 {
	public static PrintCalendar pc=new PrintCalendar();
	public static String result1;
	public static int result2;

	@Test
	public void testGetMonthName() {
		result1=pc.getMonthName(9);
		assertEquals("September",result1);
		
	}
	
	@Test
	public void testGetNumberOfDaysInMonth() {
		result2=pc.getNumberOfDaysInMonth(2016, 2);
		assertEquals(29,result2);
	}
	
	@Test
	public void testIsLeapYear() {
		assertEquals(true,pc.isLeapYear(2020));
	}
}
