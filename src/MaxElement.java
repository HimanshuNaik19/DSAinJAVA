
import java.util.Arrays;

public class MaxElement {
    public static int findMax(int[] arr){
        int max = arr.length-1;
        Arrays.sort(arr);
        return arr[max];
    }
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 1, 5};
        System.out.println(findMax(array));  // Should output 9
    }
}
