package com.assinments.assinment2;

import com.oct17.First;

public class ZigZagQues {
    public void zigZagTraversalLtoR(int [][] arr) {
        int sizeOfRow = arr.length;
        int sizeOfCol = arr[0].length;
        int colPointer = 0;

        while (colPointer!=sizeOfCol-1){
            if (colPointer<=sizeOfCol-1){
                for (int i = 0; i < sizeOfRow; i++) {
                    System.out.print(arr[colPointer][i] + " ");
                }
                colPointer=colPointer+1;
                for (int i = sizeOfCol - 1; i >= 0; i--) {
                    System.out.print(arr[colPointer][i] + " ");
                }
                colPointer=colPointer+1;
            }else {
                break;
            }
        }
    }

    public void zigZagTraversalRtoL(int [][] arr) {
        int sizeOfRow = arr.length;
        int sizeOfCol = arr[0].length;
        int colPointer = 0;

        while (colPointer!=sizeOfCol-1){
            if (colPointer<=sizeOfCol-1){
                for (int i = sizeOfRow-1; i >=0; i--) {
                    System.out.print(arr[colPointer][i] + " ");
                }
                colPointer=colPointer+1;
                for (int i = 0; i < sizeOfCol; i++) {
                    System.out.print(arr[colPointer][i] + " ");
                }
                colPointer=colPointer+1;
            }else {
                break;
            }
        }
    }
    public static void main(String[] args) {

        ZigZagQues zig = new ZigZagQues();

        int[][] matrix = {
                {1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
        };
        //zigzag
        System.out.println();
        System.out.print("ZigZag Left to Right:  ");
        zig.zigZagTraversalLtoR(matrix);

        System.out.println();
        System.out.print("ZigZag Right to Left:  ");
        zig.zigZagTraversalRtoL(matrix);

    }
}
