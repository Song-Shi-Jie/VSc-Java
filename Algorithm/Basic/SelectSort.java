package Algorithm.Basic;

public class SelectSort {
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
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
        selectSort(num);
        printArray(num);
    }
}