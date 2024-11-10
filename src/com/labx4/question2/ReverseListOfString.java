package com.labx4.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListOfString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("Springboot with microservices");
        stringList.add("React");

        System.out.println("Original List: " + stringList);

        // Method 1: Using Collections.reverse()
        Collections.reverse(stringList);

        System.out.println("Reversed List (Method 1), reversing stringList: " + stringList);

        // Method 2: Using a loop and swapping
        List<String> stringList2 = new ArrayList<>(stringList);
        int n = stringList2.size();
        for (int i = 0; i < n / 2; i++) {
            String temp = stringList2.get(i);
            stringList2.set(i, stringList2.get(n - i - 1));
            stringList2.set(n - i - 1, temp);
        }

        System.out.println("Reversed List (Method 2), reversing stringList that already reversed (so indirectally getting back it's original form): " + stringList2);
    }
    }

