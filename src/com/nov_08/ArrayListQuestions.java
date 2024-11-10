package com.nov_08;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListQuestions {
    /*
    ArrayList Questions
Basic List Operations: Write a program that:

Creates an ArrayList of integers.
Adds the numbers 1 to 5 to the list.
Removes the number 3 from the list.
Prints the elements in the list.

List Size and Element Access: Write a program that:
Adds five names to an ArrayList.
Prints the total number of names in the list.
Displays the name at the second position.

Iterate and Sum: Write a program that:
Creates an ArrayList of integers.
Adds the numbers 10, 20, 30, 40, and 50 to the list.
Iterates over the list and calculates the sum of all numbers.
Prints the sum.
     */
private ArrayList<Integer> arrayList;
private ArrayList<String> arrayList2;
private ArrayList<Integer> arrayList3;
    private void BasicListOpearations(){
        arrayList =  new ArrayList<>();
//        Adds the numbers 1 to 5 to the list.
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
//         Removes the number 3 from the list.
        arrayList.remove(2);
//         Prints the elements in the list.
        System.out.println("remaining elements in the arrayList: "+arrayList);
    }

    private void sizeAndElement(){
        arrayList2= new ArrayList<>();
//        Adds five names to an ArrayList.
        arrayList2.add("Lucky Manikpuri");
        arrayList2.add("Gopal Nayak");
        arrayList2.add("Saurabh Dewangan");
        arrayList2.add("Sachin parmar");
        arrayList2.add("Rahul Dravid");
//        Prints the total number of names in the list.
        System.out.println("Total number in the arrayList: "+arrayList.size());
//        Displays the name at the second position.
        System.out.println("Name at second position: "+arrayList2.get(1));
    }

    private void iterateAndSum(){
//        Creates an ArrayList of integers. --- Done
        arrayList3 = new ArrayList<>();
//        Adds the numbers 10, 20, 30, 40, and 50 to the list.
        arrayList3.add(10);
        arrayList3.add(20);
        arrayList3.add(30);
        arrayList3.add(40);
        arrayList3.add(50);
//        Iterates over the list and calculates the sum of all numbers.
        int sum=0;
        for (int i=0;i<arrayList3.size();i++){
            sum=sum+arrayList3.get(i);
        }
//        Prints the sum.
        System.out.println("The sum of hole arrayList is: "+sum);

    }
    public static void main(String[] args) {

        ArrayListQuestions alq= new ArrayListQuestions();
        alq.BasicListOpearations();
        alq.sizeAndElement();
        alq.iterateAndSum();

    }
}
