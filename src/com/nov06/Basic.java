package com.nov06;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
        list.add("Python");
        list.add("Kotlin");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Django");
        list2.add("Flask");
        list2.add("Spring");
        list2.add("SpringBoot");
        list2.addAll(list);

        System.out.println(list);
        System.out.println(list2);

        ArrayList list3 = new ArrayList();
//        list3
    }


}
