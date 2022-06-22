//@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method1");
//    }
//}
//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//
//    }
//
//    @Override
//    public void meth2() {
//
//    }
//}

public class CWH_CH16_78_AnonymousClasses_LambdaExpressions {

    public static void main(String[] args) {
//        AnonyDemo obj = new AnonyDemo();
//        obj.meth();

          // Anonymous Classes

//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        // Lambda Expressions
//        DemoAno obj = new HarryFunc();
//        obj.meth1();
//        DemoAno obj = ()->{
//            System.out.println("I am method 1 from this lambda");
//        };
        DemoAno obj1 = (a)->{
            System.out.println(a);
        };
//        obj.meth1();
        obj1.meth1(6);
   }
}
