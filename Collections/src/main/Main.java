package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

  linkedList();

    }

    public static void ArrayList(){
        ArrayList<String> list =new ArrayList<>();
        list.add("Salam");
        list.add("Hesen");
        list.add("Necesen");
        list.add("Yaxwisanmi");
        list.add("Yaxwi");
        list.add("Ol");

        String result="";
        for (int i=0; i<list.size(); i++){
            result+= "\n"+list.get(i);
        }
        System.out.println(result);
    }



    public static void linkedList(){
        LinkedList<String> list =new LinkedList<>();
        list.add("Hi");
        list.add("Subhan");
        list.add("How");
        list.add("Are");
        list.add("You");

           Iterator<String> it =list.iterator();
           while (it.hasNext()){
            String s =it.next();
            System.out.println(s);
        }

//
//        for (String  s:list) {
//            System.out.println(s);
//        }
//        String result="";
//        for (int i=0; i<list.size(); i++){
//            result+= "\n"+list.get(i);
//        }
//        System.out.println(result);
//


    }
    }



