import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums){
        Arrays.sort(nums); 
    }
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        sortColors(array);
        
        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Should output: 0 0 1 1 2 2
    }
}
