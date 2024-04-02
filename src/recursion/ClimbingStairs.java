package recursion;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    static int[] arr = new int[46];
    static int countWaysOfClimbingStairs(int n){
        if (n == 0)
            return 1;

        if (n < 0)
            return 0;

        if(arr[n] != 0)
            return arr[n];

        return arr[n] = countWaysOfClimbingStairs(n-1) + countWaysOfClimbingStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(countWaysOfClimbingStairs(7));
    }
}
