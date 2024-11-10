package DSA;
import java.util.Scanner;
public class Solution {
    public String largestOddNumber(String num) {
//        int number = Integer.parseInt(num);
//        if (number%2!=0){
//            return String.valueOf(number);
//        }else{
//            int count = number/10;
//            for (int i=0;count>=0;i++){
//                if (number%2!=0){
//                    return String.valueOf(number);
//                }
//                number=number/10;
//                if (number==0){
//                    return "";
//                }
//                count=number/10;
//            }
//        }

        for (int i=num.length();i>=0;i--){
            if (i!=0 && num.charAt(i-1)%2!=0){
                return num.substring(0,i);
            }
            if(i==0){
                if (i%2!=0){
                    return num.substring(0,1);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        String nm = s.largestOddNumber(ans);

        System.out.println();

        System.out.println(nm);
    }
}