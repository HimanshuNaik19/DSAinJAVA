import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Your code here
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        List<int[]> merged = new ArrayList<>();
        for(int [] interval :intervals){
            int start = interval[0], end = interval[1];
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < start){
                merged.add( new int[]{start,end});
            } else{
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],end);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        
        // Print the merged intervals
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        // Should output: [1, 6] [8, 10] [15, 18]
    }
}