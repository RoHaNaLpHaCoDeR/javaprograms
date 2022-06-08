public class CWH_CH14_56_TryCatchException {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // Without try catch block
//        int c  = a/b;
//        System.out.println("The result is : " + c);
        // With try catch block
        try{
            int c  = a/b;
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason is : " + e);
        }
        System.out.println("End of your program.");
    }
}
