import java.util.Scanner;

public class CWH_CH14_57_SpecificException {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index= ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with= ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch(ArithmeticException f){
            System.out.println("Arithmetic exception occured ");
            System.out.println(f);
        }
        catch(ArrayIndexOutOfBoundsException g){
            System.out.println("Array Index out of bound exception occured ");
            System.out.println(g);
        }
        catch(Exception e){
            System.out.println("Other exception occured ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
