package com.oct17;

public class First {

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

    //swastika and sum

    public int swastikaAndSum(int [][] arr){

        //for the s1
        int sizeOfRow=arr.length-1;
        int sizeOfCol=arr[0].length-1;
        int midOfRow= (arr.length/2);
        int midOfCol=(arr[0].length/2);
        int pointerLtoR=0;
        int pointerRtoL=sizeOfRow-1;
        int s1=0;
        int s2=0;

        System.out.print("traversal for s1: ");
        //s1
        for (int i=sizeOfCol;i>=midOfCol;i--){
            System.out.print(arr[0][i]+"+");
            s1=s1+arr[0][i];
        }
        pointerRtoL++;
        for (int i=pointerRtoL;i<=sizeOfRow;i++){
            System.out.print(arr[midOfRow][i]+"+");
            s1=s1+arr[midOfRow][i];
        }

        for (int i=midOfCol;i>=0;i--){
            System.out.print(arr[sizeOfRow][i]+"+");
            s1=s1+arr[sizeOfRow][i];
        }
        System.out.print("="+s1);
        System.out.println();

        System.out.print("traversal for s2: ");
        //s2
        for (int i=0;i<midOfCol;i++){
            System.out.print(arr[i][0]+"+");
            s2=s2+arr[i][0];
        }
        pointerLtoR++;
        for (int i=pointerLtoR;i<=sizeOfCol;i++){
            System.out.print(arr[midOfRow][i]+"+");
            s2=s2+arr[midOfRow][i];
        }

        for (int i=midOfRow+1;i<=sizeOfRow;i++){
            System.out.print(arr[i][sizeOfCol]+"+");
            s2=s2+arr[i][sizeOfCol];
        }
        System.out.print("="+s2);
        System.out.println();
        System.out.println("s1: "+s1+" ,s2: "+s2);
        int absoluteDiff=s1-s2;

        return  absoluteDiff;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        //147258369
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //123456789
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[j][i]);
            }
//            System.out.println();
        }

        System.out.println();
        System.out.println();

        //spiral traversal
        int[][] matrix = {
                {1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
        };
        int direction = 0;
        int top = 0;
        int left = 0;
        int down = matrix.length - 1;
        int right = matrix.length - 1;

        while (top <= down && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i]);
                }
                top += 1;
                direction += 1;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++) {
                    System.out.print(matrix[i][right]);
                }
                right -= 1;
                direction += 1;
            } else if (direction == 2) {
                for (int i = right; i >= top; i--) {
                    System.out.print(matrix[down][i]);
                }
                down -= 1;
                direction += 1;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--) {
                    System.out.print(matrix[i][left]);
                }
                left += 1;
                direction = (direction + 1) % 4;
            }
        }

        System.out.println();
        System.out.println();

        //Reverse Array Traversal

        int constant = 0;
        int directionn = 0;
        int arrayLenghtt = matrix.length - 1;
        while (directionn <= arrayLenghtt) {
//            if (directionn==0){
//                for (int i=0;i<=arrayLenghtt;i++){
//                    System.out.print(matrix[i][constant]);
//                }
//                directionn+=1;
//                constant+=1;
//            } else if (directionn==1) {
//                for (int i=0;i<=arrayLenghtt;i++){
//                    System.out.print(matrix[i][constant]);
//                }
//                directionn+=1;
//                constant+=1;
//            } else if (directionn==2) {
//                for (int i=0;i<=arrayLenghtt;i++){
//                    System.out.print(matrix[i][constant]);
//                }
//                directionn+=1;
//                constant+=1;
//            } else if (directionn==3) {
//                for (int i=0;i<=arrayLenghtt;i++){
//                    System.out.print(matrix[i][constant]);
//                }
//                directionn+=1;
//                constant+=1;
//            }

            for (int i = 0; i <= arrayLenghtt; i++) {
                System.out.print(matrix[i][constant] + " ");
            }
            directionn += 1;
            constant += 1;
        }

//        int[][] arr = {
//                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
//        };

        //N treversal
        int top1 = 0;
        int direction2 = 0;
        int arrLength = arr.length - 1;

        System.out.println();
        System.out.println();
        System.out.println("N traversal");

        while (direction2 <= arrLength) {
            if (direction2 == 0) {
                for (int i = arrLength; i >= 0; i--) {
                    System.out.print(arr[i][arrLength]+" ");
                }
                direction2++;

            } else if (direction2 == 1) {
                for (int i = arrLength/2; i > 0; i--) {
                    System.out.print(arr[i][i]+" ");
                }
                direction2++;
            } else if (direction2 == 2) {
                for (int i = arrLength; i >= 0; i--) {
                    System.out.print(arr[i][top1]+" ");
                }
                direction2++;
            }

        }

        //zigzag
        System.out.println();
        System.out.print("ZigZag Left to Right:  ");
        First first = new First();
        first.zigZagTraversalLtoR(matrix);

        System.out.println();
        System.out.print("ZigZag Right to Left:  ");
        first.zigZagTraversalRtoL(matrix);

        //swastika and sum
        int [][] swastika = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println();
        System.out.println("Swastika and sum: ");
        int diff=first.swastikaAndSum(swastika);
        System.out.println("Absolute diff of sum1 and sum2: "+diff);

    }
}
