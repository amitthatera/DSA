package sorting;

import java.util.Arrays;

public class CycleSort {

    static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,4,2,3,5,7,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
