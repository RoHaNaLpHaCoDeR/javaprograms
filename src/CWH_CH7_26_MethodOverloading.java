public class CWH_CH7_26_MethodOverloading {

    static void foo(){
        System.out.println("gOOD mORNIGN BRO!");
    }
    static void foo(int a){
        System.out.println("Good nigth " + a + " bro");
    }

    static void foo(int a ,int b){
        System.out.println("Good morning "+ a + b + " bro ");
    }


    static void change(int z){
        z=97;
    }
    static void change2(int [] arr){
        arr[0] = 96;
    }
    static void tellJoke(){
        System.out.println("I invented a new word Plagiarism");
    }
    public static void main(String[] args) {
//        tellJoke();
//        // Case 1 Changing the integer
//        int x=45;
//        change(45);
//        System.out.println(x);
//        // Case 2 Changing the Array
//        int [] marks = {23,45,67,65,4,3};
//        change2(marks);
//        System.out.println(marks[0]);


        // Method Overloading
        foo();
        foo(343);
        foo(300,4000);
    }
}
