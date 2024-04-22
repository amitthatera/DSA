package recursion;

public class LinearSearch {

    static int linearSearch(int[] arr, int target, int index){
        if(index >= arr.length-1)
            return -1;

        if (arr[index] == target)
            return index;
        else
            return linearSearch(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {8,6,4,2,3,5,7,1};
        System.out.println(linearSearch(arr,2,0));
    }
}
