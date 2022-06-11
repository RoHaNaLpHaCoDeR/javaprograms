import java.util.*;

public class CWH_CH15_69_DateTime {
    public static void main(String[] args) {
        /*
        Date & Time in Java
        java time -> package for date & time in java from java onwards

        Before java 8, java util package used to hold the date time class now these classes are deprecated

        How java stores a Date?
        Date in java is stored in the form of a long numer. This long number holds the number of miliseconds passed since 1 jan 1970

        Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed

        System current Time Millis () returns no of sound passed Once no. of ms are calculated, we can calculate minutes, seconds & years passed
         */
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        Date d= new Date();

        Date d1= new Date(); //both dates are different
        System.out.println(d);
        System.out.println(d1.compareTo(d));
        System.out.println(d.getTime());
//        System.out.println(d.getDate());
//        System.out.println(d.getSeconds());
//        System.out.println(d.getYear());
    }
}
