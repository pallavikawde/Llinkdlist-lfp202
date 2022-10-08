package com.bridgelabz.linkedlist;

public class LinkedList {

    private INode head;
    private INode tail;

    public LinkedList() {

        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode temporarayNode = this.head;
            this.head = newNode;
            this.head.setNext(temporarayNode);

        }

    }

    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }

}
