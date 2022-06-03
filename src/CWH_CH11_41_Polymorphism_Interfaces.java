interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void hello(){
        System.out.println("hello how are you ?");
    }
    default void record4kVideo(){
        hello();
        System.out.println("Recording in 4k Video...");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber );
    }
    void pickCall(){
        System.out.println("Connecting..... ");
    }

}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap..");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry", "Rohan", "Aman"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
//    public void record4kVideo(){
//        System.out.println("Reconnecting in 4k videooooooo....");
//    }
    public void samplemeth(){
        System.out.println("meth");
    }
}

public class CWH_CH11_41_Polymorphism_Interfaces {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone use it as a camera.
        // cam1.getNetworks(); --> Not allowed
        cam1.record4kVideo();
//        cam1.samplemeth(); --> not allowed

        MySmartPhone2 ms = new MySmartPhone2();
        ms.getNetworks();
        ms.record4kVideo();
        ms.recordVideo();
        ms.samplemeth();
        ms.connectToNetwork("dvsv");
        ms.callNumber(232424242);
        ms.pickCall();
        ms.takeSnap();
    }
}
