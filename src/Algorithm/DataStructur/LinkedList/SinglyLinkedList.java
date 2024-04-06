package Algorithm.DataStructur.LinkedList;

import java.util.function.Consumer;

//单向链表
public class SinglyLinkedList { //链表类
    private Node head = null; // 头指针
    /*
    节点类
 */
    private static class Node {
        int value; // 值

        Node next; // 下一个节点指针

        //  为了方便为节点更好赋初值
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
//    头部添加
    public void addFirst(int value){
//        链表为空
//        head = new Node(value,null);
//        链表非空
        head = new Node(value,head);
    }
//    尾部添加
    public void addLast(int value) {
        Node last = findLast();
//        如果链表本身为null则调用添加头方法
        if (last == null) {
            addFirst(value);
            return;
        }
        last.next = new Node(value,null);
    }
//    找到最后节点
    private Node findLast() {
        if (head == null) {
            return null;
        }
        Node p;
        for (p = head; p.next != null; p = p.next) {
        }
        return p;
    }
    public void loop(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }
    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

}

