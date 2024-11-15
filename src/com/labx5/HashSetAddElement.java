package com.labx5;

import java.util.HashSet;
import java.util.List;

/*
1.Write a Java program to append the specified element to the end of a HashSet.
[Hint:Add elements in the Set using add() method]
 */

public class HashSetAddElement {
    private HashSet<String> stringsHashSet;   //This is the String HashSet;


    public static void main(String[] args) {
        HashSetAddElement hashSetAddElement = new HashSetAddElement();

//        we have to perform operation on it
        hashSetAddElement.stringsHashSet = new HashSet<>();

        hashSetAddElement.stringsHashSet.add("Java");
        hashSetAddElement.stringsHashSet.add("Python");
        hashSetAddElement.stringsHashSet.add("C");
        hashSetAddElement.stringsHashSet.add("Rust");
        hashSetAddElement.stringsHashSet.add("JavaScript");

        //if we wants to print and check this elements in the HashSet then we knows that the elements
        //present in the HashSet are not metaintails the insertion order.

        System.out.println("The elements that are present in the HashSet<String>: "+hashSetAddElement.stringsHashSet);


    }
}
