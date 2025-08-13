public class BinarySearch {
    public int search(int [] nums , int target){
        if(nums == null || nums.length == 0) return -1;

         int low = 0;
         int high = nums.length;
         while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){  
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(bs.search(nums,target));
    }

}
