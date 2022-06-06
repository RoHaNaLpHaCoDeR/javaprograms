class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
//        while(true){
//            System.out.println("I am a Thread");
//        }
        while(true) {
            System.out.println("Thank you " + this.getName());
        }
    }
}

public class CWH_CH13_53_ThreadPriorities {
    public static void main(String[] args) {
        // Ready Queue T1 T2 T3 T4 T5
        // JVM has the responsibility to schedule different threads
        // Thread Scheduler to be more specific
        // Types of Priorities
        // MAX_PRIORITY --> Maximum Priority
        // MIN_PRIORITY --> Minimum Priority
        // NORM_PRIORITY --> Normal Priority

        MyThr1 thr1 = new MyThr1("Rohan");
        MyThr1 thr2 = new MyThr1("Arora");
        MyThr1 thr3 = new MyThr1("Aman");
        MyThr1 thr4 = new MyThr1("Jain");
        MyThr1 thr5 = new MyThr1("Nothing");
        thr1.setPriority(Thread.MAX_PRIORITY);
        thr2.setPriority(Thread.MIN_PRIORITY);
        thr3.setPriority(Thread.MIN_PRIORITY);
        thr4.setPriority(Thread.NORM_PRIORITY);
        thr5.setPriority(Thread.MIN_PRIORITY);
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}
