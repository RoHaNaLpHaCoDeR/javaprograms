import java.util.*;

public class CWH_CH15_70_Calendar {
    public static void main(String[] args) {
        /*
        Calendar Class in Java
        The calendar class in java provides the methods that helps in converting date between a specific instant in time.
        It is an abstract class.
        Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
        We use the static method Calender.getInstance() in order to implement a sub-class.
         */

        /*
        Constructors of the Calendar class :
        Calendar(): This constructor is used to construct a calendar with the default time zone & locale.
        Calendar(Time zone, Locale locale): This constructor is used to construct a calendar with the specified time zone & locale.
         */

        Calendar c = Calendar.getInstance();
        System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND));
        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

        System.out.println(c.getWeeksInWeekYear());
    }
}
