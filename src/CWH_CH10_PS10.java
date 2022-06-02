class Circle{
    int radius;
    public Circle(){
        System.out.println("I am non parametrized constructor");
    }
    public Circle(int A) {
        System.out.println("I am parametrized constructor");
        this.radius = A;
    }
    public int getRadius() { return radius;}
    public void setRadius(int radius) {this.radius = radius;}
    public double area(){return Math.PI*this.radius*this.radius; }
}
class Cylinder extends Circle{
    int height;
    public Cylinder(int r, int h){
        super(r);
        this.height = h;
        System.out.println("I am a parametrized constructor of cylinder class");
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double area() {
        return 2 * Math.PI * radius * height;
    }
    public double volume() { return radius* Math.PI * radius * height; }
}

class Rectangle1{
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectangle1(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area(){
        return length*breadth;
    }
}

class Cuboid extends Rectangle1{
    int height;

    public Cuboid(int l,int b,int h) {
        super(l,b);
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return 2*(length*breadth + length*height + breadth*height);
    }

    public int volume(){
        return length*breadth*height;
    }
}
public class CWH_CH10_PS10 {
    public static void main(String[] args) {
        // Problem 1 and 3
        Circle C = new Circle();
        // Problem 2 and 4

    }
}
