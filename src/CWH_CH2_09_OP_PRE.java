public class CWH_CH2_09_OP_PRE {
    public static void main(String[] args) {
        int a  =6*5-34/2;
        // check precedence first but associativity is used only to break the tie between the operators
        int x = 6;
        int y=1;
        int b = x*y/2;
        System.out.println(b);
    }
}
