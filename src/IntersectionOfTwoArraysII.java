import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersection(int[] nums1, int[] nums2){
        Map<Integer, Integer> seen = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums1){
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            if(seen.containsKey(num) && seen.get(num) > 0){
                result.add(num);
                seen.put(num,seen.get(num)-1);
            }
        }
        int[] output = new int[result.size()];
        for(int i=0; i<result.size();i++){
            output[i] = result.get(i);
        }
        return output;
    }
}
