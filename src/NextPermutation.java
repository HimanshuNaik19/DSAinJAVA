public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        // Your code here
        
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