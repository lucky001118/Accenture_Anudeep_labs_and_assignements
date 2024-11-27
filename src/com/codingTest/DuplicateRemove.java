package com.codingTest;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateRemove {
    /*
    Problem---> Remove Duplicates from an Array: Write a program to remove duplicate elements from an integer array.

     */

    /*
    my task is to remove the duplicate element in the
    ----> the LinkedHashSet is responsible has property that to don't contain the duplicate
     */
    public void revomeDuplicate(){
        Integer [] array = {4,5,7,8,5,4,7,8};

        //making variable as LinkedHashSet for removel duplicate values and maintains order
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));

        //saving the result after remove the duplicate number
        Integer [] resultArray = linkedHashSet.toArray(new Integer[0]);

        System.out.println("Arrays with not duplicate "+Arrays.toString(resultArray));
    }

    public static void main(String[] args) {
        DuplicateRemove test = new DuplicateRemove();
        test.revomeDuplicate();
    }
}
