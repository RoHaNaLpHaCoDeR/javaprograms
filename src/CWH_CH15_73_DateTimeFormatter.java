import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_CH15_73_DateTimeFormatter {
    public static void main(String[] args) {
        /*
        DateTimeFormatter in Java
        This class helps us to print and parse date and time in our desired format.
        The format() method of the DateTimeFormatter class is used to format the dates using our desired format.
        Syntax :
        public String format(DateTimeFormatter formatter)
        Parameter :
        The object of the formatter to be used is passed, and it can not be null.
        Exception :
        This method throws DateTimeException.
        Return Value :
        Returns the string in the format specified by the user.
         */

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formatting : "+ myDate);

    }
}
