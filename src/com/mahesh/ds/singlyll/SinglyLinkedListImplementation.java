package com.mahesh.ds.singlyll;

public class SinglyLinkedListImplementation {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addFirst(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addAfter(3, 6);
        linkedList.print();

    }
}
