class MyRunnableThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
        System.out.println("Running Thread 1 ");
    }
}

class MyRunnableThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
        System.out.println("Running Thread 2 ");
    }
}

public class CWH_CH13_49_ExtendingRunnableInterface {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        MyRunnableThread2 bullet2 = new MyRunnableThread2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
