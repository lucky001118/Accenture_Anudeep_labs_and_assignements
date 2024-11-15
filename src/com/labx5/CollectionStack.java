package com.labx5;

import java.util.Random;
import java.util.Stack;

/*
2.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
stack and display it.
 */

public class CollectionStack {
    private Stack<Integer> integersStack;

    public static void main(String[] args) {
        CollectionStack collectionStack = new CollectionStack();

        collectionStack.integersStack = new Stack<>();

//        random class for generating random numbers
        Random random = new Random();
        int randomNumber;

//        adding the 10 elements into the stack
//        The push() method in the stack adds the element in the top of stack: where the topOfStack pointer points
        for (int i=0;i<10;i++){

//            generating the random numbers between 100 to 200
            randomNumber = random.nextInt(101) + 100;
            collectionStack.integersStack.add(randomNumber);
        }

        //Checking the added elements in the stack
        System.out.println("Before removing the elements in the stack: "+collectionStack.integersStack);

        int [] storePopElements = new int[4];
        //Removing 4 elements from the stack
        //Pop method in the stack removes the top element in the stack: which TopOfStack pointer points
        for (int i=0;i<4;i++ ){
            storePopElements[i] = collectionStack.integersStack.pop();
        }

//        after removing 4 elements from the stack display the stack
        System.out.println("The stack after removing 4 elements: "+collectionStack.integersStack);

//        Elements that are removed from the stack
        System.out.print("The elements that are removed from the stack are: ");
        for(int ele: storePopElements){
            System.out.print(ele+", ");
        }

    }
}
