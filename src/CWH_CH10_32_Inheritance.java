class Base{
    int x;
    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public Base(){
        System.out.println("I am in base class");
    }


}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Derived(){
        System.out.println("I am in Derived class");
    }
}
public class CWH_CH10_32_Inheritance {
    public static void main(String[] args) {
        //Creating object of a Base Class
        Base B = new Base();
        B.setX(34);
        System.out.println(B.getX());


        //Creating object of a derived class
        Derived D = new Derived();
        D.setY(43);
        System.out.println(D.getY());
    }
}
