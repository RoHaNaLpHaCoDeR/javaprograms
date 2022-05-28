class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volumeCylinder(){
        return 3.142*radius*radius*height;
    }

}
class Rectangle{

    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 56;
        this.breadth = 67;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class CWH_CH9_PS9 {
    public static void main(String[] args) {
        // problem 1 and 4
//        cylinder myCylinder = new cylinder(9,12);
////        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
////        myCylinder.setRadius(45);
//        System.out.println(myCylinder.getRadius());
//
//        // problem 2
//        System.out.println(myCylinder.volumeCylinder());

        //problem 3
        Rectangle r = new Rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        Rectangle r1 = new Rectangle(34,76);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

    }
}
