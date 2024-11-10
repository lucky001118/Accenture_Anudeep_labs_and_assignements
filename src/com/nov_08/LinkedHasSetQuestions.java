package com.nov_08;

import java.util.LinkedHashSet;

public class LinkedHasSetQuestions {
    /*
    LinkedHashSet Questions
Remove Duplicates: Write a program that:
Takes an array of numbers with duplicates (e.g., [1, 2, 3, 2, 1]).
Adds each number to a LinkedHashSet to remove duplicates while preserving order.
Prints the unique numbers in the order they were added.

Adding and Removing Elements: Write a program that:
Creates a LinkedHashSet of strings.
Adds three colors to the set (e.g., "Red", "Green", "Blue").
Removes one color from the set.
Prints the remaining elements.

Iterate Through LinkedHashSet: Write a program that:
Creates a LinkedHashSet of your favorite fruits.
Adds at least four different fruits to the set.
Uses a for-each loop to print each fruit.
HashSet Questions
     */
    private LinkedHashSet<Integer> linkedHashSet;
    private  LinkedHashSet<String> linkedHashSet2;
private void removeDuplicates(){
    System.out.println("__________________________________");
//    HashSet, LinkedHashSet and TreeSet are the implementations of Set interface which does not allow duplicate elements.
    linkedHashSet=new LinkedHashSet<>();
//    Takes an array of numbers with duplicates (e.g., [1, 2, 3, 2, 1]).
    int []numbers =  {1,2,3,2,1};
//    Adds each number to a LinkedHashSet to remove duplicates while preserving order.
    for (int i=0;i<numbers.length;i++){
        linkedHashSet.add(numbers[i]);
    }
//    Prints the unique numbers in the order they were added.
    System.out.println(linkedHashSet);

}

    private void addingAndRemovingElements(){
        System.out.println("__________________________________");
//        Creates a LinkedHashSet of strings.
        linkedHashSet2 = new LinkedHashSet<>();
//        Adds three colors to the set (e.g., "Red", "Green", "Blue").
        linkedHashSet2.add("Red");
        linkedHashSet2.add("Green");
        linkedHashSet2.add("Blue");

//        Removes one color from the set.
          String color ="Blue";
          for (int i=0;i<linkedHashSet.size();i++){
              if (linkedHashSet2.toArray()[i]==color){
                  linkedHashSet2.remove(color);
              }else {
                  //        Prints the remaining elements.
                  System.out.println(linkedHashSet2.toArray()[i]);
              }
          }
    }

    private void iterateThroughLinkedHashSet(){
        System.out.println("__________________________________");
//        Creates a LinkedHashSet of your favorite fruits.
        linkedHashSet2= new LinkedHashSet<>();
        linkedHashSet2.clear();
//        Adds at least four different fruits to the set.
        linkedHashSet2.add("Banana");
        linkedHashSet2.add("Mango");
        linkedHashSet2.add("Orange");
        linkedHashSet2.add("Coconut");
        linkedHashSet2.add("Papaya");
        linkedHashSet2.add("Kivi");
        linkedHashSet2.add("Grapes");
//        Uses a for-each loop to print each fruit.
        for (String str: linkedHashSet2){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
    LinkedHasSetQuestions lhsq=new LinkedHasSetQuestions();
    lhsq.removeDuplicates();
    lhsq.addingAndRemovingElements();
    lhsq.iterateThroughLinkedHashSet();
    }
}
