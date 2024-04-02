package recursion;

public class ReverseString {

    static String reverseString(String str, int index){
        if (index >= str.length())
            return "";

        char ch = str.charAt(index);
        String reverse = reverseString(str, index+1);
        return reverse+ch;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("sandeep", 4));
    }
}
