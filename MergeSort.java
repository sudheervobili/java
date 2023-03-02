import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class MergeSort {

    void merge_sort1(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort1(arr, low, mid);
            merge_sort1(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    void merge(int arr[],int low,int mid, int high)
    {
        int arr1[10];
        int i,j,k;
        k = low;
        i = low;
        j = mid+1;
        while(i<=mid && j<=high)
        {
            if(arr[i] < arr[j])
            {
                arr1[i] = arr[i];
                i++;
                k++;
            }
            else{
                arr1[j] = arr[j];
                j++;
                k++;
            }
        }
        if(i>mid)
        {
            while(j<=high)
            {
                arr1[j] = arr[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<=mid){
            arr1[i] = arr[i];
            i++;
            k++;
            }
        }
        for(k=low;k<=high;k++)
        {
            arr[k] = arr1[k];
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        MergeSort ms = new MergeSort();
        ms.merge_sort1(arr, 0, size - 1);

    }
}
