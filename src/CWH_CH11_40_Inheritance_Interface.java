
interface sampleInterface{
    void meth1();
    void meth2();

}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
    // cannot be done with classes only with interface
    // interface can extend other interface
}

class MySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class CWH_CH11_40_Inheritance_Interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
