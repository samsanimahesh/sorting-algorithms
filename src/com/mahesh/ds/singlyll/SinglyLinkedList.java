package com.mahesh.ds.singlyll;

public class SinglyLinkedList {

    Node head = null;
    Node tail = null;

    public void addFirst(int i) {
        Node node = new Node(i);
        if( head == null ){
            head = node;

        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int i) {
        Node node = new Node(i);
        if(tail == null) {
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void add(int i) {
        Node node = new Node(i);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addAfter(int i, int x) {
        Node node = new Node(x);
        Node temp = head;

        while(temp.getI() != i) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void print() {
        Node temp = head;
        while(temp.next != null) {
            System.out.println(temp.getI() +"");
            temp = temp.next;
        }

    }
}
