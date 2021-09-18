package com.mahesh.ds.newds;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {

    private Node head;

    public void addNode(Node node) {
        if(head == null) {
            this.head = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void listAll() {
        Node temp = head;
        Node duplicateHead = head;
        System.out.println("Elements in linked list are ");
        while(temp.next != null) {
            duplicateHead = head;

            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // reversal of singly linked list
    // iterate through both reveresed and created linked list
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


