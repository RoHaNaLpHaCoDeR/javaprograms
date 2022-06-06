class MyThr2 extends Thread{
    public MyThr2(){
        System.out.println("I am a constructor ");
    }
    // VARIOUS CONSTRUCTORS (MOST COMMONLY USED)

    /*
    1. Thread();
    2. Thread(String name);
    3. Thread(Runnable r);
    4. Thread(Runnable r, String name);
    */

    @Override
    public void run() {
        while(true){
            System.out.println("Thank You " + this.getId());
        }
    }
}

public class CWH_CH13_54_ThreadMethods {
    public static void main(String[] args) {
        MyThr2 mtr1 = new MyThr2();
        MyThr2 mtr2 = new MyThr2();
        mtr1.start();
        try{
            mtr1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        mtr2.start();
        // default id comes out to be Thread - 0;
        // getId() --> returns Thread Id;
        // getName() --> returns Thread Name;
    }
}
