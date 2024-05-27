package concept;
import java.util.Arrays;

public class DSA_Selection_sort
    {
    public static void main(String[] args)
        {
        int[] arr={3,2,7,5};
        for (int minIndex = 0; minIndex <arr.length-1 ; minIndex++) //only for index  -> pointer
            {
            int min=minIndex;
            for(int j=minIndex+1;j<arr.length;j++)
                if(arr[min]>arr[j])
                    {
                    min=j;
                    }
            int temp=arr[minIndex];
            arr[minIndex]=arr[min];
            arr[min]=temp;
            }
        }
    }
