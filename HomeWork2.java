package CollectionFrameWork;
import java.util.LinkedList;

 class HomeWork2 {
     private int size;
     HomeWork2(){
         this.size= 0;
     }
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next= null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head== null){
            head= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }
    public void addLast(String data) {
        Node newNode= new Node(data);
        if(head== null){
            head= newNode;
            return;
        }
        Node headNode= head;
        while(headNode.next !=null){
            headNode= headNode.next;
        }
        headNode.next= newNode;
    }
    public void list(){
        if(head== null){
            System.out.println("List is empty");
        }
        Node headNode= head;
        while(headNode!= null){
            System.out.print(headNode.data+ "->");
            headNode= headNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head== null){
            System.out.println("The list is empty");
            return;
        }
        Node headNode= head;
        head= headNode.next;
        size--;
    }
    public void deleteLast(){
        Node headNode= head.next;
        Node headNextNode= head;
        if(head== null){
            System.out.println("Empty List");
            return;
        }
        while(headNode.next != null){
            headNode= headNode.next;
            headNextNode= headNextNode.next;
        }
        size--;
        if(head.next==null){
            head= null;
            return;
        }

        headNextNode.next= null;
    }
    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        HomeWork2 hw= new HomeWork2();
        hw.addFirst("name");
        hw.addFirst("My");
        hw.addLast("is");
        hw.addLast("Miskat");
        hw.list();
        hw.deleteFirst();
        hw.list();
        hw.deleteLast();
        hw.list();
        System.out.println(hw.getSize());
    }

}
