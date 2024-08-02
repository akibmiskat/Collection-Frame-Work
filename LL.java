package CollectionFrameWork;

import java.util.*;

public class LL {
    private int size;              //variable for show size of lists, under to getSize function
    LL(){
        size= 0;                          //initial size
    }

    Node head;                            //define node
    class Node{
        String data;
        Node next;
        Node(String data){                //constructor
            this.data =data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){                           //corner case
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head == null){                           //corner case
            head = newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next != null){
            currNode= currNode.next;
        }
        currNode.next= newNode;
    }
    public void display(){
        if(head == null){                          //corner case
            System.out.println("List is empty");
            return;
        }
        Node currNode= head;                                //define head node
        while(currNode !=null){                             //Traverse
            System.out.print(currNode.data +" -> ");
            currNode= currNode.next;
        }
        System.out.println("Null");
    }
    public void deleteFirst(){                              //delete
        if(head == null){
            System.out.print("This is empty list");
            return;
        }
        size --;
        head= head.next;

    }
    public void deleteLast(){                       //  delete last node
        if( head == null){
            System.out.println("The Linked list is empty");
            return;
        }
        Node secondLastNode= head;
        Node lastNode= head.next;
        while(lastNode.next != null){
            lastNode= lastNode.next;
            secondLastNode= secondLastNode.next;
        }
        size --;                        //when delete my node at this time size also decrease in memory
        if(head.next == null){
            head= null;
            return;
        }
        secondLastNode.next= null;
    }

    public int getsize(){
        return size;
    }


    public static void main(String[] args) {                //The Main Function
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.display();
        list.addFirst("This");
        list.display();
        list.addLast("Linked");
        list.display();
        list.addLast("List");
        list.display();


//      if you want to delete from firs or last node from linked list
//      list.deleteFirst();
//      list.display();
//      list.deleteLast();
//       list.display();
        System.out.println(list.getsize());


    }

}
