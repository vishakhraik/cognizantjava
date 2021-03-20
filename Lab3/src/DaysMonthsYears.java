import java.time.LocalDate;
import java.time.Period;

public class DaysMonthsYears {

	public static void main(String[] args) {
		  LocalDate date1 = LocalDate.of(1998, 12, 27);
	      LocalDate date2 = LocalDate.of(2021, 3, 20);
	      System.out.println("Date 1 = "+date1);
	      System.out.println("Date 2 = "+date2);
	      Period p = Period.between(date1, date2);
	      System.out.println("Years  "+p.getYears());
	      System.out.println("Month  "+p.getMonths());
	      System.out.println("Days  "+p.getDays());

	}

}
