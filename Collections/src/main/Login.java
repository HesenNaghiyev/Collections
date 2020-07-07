package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Map<String,String> hashmap =new HashMap<>();
        hashmap.put("Hasan","hesen123");
        hashmap.put("Subhan","Subhan123");

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the UserName");
        String username= sc.nextLine();

        sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String password =sc.nextLine();

        boolean exists = hashmap.containsKey(username);  //false

        if (exists) {
            if (password != null && password.equalsIgnoreCase(hashmap.get(username))) {
                System.out.println("Welcome to our System");
            } else {
                System.err.println("Password is not true");
            }

        }
        else {
            System.err.println("UserName  does not exists");
        }
    }
}
