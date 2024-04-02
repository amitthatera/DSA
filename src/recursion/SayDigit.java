package recursion;

public class SayDigit {

    static String[] digits = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
    static void sayDigit(int num){
        if(num <= 0)
            return;

       int lastDigit = num %10;
       sayDigit(num/10);
       System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {
        sayDigit(425680250);
    }
}
