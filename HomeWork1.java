package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(7);
        list.add(9);
        list.add(8);
        System.out.println(list);
        for( int index=0; index<list.size(); index++){
            if(list.get(index)==7){
                System.out.println(index);
            }
        }

    }
}
