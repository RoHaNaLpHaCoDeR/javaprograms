class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
//        while(true){
//            System.out.println("I am a Thread");
//        }
        System.out.println("Thank you");
    }
}

public class CWH_CH13_51_ThreadConstructor {
    public static void main(String[] args) {
        MyThr thr1 = new MyThr("Rohan");
        MyThr thr2 = new MyThr("Arora");
        thr1.start();
        thr2.start();
        System.out.println("The id of the thread is " + thr1.getId());
        System.out.println("The id of the thread is " + thr2.getId());
        System.out.println("The name of the thread is "+ thr1.getName());
        System.out.println("The name of the thread is "+ thr2.getName());
    }
}
