package com.Test;

public class Sorting {

//    function for print the sorted array
    public void printSortedArray(int [] sortedArr){
        for (int i=0;i<sortedArr.length;i++){
            System.out.print(sortedArr[i]+",");
        }
    }
//    Implementation logic of Bubble sort
    public void bubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //after the sorting lets print the array
        printSortedArray(arr);
    }

//    Implementation logic of the Selection sort
    public void selectionSort(int [] arr){
        int smallestNum=0;
        int tem;
        for (int i=0;i<arr.length-1;i++){
            smallestNum = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[smallestNum]>arr[j]){
                    smallestNum=j;
                }
            }
            tem = arr[smallestNum];
            arr[smallestNum] = arr[i];
            arr[i] = tem;
        }
        printSortedArray(arr);
    }

    public static void main(String[] args) {
        Sorting sort = new Sorting();
        int [] arr = {4,8,2,45,5,41,74,12,9,1};
//        calling the Bubble sort
        System.out.println("Bubble Sort....");
        sort.bubbleSort(arr);

        System.out.println();
        System.out.println("Selection Sort....");
        sort.selectionSort(arr);

    }
}
