
import java.util.*;

public class BubbleSort {
    int Binary_search(int arr[], int low, int high, int key) {
        if (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return Binary_search(arr, mid + 1, high, key);
            } else {
                return Binary_search(arr, low, mid - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int i;
        System.out.println("Enter size of the array : ");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter elements into array : ");
        for (i = 0; i < size; i++) {
            arr1[i] = sc1.nextInt();
        }
        System.out.println("Enter key element: ");
        int key = sc1.nextInt();
        int res = bs.Binary_search(arr1, 0, size - 1, key);
        if (res == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found at " + res);
        }

    }

}
