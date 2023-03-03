package Algorithm.Basic;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        if (arr == null)
            return;
        for (int cur : arr) {
            System.out.println(cur);
        }
    }

    public static void main(String[] args) {
        int[] num = { 1, 3, 2, 7, 9, 3, 10 };
        bubbleSort(num);
        printArray(num);
    }

}