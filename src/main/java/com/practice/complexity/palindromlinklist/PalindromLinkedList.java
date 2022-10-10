package com.practice.complexity.palindromlinklist;

import javax.swing.plaf.ColorUIResource;

public class PalindromLinkedList {
    public static void main(String[] args) {
       int[] arr = {4,8,3,7,7,3,8,4};     
       Node head  = Node.createLinkedList(arr);
       head.print();
       method1(head);
       method2(head);
    }

    private static void method1(Node head ){
        int n = 0;
        Node temp = head;
        while (temp != null){
            n++;
            temp = temp.getNext();
        }
        Node right = head;
        for(int i=0; i<n/2; i++){
            Node left = head;    
            for(int j=0; j<n-i-1; j++){
                left = left.getNext();
            }
            if(right.getValue() != left.getValue()){
                System.out.println(false);
                return;
            }
            right = right.getNext();
        }
        System.out.println(true);
    }

    private static Node reverse(Node head){
        Node current = head;
        Node previous = null;
         while(current != null){
            Node temp = current.getNext();
            current.setNext(previous);;
            previous = current;
            current=temp;
         }
         return previous; 
    }

    private static void method2(Node head ){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        slow = reverse(slow);
        Node left = head;
        Node right = slow;
        while (right != null){
            if(right.getValue() != left.getValue()){
                System.out.println(false);
                return;
            }
            left = left.getNext();
            right = right.getNext();
        }
        System.out.println(true);
    }
}
