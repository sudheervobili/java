import java.util.*;

public class BubbleSort1 {
    void bubble_sort(int arr[]) {
        int i, j, temp, size;
        size = arr.length;
        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void Printarr(int arr[]) {
        int i, size;
        size = arr.length;
        for (i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("Enter elements into array: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort1 bs1 = new BubbleSort1();
        bs1.bubble_sort(arr);
        System.out.println("After sorting : ");
        bs1.Printarr(arr);
        sc.close();
    }
}
