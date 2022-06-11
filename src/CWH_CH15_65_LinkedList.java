import java.util.LinkedList;

public class CWH_CH15_65_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList in Java: Demo & Methods
        1. The LinkedList class in Java provides us with the doubly linked list data structure.
        2. Each element of the linked list is known as a node.
        3. Each node points to the address of the next node & its previous node.
        4. Linked lists are preferred over the Array list because the insertion & deletion in the
           linked lists can be done in a constant time. But, in arrays, if we want to add or delete
           an element in between then, we need to shift all the other elements.
        5. In a linked list, it is impossible to directly access an element because we need to
           traverse the whole linked list to get the desired element.
         */

        /*
        ArrayList Vs. LinkedList :
        1. Although ArrayList & LinkedList both implement the List interface and have the same methods,
           it is important to understand when to use which one.
        2. The insertion & deletion can be done in constant time in Linked List, so it is best to use
           the linked list when you need to add or remove elements frequently.
        3. Use ArrayList when you want to access the random elements frequently, as it can’t be done
           in a linked list in constant time.
         */
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5,77); // Inserts 77 at index 5
        System.out.println("L1 Linked list : "+ l1);

        l1.remove(2); //removes element present at 2nd index
        System.out.println("L1 Linked list after: "  + l1);

        l1.set(2,10); //changes element present at 2nd index (44 changed to 10)
        System.out.println("L1 Linked list after: "  + l1);

        l1.addLast(100); //Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: "  + l1);

        l1.addFirst(0); //Inserting 0 at the starting of L1
        System.out.println("L1 Linked list after: "  + l1);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
