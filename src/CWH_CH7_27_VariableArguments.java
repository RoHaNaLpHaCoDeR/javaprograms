public class CWH_CH7_27_VariableArguments {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int ...arr){
//        //Available as int [] arr;
//        int result=0;
//        for(int a:arr){
//            result+=a;
//        }
//        return result;
//    }
    static int sum(int x,int ...arr){
        //Available as int [] arr;
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to var args tutorial");
//        System.out.println("The sum of nothing is : " + sum());
        System.out.println("The sum of 4 and 5 is : " + sum(4,5));
        System.out.println("The sum of 4 and 5 and 6 is: " + sum(4,5,6));
        System.out.println("The sum of 2 and 4 and 5 and 6 is: " + sum(2,4,5,6));


    }
}
