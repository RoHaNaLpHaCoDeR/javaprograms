public class CWH_CH14_61_FinallyBlock {
    public static int greet(){
        try{
            int a= 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End of the function");
        }
        return -1;
    }
    public static void main(String[] args) {
        // finally - contains code which is always executed no matter
        // what whether the exception is handled or not.
        // Kisi bhi hall main execute hoga hi.
//        try{
//            int a= 5;
//            int b = 0;
//            int c = a/b;
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        finally{
//            System.out.println("End of the program");
//        }
        //In this program finally block makes no sense
//        int k = greet();
//        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for the value of b = " + b);
            }
            b--;
        }

        // VALID JAVA CODE
        // We cannot write try block without catch block, but we can write it with finally block
        /*
        try{
            System.out.println(50/3);
        }
        finally{
            System.out.println("This is a finally block");
        }
         */
    }
}
