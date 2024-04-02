package recursion;

public class PalindromeNumber {

    static int reverse = 0;
    static boolean checkPalindrome(int num){
        int temp = num;
        if(num == 0)
            return true;

        int lastDigit = num % 10;
        reverse = reverse*10 + lastDigit;
        checkPalindrome(num/10);

        return temp == reverse;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(11211));
    }
}
