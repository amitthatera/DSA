package math_and_bit_manipulation;

public class ComplementOfInteger {
    static int complementOfBase10Integer(int number){
        int num = number;
        int mask = 0;
        if(number == 0)
            return 1;

        while(num != 0){
            mask = mask << 1 | 1;
            num = num >> 1;
        }
        return (~number) & mask;
    }

    public static void main(String[] args) {
        System.out.println(complementOfBase10Integer(6));
    }
}
