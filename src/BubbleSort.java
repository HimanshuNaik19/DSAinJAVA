import java.sql.SQLOutput;

public class BubbleSort {

    public static void main(String a[])
    {
        int[] arr = {1,4,6,7,8,9};
        int temp=0;
        System.out.println("before sorting: ");
        for(int num :arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("after sorting: ");
        for(int num :arr)
        {
            System.out.print(num+" ");
        }

    }
}
