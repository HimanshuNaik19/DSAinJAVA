public class QuickSort {
    public static void main(String a[])
    {
        int arr[]={6,5,2,3,1,8,4};
        System.out.println("before sorting: ");
        for(int num :arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        quickSort(arr,0,arr.length-1);

        System.out.println("after sorting: ");
        for(int num :arr)
        {
            System.out.print(num+" ");
        }

    }
    public static void quickSort(int arr[] , int left, int right){
        if(left<right){
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }
    public static int partition( int arr[], int low , int high){
        int pivot  = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
}

