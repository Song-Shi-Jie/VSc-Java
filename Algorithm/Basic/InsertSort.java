package Algorithm.Basic;
 
public class InsertSort {
    public static void insertSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            while(arr[i+1]<arr[i]){
                swap(arr, i, i+1);
                i--;
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
        insertSort(num);
        printArray(num);
    }
    
}
