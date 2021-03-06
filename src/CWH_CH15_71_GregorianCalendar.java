import java.util.*;
public class CWH_CH15_71_GregorianCalendar {
    public static void main(String[] args) {
        /*
        GregorianCalendar class & TimeZone in java

        1. GregorianCalendar class is the concrete sub-class of the Calendar class.
        2. This class supports both the Julian and Gregorian calendar systems.

        Difference between Calendar and GregorianCalendar class :

        1. The calendar class is an abstract class. So, the instance of this class
           can not be instantiated. Therefore, we need to use the static method
           Calendar.getInstance() to initialize the object of the Calendar class :

           Calendar c = Calendar.getInstance();

        2. Since the GregorianCalendar class is a concrete subclass, it can be
           initialized as :

           GregorianCalendar gcal = new GregorianCalendar();

        Constructors of the GregorianCalendar class :

        1. GregorianCalendar(): This constructor is used to initialize an object
           with the current time in the default time zone.
        2. GregorianCalendar(int year, int month, int day): This constructor is
           used to initialize an object with the date-set specified as parameters
           in the default time zone and default locale.
        3. GregorianCalendar(int year, int month, int day, int hours, int minutes):
           This constructor initializes an object with the given date and time set
           in the default locale and time zone.
        4. GregorianCalendar(int year, int month, int day, int hours, int minutes,
           int seconds): This constructor initializes an object with the more specific
           time and date-set passed as a parameter in the default locale and time zone.
        5. GregorianCalendar(Locale locale): Initializes a GregorianCalendar object
           with the current date and time in the default time zone and the specified
           locale.
        6. GregorianCalendar(TimeZone timeZone): Initializes a GregorianCalendar object
           with the current date and time in the default locale and the specified time
           zone.
        7. GregorianCalendar(TimeZone timeZone, Locale locale): Initializes an object
           with the locale and timezone passed as parameters.
         */


        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));

        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling : " + c.getTime());

        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + c.getTime());

        System.out.println("Calendar : " + c.getTime());

        System.out.println("The hashcode for this calendar is : "+ c.hashCode());

        Calendar d = Calendar.getInstance();
        System.out.println(d.get(Calendar.SECOND));
        System.out.println(d.getTime());
        System.out.println(d.get(Calendar.DATE));
        System.out.println(d.get(Calendar.HOUR));
        System.out.println(d.get(Calendar.HOUR_OF_DAY) + ":" + d.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        GregorianCalendar dal = new GregorianCalendar();
        System.out.println(dal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
