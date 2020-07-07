package main;
import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> treeMap =new TreeMap<>();
        treeMap.put(1,"Salam");
        treeMap.put(43,"Salam");
        treeMap.put(5,"Salam");
        System.out.println(treeMap.keySet());
    }

    public static void loginWithHashMap(){
        Map<String,String> students = new HashMap<>();
        students.put("Hasan","hesen123");
        String value =students.get("Hasan");
        System.out.println(value);
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter The User Name");
        String username =sc.nextLine();



        sc=new Scanner(System.in);
        System.out.println("Enter The Password");
        String password =sc.nextLine();


        if (username.equalsIgnoreCase("Hasan") && password.equalsIgnoreCase(value)){
            System.out.println("Welcome To the System");
        }
    }

    public static void hashMap(){
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"hesen123");
        students.put(2,"Subhan");

        String value = students.get(1);

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> key =students.keySet();


        for ( Integer k : key ) {
            if (k.equals(n))
                System.out.println(true);

        }
    }
}
