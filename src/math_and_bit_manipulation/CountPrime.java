package math_and_bit_manipulation;

import java.util.stream.Stream;

public class CountPrime {
    static int countPrimes(int n) {
        if(n<=2)
            return 0;

        boolean[] composites = new boolean[n];
        int count = 0;
        for (int i=2; i*i<=n; i++){
            if(!composites[i]){
                for (int j=i*i; j<n; j+=i){
                    composites[j] = true;
                }
            }
        }

        for(int i=2; i<n; i++){
            if(!composites[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(50));
    }
}
