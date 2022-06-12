import java.time.*;
public class CWH_CH15_72_Time {
    public static void main(String[] args) {
        /*
        java.time API - Classes & Methods
        Date and time features in Java is primarily supported by two packages :

        java.util
        java.time
        The package java.time was added with the release of Java 8 with the aim
        of solving problems faced by Java developers while handling date and time
        with java.util package such as representing a date without time, etc.
         */
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());

        Clock c2 = Clock.systemUTC();
        System.out.println(c2.instant());

        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
        System.out.println(d1.isNegative());
        System.out.println(d1.isZero());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d2.isNegative());
        System.out.println(d2.isZero());

        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate dl= LocalDate.parse("2021-05-26");
        LocalDate dc= LocalDate.parse("2021-05-26");

        System.out.println(dl.equals(d));
        System.out.println(dc.equals(dl));

        LocalTime t = LocalTime.now();
        System.out.println("Time before : "  + t);

        LocalTime t1= t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}
