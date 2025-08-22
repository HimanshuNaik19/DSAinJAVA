import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public int[]  element( int[] nums1, int[] nums2){
        Map<Integer,Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                nextGreater.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            nextGreater.put(stack.pop(),-1);
        }
        int[] output = new int[nums1.length];
        for(int i=0;i< nums1.length;i++){
            output[i] = nextGreater.get(nums1[i]);
        }
        return output;
    }
}
