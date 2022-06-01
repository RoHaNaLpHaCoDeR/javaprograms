class A{
    private int a=6;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A = " + a);
    }
}
class B extends A{
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}

public class CWH_CH10_35_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
        b.meth3();
    }
}
