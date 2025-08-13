public class ReverseArray {
    public static void reverseArray(int[] arr){
        int left =0, right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        
        // Print the reversed array
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Should output: 5 4 3 2 1
    }
}
