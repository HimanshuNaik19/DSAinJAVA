import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            if (i + 1 < nums.length && nums[i+1] == nums[i] + 1) {
                i++;
            }
            int end = nums[i];
             if(start == end ){
                 result.add(String.valueOf(start));
             }else {
                 result.add(start + "->" + end);
             }
             i++;
        }
        return result;
    }
}
