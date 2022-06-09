class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative tostring";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class CWH_CH14_60_ThrowVsThrows {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI *r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
        //Throw - used to throw an exception explicitly by the programmer
        //Throws - message to other programmer that the method
        // will throw an exception or to declare an exception, so it
        // is better be prepared with try catch block.
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        try{
            double ar = area(-1);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
