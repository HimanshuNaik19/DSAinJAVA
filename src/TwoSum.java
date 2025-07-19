import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum( int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            int comp = target- nums[i];
            if(numToIndex.containsKey(comp)){
                return new int[]{ numToIndex.get(comp), i};
            }
            numToIndex.put(nums[i],i);
        }
        throw new IllegalArgumentException();
    }
}
