
class Practice1_1 extends Thread{
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class Practice1_2 extends Thread{
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class CWH_CH13_PS13 {
    public static void main(String[] args) {
        // Problem 1 2 3 4 5
        Practice1_1 pt1 = new Practice1_1();
        Practice1_2 pt2 = new Practice1_2();
        pt1.setPriority(6);
        pt2.setPriority(8);
        System.out.println(pt1.getPriority());
        System.out.println(pt2.getPriority());
        System.out.println(pt1.getState());
        System.out.println(pt2.getState());
        System.out.println(Thread.currentThread().getState());
        pt1.start();
        pt2.start();
        // Problem 2
        /*just added sleep statement along with
        try-catch block to handle exceptions.
        */

    }
}
