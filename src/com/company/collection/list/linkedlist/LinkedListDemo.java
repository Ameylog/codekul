package com.company.collection.list.linkedlist;


/**
 * Linked List:-
 * non-contiguous store element in heap
 * use case:- insert operation
 * //
 * Inert Time Complexity:- O(1)
 * Search in element  Time complexity :- O(n)
 * //
 * Type OF LinkedList:-
 * 1) Singular LinkedList
 * 2) Double Ended LinkedList
 * 3) Circular LinkedList (not null )
 *
 * add, delete,size,print
 */
public class LinkedListDemo {
    private static int size;
    LinkedListDemo(){
        size=0;
    }
    Node head;
    static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add first
   public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
   }
    // add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // delte First node
    public void delFirst(){
        if(head==null){
            System.out.println("The list id emepty");
            return;
        }
        head=this.head.next;
        size--;


    }

    public void delLast(){
      if(head==null){
          System.out.println("This list ois empty");
      }
      size--;
      if(head.next==null){
          head=null;
      }
      Node secondLast=head;
      Node lastNode=head.next;
      while(lastNode!=null){
          secondLast=secondLast.next;
          lastNode=lastNode.next;
      }
      secondLast.next=null;
    }
// size
    public int getSize(){
        return size;
    }

    // print
    public void printList(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node<Integer> ll = new Node<Integer>(4);



        Node<String> ls = new Node<>("Amey");
        LinkedListDemo list=new LinkedListDemo();
        list.addFirst("a");
        list.addFirst("is");

        list.addLast("list");
        list.delFirst();
        list.delLast();


         list.printList();
        System.out.println(list.getSize());




    }
}