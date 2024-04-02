package math_and_bit_manipulation;

public class ReverseInteger {
    static int reverse(int number){
        int result = 0;
        while (number != 0){
            int rem = number%10;
            if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10)
                return 0;
            
            result = result*10 + rem;
            number/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(478566));
    }
}
