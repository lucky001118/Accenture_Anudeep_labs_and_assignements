package com.nov_08;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetQuestions {
    /*
    HashSet Questions
Adding Unique Elements: Write a program that:
Creates a HashSet of integers.
Adds numbers 10, 20, 20, 30 to the set.
Prints the elements in the set to confirm only unique values are stored.

Check Element Existence: Write a program that:
Creates a HashSet of strings and adds five random words to it.
Checks if a specific word (e.g., "Java") exists in the set and prints the result.

Iterate Through HashSet: Write a program that:
Adds three country names to a HashSet.
Uses a for-each loop to print each country in the set.
     */
    private HashSet<Integer> hashSet;
    private HashSet<String> hashSet2;
    private void addingUniqueElements(){
//        Creates a HashSet of integers.
        hashSet = new HashSet<>();

        //Adds numbers 10, 20, 20, 30 to the set.
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

//        Prints the elements in the set to confirm only unique values are stored.
        System.out.println(hashSet);
    }

    private void checkElementExistence(){
//        Creates a HashSet of strings and adds five random words to it.
        hashSet2= new HashSet<>();
        System.out.println("_______________________________________");
        hashSet2.add("Java");
        hashSet2.add("Python");
        hashSet2.add("C++");
        hashSet2.add("C");
        hashSet2.add("JavaScript");

        String [] hasSetArr =  hashSet2.toArray(new String[hashSet.size()]);

//        Checks if a specific word (e.g., "Java") exists in the set and prints the result.
        for (int i=0;i<hashSet2.size();i++){
            if (hasSetArr[i]=="Java"){
                System.out.println("The word Java exist in the hasSet");
                System.out.println(hashSet2);
            }else {
                System.out.println("The word Java not exist in the hasSet");
            }
        }
    }

    private void iterateThroughHashSet(){
//        Adds three country names to a HashSet.
        hashSet=new HashSet<>();
        hashSet2.clear();
        System.out.println("________________________________");
        hashSet2.add("India");
        hashSet2.add("Pakistan");
        hashSet2.add("NewZeeland");
//        Uses a for-each loop to print each country in the set.
        for (String str:hashSet2){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSetQuestions hsq = new HashSetQuestions();
        hsq.addingUniqueElements();
        hsq.checkElementExistence();
        hsq.iterateThroughHashSet();
    }
}
