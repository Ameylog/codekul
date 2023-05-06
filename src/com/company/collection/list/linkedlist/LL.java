package com.company.collection.list.linkedlist;

public class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

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
    public void removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }
   public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
   }
    public void display() {
        if (head == null) {
            System.out.println("Limked List Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println("NULl");
    }
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=preNode;

            // update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
    }


    public static void main(String[] args) {
        LL obj = new LL();
        obj.addFirst("Hello");
        obj.addFirst("World");
        obj.addLast("My");
        obj.display();


//        obj.removeFirst();
//        obj.display();
//        obj.removeLast();
//        obj.display();
        obj.reverseList();
        obj.display();

    }
}
