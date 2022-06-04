class C1{
    private int x = 4;
    public int y = 65;
    protected int z = 12;
    int a = 23;

    public void method(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class CWH_CH12_45_AccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.method();
    }
}
