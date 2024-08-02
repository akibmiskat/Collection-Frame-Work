package CollectionFrameWork;
import java.util.LinkedList;
import java.util.*;

public class LinkedListWithFrameWrok {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
//their are various popular types of function to manage Linked List->
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("Linked");
        System.out.println(list);
        list.addLast("List");
        System.out.println(list);
        System.out.println(list.size());
        for(int i= 0; i<list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
//to use this types of function in that time vanish the comment tag and use functionality ->
//        list.removeFirst();
//        list.removeLast();
//        list.remove(1);                    //can delete with index number
//        System.out.println(list);
    }



}
