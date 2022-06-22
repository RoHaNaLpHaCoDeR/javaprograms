import java.util.ArrayList;
import java.util.Scanner;

public class CWH_CH16_79_GenericsJava {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
        //////////////
        arrayList.add(new Scanner(System.in));
        int a = (int) arrayList.get(2);
    }
}
