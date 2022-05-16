public class CWH_CH4_16_Logical_operators {
    public static void main(String[] args) {
        boolean a =true;
        boolean b =true;
        boolean c =true;
        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a|| b ||c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if(!a){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
