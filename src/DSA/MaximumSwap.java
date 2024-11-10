package DSA;

public class MaximumSwap {
    /*
    You are given an integer num. You can swap two digits at most once to get the maximum valued number.
      Return the maximum valued number you can get.
Example 1:
Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:
Input: num = 9973
Output: 9973
Explanation: No swap.

Constraints:
0 <= num <= 108
     */

    public int maximumSwap(int num) {
        char [] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;
        char maxElement=numArr[n-1];
        int maxIndex=n-1;
        int swpInd1=-1;
        int swpInd2=-1;

        for (int i=n-2;i>=0;i--){
            if (numArr[i]>maxElement){
                maxElement=numArr[i];
                maxIndex=i;
            } else if (numArr[i]<maxElement) {
                swpInd1=i;
                swpInd2=maxIndex;
            }
        }
        if (swpInd1!=-1){
            char temp=numArr[swpInd1];
            numArr[swpInd1]=numArr[swpInd2];
            numArr[swpInd2]=temp;
        }

        return Integer.parseInt(new String(numArr));
    }

    public static void main(String[] args) {

        MaximumSwap maximumSwap = new MaximumSwap();
        int result = maximumSwap.maximumSwap(2736);
        System.out.println(result);
    }
}
