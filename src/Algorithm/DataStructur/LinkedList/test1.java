package Algorithm.DataStructur.LinkedList;

import org.junit.Test;

public class test1 {
    @Test
    public void test1() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);

        list.addLast(3);

        list.loop2((value) -> System.out.println(value));
    }
}
