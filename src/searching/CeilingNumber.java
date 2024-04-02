package searching;

public class CeilingNumber {

    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1])
            return -1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;      //in case of floor return end
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(ceilingNumber(arr, 2));
    }
}
