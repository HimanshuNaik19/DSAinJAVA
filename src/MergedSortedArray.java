public class MergedSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j= n-1;
        int k= m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]= nums2[j--];
        }
    }
    public static void main(String[] args) {
        MergedSortedArray ms = new MergedSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        ms.merge(nums1,3,nums2,3);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

    }
}
