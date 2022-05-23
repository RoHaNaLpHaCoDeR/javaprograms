import java.sql.SQLOutput;

class Employees{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("ringing........");
    }
    public void vibrating(){
        System.out.println("vibrating......");
    }
    public void callFriend(){
        System.out.println("Calling friend....");
    }
}

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void running(){
        System.out.println("Running from the enemy");
    }
    public void firing(){
        System.out.println("firing on the enemy");
    }
}
public class CWH_CH8_PS8 {
    public static void main(String[] args) {
        //Problem 1
        Employees Rohan = new Employees();
        Rohan.setName("CodeWithRohan");
        System.out.println(Rohan.getName());
        Rohan.salary =100000000;
        System.out.println(Rohan.getSalary());
        //Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrating();
        asus.ringing();
        //Problem 3
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        //Problem 4 same as 3
        //Problem 5
        Tommy t = new Tommy();
        t.firing();
        t.hit();
        t.running();
    }
}
