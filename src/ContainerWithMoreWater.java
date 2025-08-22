public class ContainerWithMoreWater {
    public int maxArea(int[] height){
        int maxArea =0;
        int left =0;
        int right = height.length;

        while(left< right){
            int width = right -left;
            int currentheight= Math.min(height[left],height[right]);
            int currentArea = width * currentheight;
            maxArea = Math.max(maxArea,currentArea);

            if(height[left] < height[right]){
                left++;
            }else right--;
        }
        return maxArea;
    }
}
