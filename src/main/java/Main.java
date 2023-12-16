import fundamentals.MyLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("First");
        myLinkedList.addLast("Last");
        myLinkedList.addFirst("New First");
        System.out.println("LinkedList: " + Arrays.toString(myLinkedList.toArray()));
        myLinkedList.remove("First");
        System.out.println("LinkedList after removed: " + Arrays.toString(myLinkedList.toArray()));
        System.out.println("Next element after 'New First: " + myLinkedList.next("New First"));
        System.out.println("Previous element before 'Last': " + myLinkedList.previous("Last"));
    }
}
