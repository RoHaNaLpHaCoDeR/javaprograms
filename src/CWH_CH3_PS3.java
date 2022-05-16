import java.util.Locale;

public class CWH_CH3_PS3 {
    public static void main(String[] args) {
        // Problem 1
        String name  = "RoHAN ARORA";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = " Dear name , Thanks a lot!!";
        String letter1 = letter.replace("name", "Harry");
        System.out.println(letter);
        System.out.println(letter1);

        // Problem 4
        String Ultimate = "This String  contains     double and        triple spaces";
        System.out.println(Ultimate.indexOf("  "));
        System.out.println(Ultimate.indexOf("   "));

        // Problem 5
        String Letter = "Dear Rohan,\n\tThis java course is nice \n\tThanks";
        System.out.println(Letter);
    }
}
