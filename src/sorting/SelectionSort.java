package sorting;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 24, 12, 75, -31, 62, 93};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
