package com.HelloJava;
import java.util.*;
import java.util.Collection;

public class Main {



    public void Age(){

        //static int age=10;
    }

    public static void main(String[] args) {


//        String  name="Narendra";
//        System.out.println("Name : "+ name + " Age : " + age);
//        Scanner sc = new Scanner(System.in);
//        name=sc.nextLine();
//        age=sc.nextInt();
//
//        System.out.println("Name : " + name+ " Age : "+ age);
//


        List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");

        System.out.println(animals);

        System.out.println("Element 0: "+animals.get(0));
        System.out.println("Element 1: "+animals.get(1));
        System.out.println("Element 2: "+animals.get(2));


	// write your code here
    }
}
