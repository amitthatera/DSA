package sorting;

import java.util.Arrays;

public class BubbleSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            boolean isSwapped = true;
            for (int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    isSwapped = false;
                }
            }

            if (isSwapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 24, 12, 75, 31, 62, 93};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
