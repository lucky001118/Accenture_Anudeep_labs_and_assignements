package com.labx4.question3;

import java.util.ArrayList;
import java.util.Random;

public class EvenNumberSumInArrayList {
    public static void main(String[] args) {

//        import random class for genrating random numbers
        Random random = new Random();
        int randomNumber;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        //adding 100 integers througth loop
        for (int i=1;i<=100;i++){
            //generating random number from 100 to 200
            randomNumber = random.nextInt(101) + 100;
            //adding those random numbers into the ArrayList
            numbers.add(i,randomNumber);
        }
        //All the random numbers integer arrayList
        System.out.println(numbers);

        int sum=0;
        for (int number:numbers){
            //adding  all even numbers present in an ArrayList of integers.
            if (number%2==0){
              sum+= number;
            }
        }

        System.out.println("The sum of all the even numbers that are present in the numbers ArrayList is: "+sum);

    }
}
