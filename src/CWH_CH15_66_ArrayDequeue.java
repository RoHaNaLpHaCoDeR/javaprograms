import java.util.ArrayDeque;

public class CWH_CH15_66_ArrayDequeue {
    public static void main(String[] args) {
        /*
        ArrayDeque in Java

        1. ArrayDeque = Resizable array + Deque interface.
        2. ArrayDeque implements the Queue & Deque interface.
        3. There are no capacity restrictions for ArrayDeque, and it provides us the
           facility to add or remove any element from both sides of the queue.
        4. Also known as Array Double Ended Queue.
        5. It is faster than Linked list and stack.

        Constructors of ArrayDeque class :

        1. ArrayDeque(): Used to create an empty array deque that has the capacity to
           hold 16 elements.
        2. ArrayDeque(int numElements): Used to create an empty array deque that has
           the capacity to hold the specified number of elements.
        3. ArrayDeque(Collection<? extends E> c): Used to create an array deque containing
           all the elements of the specified collections.
         */

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());

        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());


        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56

        System.out.println(ad1);
    }
}
