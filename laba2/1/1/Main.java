
import java.util.GregorianCalendar;

public class Main
{
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("сегодня "+cal.get(cal.YEAR)+" "+cal.get(cal.MONTH)+" "+cal.get(cal.DAY_OF_MONTH));
        cal.setTimeInMillis(1235467898765L);
        System.out.println("1235467898765 миллисекунд это "+cal.get(cal.YEAR)+" "+cal.get(cal.MONTH)+" "+cal.get(cal.DAY_OF_MONTH));
    }
}
