package searching;

public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {45, 24, 12, 75, -31, 62, 93};
        System.out.println(linearSearch(arr, 45));
    }
}
