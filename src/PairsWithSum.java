import java.util.HashMap;
import java.util.Map;


public class PairsWithSum {
    public static void findPairs(int[] arr, int targetSum){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int diff = targetSum - arr[i];
            if(map.containsKey(diff)){
                System.out.println("(" + diff + ", " + arr[i] + ")");
            }
            map.put(arr[i],i);
        } 
    }
    public static void main(String[] args) {
        int[] array = {2, 9, 1, 8, 3, 6};
        int target = 9;
        findPairs(array, target);  // Should output pairs like (2,7), (3,6)
    }

}
