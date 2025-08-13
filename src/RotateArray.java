public class RotateArray {
    public static void rotateArray(int[] arr, int k){
        k = k % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse( int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(array, 3);
        
        // Print the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Should output: 5 6 7 1 2 3 4
    }
}
