package com.mahesh.ds.newds;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        Node node = new Node(1);
        SinglyLinkedList list = new SinglyLinkedList();

        list.addNode(node);
        list.addNode(new Node(2));
        list.addNode(new Node(3));
        list.addNode(new Node(4));

        list.listAll();
    }

}


