package org.example.Collections;// framework

import java.util.*;

public class  Collect {
//    public void collection1() {
//        Collection<String> collection = new ArrayList<>();// Collection is root interface and ArrayList is Class comes under List Interfece That comes under Collection Interface.
//collection.add("i am mandip");// first time .add method enter the value .
//        System.out.println(collection);
//collection.add("johal");// second time this add the value at the add of first string
//        System.out.println(collection);
//
//
//    }
//
//    public  void ListArrayList() {
//           List<String> list = new ArrayList<>();//List is a Interface that comes under Collection Interface that is root interface in Collections Framework and ArrayList is a class comes under List interface.//
//      list.add("1 :hello i am mandip");
//        System.out.println(list);
//
//        System.out.println("       ");
//        System.out.println("       ");
//     list.get(0);
//        System.out.println("2. element on 1 index" + list);
//        System.out.println("       ");
//        System.out.println("       ");
//        System.out.println(" 3. set"+list.set(0, "hello i am jaskirat"));
//        System.out.println(list);
//        System.out.println("       ");
//        System.out.println("       ");
//        System.out.println("4"+list.remove("hello"));
//
//        System.out.println( list);
//        System.out.println("       ");
//        System.out.println("       ");
//        System.out.println("5: contains :"+list.contains("hello"));
//
//        System.out.println("       ");
//        System.out.println("       ");
//        System.out.println("6: size "+list.size());
//
//        System.out.println("7 :is empty"+list.isEmpty());
//
//        System.out.println("       ");
//        System.out.println("       ");
//        list.clear();
//        System.out.println("8 :list is clear" + list);
//
//    }


       public  void ListLinkedList() {
           List<Integer> list1 = new LinkedList<>();// List is a Interface that comes under Collection inteface that is a root interface of collections Framework and LinkedList is a class that comes under List interface.
      list1.add(10);
      list1.add(50);
           System.out.println(list1);
      list1.add(1,45);
           System.out.println(list1);
           list1.set(2,55);
           System.out.println(list1);
       }





    public static void main(String[] args)
    {
 Collect collect=new Collect();
////colllect.collection1();
//        System.out.println("ListArrayList");
//collect.ListArrayList();
        collect.ListLinkedList();
    }
}
