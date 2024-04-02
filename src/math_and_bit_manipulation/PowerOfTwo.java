package math_and_bit_manipulation;

public class PowerOfTwo {
    static boolean isPowerOfTwo(int num){
        while (num != 0){
            int lastBit = num & 1;
            num = num >> 1;
            if(lastBit == 1 & num != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(10));
    }
}
