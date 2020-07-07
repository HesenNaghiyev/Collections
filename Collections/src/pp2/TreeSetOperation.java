package pp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetOperation {
    public static void main(String[] args) {
        TreeSet list= new TreeSet();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(12);
        list.add(14);
        list.add(19);

     for (Object i: list){
         System.out.println(i);
     }
        System.out.println("List :"+list);
        System.out.println("First :"+list.first());
        System.out.println("Last :"+list.last());
        System.out.println("Subset :"+list.subSet(3,4)); //3 inclusive 4 exclusive
        System.out.println("TailSet :"+list.tailSet(3));//3 inclusive and higher than 3
        System.out.println("Ceiling :"+list.ceiling(6));//6 inclusively and greater that 6
        System.out.println("Flooring :"+list.floor(6)); // 6 inclusively and less than 6
        System.out.println("Higher :"+list.higher(5)); //5 exclusively and higher than 5
        System.out.println("Ceiling :"+list.ceiling(5));


        TreeSet<String> list1= new TreeSet();

        list1.add("Hasan");
        list1.add("Subhan");
        list1.add("Camal");
        list1.add("Mustafa");
        list1.add("Xanlar");
        for (Object i: list1){
            System.out.println(i);
        }


        System.out.println("List :"+list1);
        System.out.println("First :"+list1.first());
        System.out.println("Last :"+list1.last());
        System.out.println("Subset :"+list1.subSet("H","X"));
        System.out.println("TailSet :"+list1.tailSet("H"));

        // Navigable Set
        System.out.println("Ceiling :"+list1.ceiling("C"));
        System.out.println("Flooring :"+list1.floor("H"));
        System.out.println("Higher :"+list1.higher("C"));




    }
}
