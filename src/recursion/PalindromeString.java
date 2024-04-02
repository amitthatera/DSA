package recursion;

public class PalindromeString {

    static boolean checkPalindrome(String str, int i, int j){
        if(i>=j)
            return true;

        if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j))
            return false;

        return checkPalindrome(str, i+1, j-1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str,0, str.length()-1));
    }
}
