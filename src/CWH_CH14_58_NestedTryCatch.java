import java.util.Scanner;

public class CWH_CH14_58_NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc  = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the index= ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video number 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist ");
                    System.out.println("Exception at level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("End of the program");
    }
}
