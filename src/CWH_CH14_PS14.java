import java.util.Scanner;

public class CWH_CH14_PS14 {
    public static void main(String[] args) {
        // Problem 1
        // Syntax error int a= 7

        // logical error
        int age = 78;
        int year_born = 2000-78;

        // Runtime error
        // divide by 0

        // Problem 2
//        try{
//            int a = 666/0;
//
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("hehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }

        // Problem 3
        boolean flag = true;
        int [] marks = new int[5];
        marks[0] = 9;
        marks[1] = 19;
        marks[2] = 29;
        marks[3] = 39;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            System.out.println("Enter the value of index = ");
            try{
                index = sc.nextInt();
                System.out.println("The value of marks[index] " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }

    }
}
