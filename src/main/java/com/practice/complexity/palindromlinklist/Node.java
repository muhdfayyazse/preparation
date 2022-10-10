package com.practice.complexity.palindromlinklist;

import java.util.Objects;

public class Node {
    private int value;
    private Node next;

    public Node(int val){
        this.value = val;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    public static Node createLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i< arr.length; i++){
            temp.setNext(new Node(arr[i]));
            temp = temp.getNext();
        }


        return head;
    }

    public void print(){
        Node temp = this;
        while(Objects.nonNull(temp)){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }


    
}
