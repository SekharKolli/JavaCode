import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UndestandingCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int mm = cal.get(Calendar.MONTH)+1; // Count is from 0 to 11, so we need to add 1 to display info
		int yy = cal.get(Calendar.YEAR);
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		
		System.out.println("Variables [dd=" + dd + ", mm=" + mm + ", yy=" + yy + ", hh=" + hh +", mi=" + mi + "]");
		
		Date date = new Date();
		System.out.println(date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
		String dt = sdf.format(date);
		System.out.println(dt);
		

	}

}
