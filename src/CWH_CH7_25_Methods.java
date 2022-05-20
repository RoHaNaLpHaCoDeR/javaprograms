public class CWH_CH7_25_Methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
//    int logic(int x,int y){
//        int z;
//        if(x>y){
//            z=x+y;
//        }
//        else{
//            z=(x+y)*5;
//        }
//        return z;
//    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c;
//Method invocation using object creation
//        CWH_CH7_25_Methods obj = new CWH_CH7_25_Methods();
        c= logic(a,b);
        int a1=4;
        int b1=8;
        int c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
