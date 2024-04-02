package recursion;

public class CountZeroes {
    static int countZero(int num){
        if (num == 0)
            return 0;

        int rem = num%10;
        if(rem == 0)
        return 1 + countZero(num/10);

        return countZero(num/10);
    }

    public static void main(String[] args) {
        System.out.println(countZero(05542220));
    }
}
