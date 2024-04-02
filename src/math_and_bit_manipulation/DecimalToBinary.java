package math_and_bit_manipulation;

public class DecimalToBinary {
    static String decimalToBinary(int number){
        String result = "";
        while(number != 0){
            int lastBit = number & 1;
            result = lastBit + result;
            number = number >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(7));
    }
}
