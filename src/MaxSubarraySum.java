public class MaxSubarraySum {
    public static int maxSubArray( int[] nums){
        int currentSum = nums[0];
        int maxSum= nums[0];
        for(int i=0;i<nums.length;i++){
            currentSum = Math.max(nums[i], currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(array));  // Should output 6 (subarray [4, -1, 2, 1])
    }
}
