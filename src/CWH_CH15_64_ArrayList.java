import java.util.*;

public class CWH_CH15_64_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(1);
        l1.add(0,7);
        l1.add(1,2);
        l1.addAll(6,l2);
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(14));
        System.out.println(l1.lastIndexOf(14));
        l1.set(5,100);
        System.out.println(l1.isEmpty());
        System.out.println(l1.equals(l2));
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(", ");
        }
    }
}
