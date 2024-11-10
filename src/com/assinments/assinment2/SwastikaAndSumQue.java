package com.assinments.assinment2;

public class SwastikaAndSumQue {
    public int swastikaAndSum(int [][] arr){

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
        SwastikaAndSumQue s= new SwastikaAndSumQue();

        //swastika and sum
        int [][] swastika = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println();
        System.out.println("Swastika and sum: ");
        int diff=s.swastikaAndSum(swastika);
        System.out.println("Absolute diff of sum1 and sum2: "+diff);
    }
}
