class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}

class SmartPhone extends Phone{
    public void Swagat(){
        System.out.println("Aapka Swagat hain");
    }
    @Override
    public void name(){
        System.out.println("My name is Java in class Two");
    }
}


public class CWH_CH10_36_DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone(); // Allowed
//        obj.name();
        Phone obj = new SmartPhone(); // Allowed
        // Jiska Object Ka reference hain usi ke methods run honge hamesha
        // Learn it as Super Sub
//        SmartPhone obj2 = new Phone(); // Not Allowed
        obj.greet();
        obj.name();
//        obj.Swagat(); // Not Allowed
    }
}
