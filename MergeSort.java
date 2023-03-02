import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println("Enter size of the array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            int i;
            System.out.println("Enter elements: ");
            for (i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            MergeSort ms = new MergeSort();
            System.out.println("before sorting: ");
            int n = arr.length;
            for (i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }

            ms.merge_sort(arr);
            System.out.println("After sorting: ");
            ms.Printarr(arr);
        }
    }

    void merge_sort(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        merge_sort(left);
        merge_sort(right);
        merge(arr, left, right);
    }

    void merge(int arr[], int left[], int right[]) {
        int l1 = left.length;
        int r1 = right.length;
        int i = 0, j = 0, k = 0;
        while (i <= l1 && j < r1) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < l1) {
            arr[k] = left[i];
            i++;
            k++;

        }

        while (j < r1) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    void Printarr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
