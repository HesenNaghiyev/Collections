package pp2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation {
    public static void main(String[] args) {

        Map<Integer,String> map =new HashMap<Integer, String>();
        map.put(1,"Hasan");
        map.put(2,"Subhan");
        map.put(3,"Camal");
        map.put(4,"Xanlar");

        System.out.println(map);
        Set keys =map.keySet();
        Iterator<Integer> it = keys.iterator();

        while (it.hasNext()){
            Integer  key =it.next();
            String value =map.get(key);
            System.out.println("Key: " + key + " Value: "+value);
        }

    }
}
