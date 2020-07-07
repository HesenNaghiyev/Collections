package pp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperation {
    public static void main(String[] args) {
       List<String> list= new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hasan");
        list.add("Subhan");
        list.add("Hello");


//        Object [] array =list.toArray();  to convert arraylist to array
//        String [] array =list.toArray(new String[list.size()]);
        list.remove("Hello");
        list.set(2,"Yes");
        list.remove(1);


        for (int i=0; i<list.size(); i++){
            System.out.println(i+" "+list.get(i));
        }

        for (String i:list) {
            System.out.println(i);
        }

        Iterator<String> it =list.iterator(); //ya iteratora ArrayListin type ni generics kimi demelisen, veya sonra objecti String ve ya lazim olna type cast etmelisen
        while (it.hasNext()){
            String s =(String)it.next();
            System.out.println(s);
        }


     }


}
