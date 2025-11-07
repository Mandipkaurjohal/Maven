package org.example.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("iphone", 2);
        map.put("Samsung", 3);
        map.put("Motorola", 6);
        map.put("Nokia", 1);
        map.put("Samsung", 4);//cannit have duplicate key
        // System.out.println(map);

        Collection<Integer> values = map.values();
        System.out.println(values);//print integer type value

        Set<Map.Entry<String, Integer>> entries = map.entrySet();//to print set of values means all keys and values
        System.out.println(map);
        System.out.println(entries);// can print just value or just key using loop using get.

       // for each loop using map.entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());


            Collection<Integer> values1 = map.values();
            System.out.println(values1);// just to print values not key
            boolean hello = map.containsKey("hello");// to check is this key available in map list or not
            System.out.println(hello);

            boolean b = map.containsValue(10);//to check is this value available in map list or not
            System.out.println(b);

            Set<String> set = map.keySet();// just to print only list of key not value
            System.out.println(set);
            Integer orDefault = map.getOrDefault(10,0);// this is to check if value list contain this value like 10 if not then return another value like second valu 0
            System.out.println(orDefault);

        }
    }}
