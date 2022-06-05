class MyThread1 extends Thread{

    @Override
    public void run(){
         while(true){
             System.out.println("My thread 2 is running");
             System.out.println("I am 1 happy");
         }
    }
}
// METHOD 1 - BY EXTENDING THE THREAD CLASS
class MyThread2 extends Thread{

    @Override
    public void run(){
        while(true){
            System.out.println("My thread 2 is running");
            System.out.println("I am 2 happy");
        }
    }
}
public class CWH_CH13_48_CreatingThreads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
