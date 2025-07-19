
import java.sql.SQLOutput;
import java.util.*;

public class Solution {
//    public int toSum(int[] nums,int target)
//    {
//        Map<Integer, Integer> numToIndex = new HashMap<>();
//        for(int i=0; i < nums.length;i++) {
//            int compliment = target - nums[i];
//            if(numToIndex.containsKey(compliment)){
//                return new int[]{numToIndex.get(compliment),i};
//            }
//        }
//    }
//    public int toSum(int[] nums, int target){
//        Map< Integer, Integer> numToIndex = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int comp = target - nums[i];
//            if( numToIndex.containsKey(comp)){
//                return new int[]{numToIndex.get(comp),i};
//            }
//            numToIndex.put(nums[i],i);
//        }
//        throws new IllegalArgumentException(" No two sum solution");
//    }

    public boolean isPalindrome(int x){
        if(x<0)
        {
            return false;
        }
        int original =x;
        int reverse = 0;
        while(x>0)
        {
            int digit = x%10;
            reverse = reverse*10+digit;
            x= x/10;
        }
        return original == reverse;
    }


public static void main(String args[])
{
//    Scanner sc = new Scanner(System.in);
//    int[][] arr = new int[6][6];
//
//    for(int i=0;i<6;i++)
//    {
//        for(int j=0;j<6;i++){
//            arr[i][j] = sc.nextInt();
//        }
//    }
//
//    int maxSum = Integer.MIN_VALUE;
//    for(int i=0;i<3;i++)
//    {
//        for(int j=0;j<3;j++){
//            int top = arr[i][j]+ arr[i][j+1]+ arr[i][j+2];
//            int mid = arr[i+1][j+1];
//            int bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
//
//            int total = top + mid + bottom;
//
//            maxSum = Math.max(maxSum, total);
//        }
//    }
//    System.out.println(maxSum);
//    sc.close();
}
}
