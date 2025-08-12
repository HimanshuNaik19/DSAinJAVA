public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        // Your code here
        int n = nums.length;
        int[] answer = new int[n];
        
        answer[0] = 1;
        for(int i = 1 ; i < n ; i++){

            answer[i] = answer[i-1] * nums[i-1];
        }

        int right = 1;
        for( int i = n - 1 ; i >= 0 ; i++){
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
        return answer;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] result = productExceptSelf(array);
        
        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Should output: 24 12 8 6
    }
}