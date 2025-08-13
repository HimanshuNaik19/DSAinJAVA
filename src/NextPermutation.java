public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i= n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(j>=0 && nums[j] <=nums[i]){
                j--;
            }
            swap(nums,i,j);
            reverse(nums,i+1,n-2);
        }
        else{ reverse(nums,0,n-1);}
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        nextPermutation(array1);
        printArray(array1);  // Should output: 1 3 2
        
        int[] array2 = {3, 2, 1};
        nextPermutation(array2);
        printArray(array2);  // Should output: 1 2 3
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}