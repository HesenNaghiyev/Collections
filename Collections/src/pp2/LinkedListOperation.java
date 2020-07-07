package pp2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.addFirst("Salam");
        list.addLast("Sagol");
//        list.clear(); // remove all elements

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}
