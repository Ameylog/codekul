package com.company.collection.list.linkedlist;

/**
 * Reverse Linked list :- by iterative and by recursive
 * No extra memory
 * space complexity O(1)
 * Time complexity  O(n)
 * <p>
 * *
 */
public class ReverseLinkedList {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    // remove element
    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    // remove lats elemrnt
    public void removeLast() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //print
    public void printElement() {
        Node newNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // reverse iteravtive method
//    public void reverseIterate() {
//        if (head == null || head.next == null) {
//            return;
//        }
//        Node preNode=head;
//        Node currNode=head.next;
//        while(currNode!=null){
//            Node nextNode=currNode.next;
//            currNode.next=preNode;
//
//            // update
//            preNode=currNode;
//            currNode=nextNode;
//        }
//        head.next=null;
//        head=preNode;
//
//    }
    public Node reverseRecurssion(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHode= reverseRecurssion(head.next);
        head.next.next=head;
        head.next=null;

        return newHode;
    }


    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.addLast("last");
//
//        list.removeFirst();
//        list.removeLast();

        list.printElement();
//        list.reverseIterate();
        list.head=list.reverseRecurssion(list.head);
        list.printElement();
    }

}
