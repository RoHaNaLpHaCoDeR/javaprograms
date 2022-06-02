abstract class Student{
    abstract public void firstname();
    abstract public void lastname();

    abstract public double calculate_marks(double eng, double hin);

    public void age(int a){
        System.out.println("My age is " + a);
    }
}
class Rohan extends Student{
    @Override
    public void firstname() {
        System.out.println("My name is Rohan.");
    }
    public void firstname(int r){
        System.out.println(r);
    }
    @Override
    public void lastname() {
        System.out.println("My name is Arora.");
    }

    @Override
    public double calculate_marks(double eng, double hin) {
        return eng*hin;
    }
}
abstract class Ojaswi extends Student{
    public void gender(){
        System.out.println("I am Female");
    }
}

public class CWH_CH11_37_AbstractClassInterfaces {
    public static void main(String[] args) {
        Rohan R = new Rohan();
        R.firstname(2);
        R.lastname();
        System.out.println(R.calculate_marks(34.65,54.76));
        // Student st = new Student();
        // Objects of abstract class cannot be created or instantiated
    }
}
