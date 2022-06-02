interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber );
    }
    void pickCall(){
        System.out.println("Connecting..... ");
    }

}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
}

public class CWH_CH11_39_InterfaceExamples {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        // ms.greet();// simply throws an error
        String[] ar = ms.getNetworks();
        for( String e : ar){
            System.out.println(e);
        }
    }
}
