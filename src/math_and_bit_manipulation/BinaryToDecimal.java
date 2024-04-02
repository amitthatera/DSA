package math_and_bit_manipulation;

public class BinaryToDecimal {
    static int binaryToDecimal(int number){
        int result = 0;
        int index = 0;
        while (number != 0){
            int rem = number%10;
            if (rem == 1)
                result = result + (int)Math.pow(2,index);
            number/=10;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(111));
    }
}
