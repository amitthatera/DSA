package searching;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 11, 17, 23, 28, 40, 56};
        System.out.println(binarySearch(arr, 23));
    }
}
