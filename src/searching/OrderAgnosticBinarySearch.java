package searching;

public class OrderAgnosticBinarySearch {
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            int mid = start + (end - start)/2;

            if(target == arr[mid])
                return mid;

            if (isAsc){
                if(target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
            }else{
                if(target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {211, 206, 170, 163, 141, 123, 112, 40, 16};
        System.out.println(binarySearch(arr, 112));
    }
}
