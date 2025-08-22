public class MergeSort {
    public static void main(String a[]) {
        int arr[] = {7, 8, 4, 6, 2, 3};
        System.out.println("before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("after sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int i, int i1) {
        if (i < i1) {
            int mid = (i + i1) / 2;
            mergeSort(arr, i, mid);
            mergeSort(arr, mid + 1, i1);
            merge(arr, i, mid, i1);
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {

    }


}
