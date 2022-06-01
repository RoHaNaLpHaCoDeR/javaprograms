class temporary{
    int a;

    public int getA() {
        return a;
    }

    public temporary(int a){
        this.a=a;
        System.out.println("The value of a is " + this.a);
    }
    public int returnSomething(){
        return 1;
    }
}

class permanent extends temporary{
    int b;
    public permanent(int x){
        super(x);
        System.out.println("The value of x is " + x);
    }
}

public class CWH_CH10_34_ThisSuperKeyword {
    public static void main(String[] args) {
        temporary t = new temporary(34);
//        System.out.println(t.getA());
//        System.out.println(t.returnSomething());
        permanent p = new permanent(56);

    }
}
