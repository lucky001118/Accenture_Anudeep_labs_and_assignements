package com.labx2;

import java.util.Arrays;
import java.util.Collections;
public class FindSecondHighestInSubArray {
    public int[] sortArray(int[] subArrayArg){
        //using the selection sort
        for (int i = 0;i<subArrayArg.length;i++){
            int index=i;
            for (int j=i+1;j<subArrayArg.length;j++){

                if (subArrayArg[j]<subArrayArg[index]){
                    index = j;
                }
            }
            int smallerNumber = subArrayArg[index];
            subArrayArg[index] = subArrayArg[i];
            subArrayArg[i] = smallerNumber;

        }
        return subArrayArg;
    }

    public static void main(String[] args) {

        FindSecondHighestInSubArray f = new FindSecondHighestInSubArray();
        // Declare an array with 10 elements
        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        // Extract the subarray from index 2 to 6
       // int[] subArray = Arrays.copyOfRange(arr, 2, 7);

        int[] subArray = new int[5];
        int k =0;
        for (int i=2;i<7;i++){
            subArray[k] = arr[i];
            k++;
        }

        // Print the subarray
        System.out.println("Sub array: " + Arrays.toString(subArray));

        //after the sorting
        int [] sortedSubArray = f.sortArray(subArray);
        System.out.println("Sub-Array after the sorting: "+Arrays.toString(sortedSubArray));

        // Find the second highest number matlab subarray2.length-2
        //because last element is subarray2.length-1
        int secondHighest = sortedSubArray[sortedSubArray.length-2];
        System.out.println("2nd Highest element: " + secondHighest);
    }
}
