package DSA;

public class SingleNumber {
    /*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
     */

    public int singleNumber(int[] nums) {
        int number = 0;
        for (int i=0;i<nums.length;i++){
            //performing XOR operation with all the elements of the array
            //that will give as ans that single one element.
            //because XOR will give 0 as output for two same operand
            number=number^nums[i];
    }
        return number;
}

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int [] arr = {0};
        int result = singleNumber.singleNumber(arr);
        System.out.println(result);
    }
}