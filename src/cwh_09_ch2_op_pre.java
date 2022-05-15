public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        int a  =6*5-34/2;
        // check precedence first but associativity is used only to break the tie between the operators
        int x = 6;
        int y=1;
        int b = x*y/2;
        System.out.println(b);
    }
}
