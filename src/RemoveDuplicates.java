
public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        if(arr.length == 0) return 0;
        int unique = 0;
         for( int i=0;i<arr.length;i++){
            if(arr[i] != arr[unique]){
                unique++;
                arr[unique] = arr[i];
            }
         }
         return unique+1;

    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(array);
        System.out.println("New length: " + newLength);  // Should output 5
        
        // Print the array with duplicates removed
        System.out.print("Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
        // Should output: 1 2 3 4 5
    }
 
}
