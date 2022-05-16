import java.util.Locale;

public class CWH_CH3_14_StringMethods {
    public static void main(String[] args) {
        String firstName = "Rohan Arora";
//        String lastName = new String("Arora");
//        System.out.println(firstName);
//        int value = firstName.length();
//        System.out.println(value);
//        var value1 = firstName.length();
//        System.out.println(value1);
//        String lowerString = firstName.toLowerCase();
//        System.out.println(lowerString);
//        System.out.println(lowerString.toUpperCase());
//        String nonTrimmedString = "           hello        ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);
//        System.out.println(firstName.substring(2));
//        System.out.println(firstName.substring(0));
//        System.out.println(firstName.substring(1,5));
//        System.out.println(firstName.replace("r","p"));
//        System.out.println(firstName.replace("an","pq"));
//        System.out.println(firstName.replace("r","pet"));
//
//        System.out.println(firstName.startsWith("Ro"));
//        System.out.println(firstName.endsWith("rohan"));
//
//        System.out.println(firstName.charAt(2));

        String modified_name = "Hello Rohan Arora";
//        System.out.println(modified_name.indexOf("ro"));
//        System.out.println(modified_name.indexOf("a", 4));
        System.out.println(modified_name.lastIndexOf("h"));
        System.out.println(modified_name.lastIndexOf("Roh",12));
        System.out.println(firstName.equals("Rohan Arora"));
        System.out.println(firstName.equalsIgnoreCase("rohan arora"));
        System.out.println("I am \n escape \t sequence character \" " );
    }

}
