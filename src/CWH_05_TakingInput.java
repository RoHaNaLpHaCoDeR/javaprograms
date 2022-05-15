import java.util.Arrays;
import  java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args)); //soutp
        System.out.println("args = " + Arrays.toString(args)); //soutv
        System.out.println("CWH_05_TakingInput.main");  //soutm
        System.out.println("Taking input from the user"); //sout
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a+b;
//        float sum = a+b;
//        System.out.println("The sum of the number is");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}

