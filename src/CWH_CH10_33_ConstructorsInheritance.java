import java.sql.SQLOutput;

class Base1{
    int X;

    public Base1() {
        System.out.println("I am a base class constructor");
    }

    public Base1(int x) {
        System.out.println("The value of x is " + x);;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }
}

class Derived1 extends Base1{
    int Y;

    public Derived1() {
//        super(13);
        System.out.println("I am a Derived class constructor");
    }
    public Derived1(int x,int y){
        super(x);
        System.out.println("I am derived class constructor with value equal to " + y);
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}

class childofDerived1 extends Derived1{
    int z;
    public childofDerived1(){
        System.out.println("I am a child of derived constructor");
    }
    public childofDerived1(int x,int y,int z){
        super (x, y);
        System.out.format("The value of x,y,z are %d,%d,%d respectively",x,y,z);
    }
}
public class CWH_CH10_33_ConstructorsInheritance {
    public static void main(String[] args) {
//        Base1 B= new Base1(34);
//        Derived1 D = new Derived1();
//        Derived1 D = new Derived1(2,5);
        childofDerived1 c = new childofDerived1(4,7,8);
    }
}
