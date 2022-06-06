class MyRunnableInterface implements Runnable{

    public MyRunnableInterface(){
        System.out.println("I am the constructor ");
    }
    @Override
    public void run() {
        System.out.println("I am a new thread");
    }
}

public class CWH_CH13_52_ThreadRunnableConstructor {
    public static void main(String[] args) {
        MyRunnableInterface mri1 = new MyRunnableInterface();
        MyRunnableInterface mri2 = new MyRunnableInterface();
//        Thread t = new Thread(mri , "Rohan");
//        t.start();
//        System.out.println("The id of the thread is " + t.getId());
//        System.out.println("The name of the thread is "+ t.getName());

        Thread t1 = new Thread(mri1 , "Rohan");
        Thread t2 = new Thread(mri2 , "Arora");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is " + t1.getId());
        System.out.println("The id of the thread is " + t2.getId());
        System.out.println("The name of the thread is "+ t1.getName());
        System.out.println("The name of the thread is "+ t2.getName());
    }
}
