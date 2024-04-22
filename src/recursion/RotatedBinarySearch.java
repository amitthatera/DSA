package recursion;

public class RotatedBinarySearch {

    public static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;

        // If the left half is sorted
        if (arr[start] <= arr[mid]) {
            // If the target lies in the left half
            if (target >= arr[start] && target <= arr[mid])
                return rotatedBinarySearch(arr, target, start, mid - 1);
            // If not, search in the right half
            return rotatedBinarySearch(arr, target, mid + 1, end);
        }

        // If the right half is sorted
        if (target >= arr[mid] && target <= arr[end])
            return rotatedBinarySearch(arr, target, mid + 1, end);
        // If not, search in the left half
        return rotatedBinarySearch(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBinarySearch(arr, 6, 0, arr.length - 1));
    }
}
