package com.day3;

public class Calculator {
//    Create a Calculator class with a method calculateSum() that takes different parameters to calculate the sum of different types of data.
//    Calculate the sum of two integers.
//    Calculate the sum of three doubles.
//    Calculate the sum of an array of integers.
//    Expected Output:
//            Calculator.calculateSum(2, 3) should return 5
//            Calculator.calculateSum(1.2, 2.3, 3.4) should return 6.9
//            Calculator.calculateSum(new int[] {1, 2, 3, 4, 5}) should return 15

    public int sum(int a,int b){
        return a+b;
    }

    public double sum(double a, double b, double c){
        return a+b+c;
    }

    public int sum( int [] arr){
        int totale=0;
        for (int i=0;i<arr.length;i++){
            totale =totale+ arr[i];
//            System.out.println(i);
        }
        return totale;
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
       int sum1= cl.sum(2,3);
       double sum2 = cl.sum(1.2,2.3, 3.4);
       int sum3 = cl.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
