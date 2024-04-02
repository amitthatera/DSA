package recursion;

public class FibonacciNumber {
String[] arr = new String[45];

    static int fiboNumber(int number){

        if (number <= 1)
            return number;

        return fiboNumber(number - 2) + fiboNumber(number - 1);
    }

    public static void main(String[] args) {
        int num = 8;
        for (int i = 0; i< num; i++){
            System.out.print(fiboNumber(i)+", ");
        }
    }
}
