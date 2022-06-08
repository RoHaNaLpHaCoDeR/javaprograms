abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write something good");
    }
    void refill(){
        System.out.println("write something bad");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir !!");
    }
    public void eat(){
        System.out.println("Eating....");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}
public class CWH_CH11_PS11 {
    public static void main(String[] args) {
        // Problem 1 and 2
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        // Problem 3
        Human harry = new Human();
        harry.sleep();
        // Problem 5
        Monkey m = new Human();
        // m.speak(); --> Cannot use speak method because the
        // reference is monkey which does not have speak method
        m.bite();
        m.jump();
    }
}
