package recursion;

public class NthPower {

    static int nthPowerOfNumber(int num, int power){
        if (power == 0)
            return 0;

        if (power == 1)
            return num;

        return num * nthPowerOfNumber(num, power-1);
    }

    public static void main(String[] args) {
        System.out.println(nthPowerOfNumber(3,5));
    }
}
