import java.util.*;

public class CWH_CH15_64_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(1);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
