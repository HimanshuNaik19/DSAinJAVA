public class SelectionSort {
    public static void main (String a[]) {
        int[] arr = {1, 4, 6, 8, 3, 5, 7};
        int temp = 0;
        int minIndex = -1;
        System.out.println("before sorting: ");
        for (int num : arr){
            System.out.print(num+" ");}
        for(int i=0;i<arr.length-1;i++)
        {
            minIndex =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex =j;
                }
            }
            temp= arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            System.out.println();
            for (int num : arr){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        System.out.println("after sorting: ");
        for (int num : arr){
            System.out.print(num+" ");}
    }
}
