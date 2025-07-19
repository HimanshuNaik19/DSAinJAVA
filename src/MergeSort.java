public class MergeSort {
   public static void main (String a[]){
    int arr[]={7,8,4,6,2,3};
    System.out.println("before sorting: ");
        for(int num : arr){
        System.out.print(num+" ");}
        System.out.println();

        mergeSort(arr,0,arr.length-1);

        System.out.println("after sorting: ");
        for(int num :arr)
    {
        System.out.print(num+" ");
    }
}

    private static void mergeSort(int[] arr, int l, int r) {
       if(l<r)
       {
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
       }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

       int n1=mid -l+1;
       int n2 =r-mid;
       int LArr[]=new int[n1];
       int RArr[]=new int[n2];

       for(int x=0;x<n1;x++){
           LArr[x]=arr[l+x];
       }
        for(int x=0;x<n1;x++){
            RArr[x]=arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if (LArr[i]<=RArr[j])
            {
                arr[k]=LArr[i];
                 i++;
            }
            else{
                arr[k]=RArr[j];
                j++;
            }
            k++;

        }
        while(i<n1)
        {
            arr[k]=LArr[i];
            i++;
            k++;
        }
        while(i<n2)
        {
            arr[k]=RArr[i];
            i++;
            k++;
        }
    }
}
