package recursion;

public class TrianglePattern {

    static void printTriangle(int row, int column){
        if (row == 0)
            return;

        if (column < row){
            System.out.print("*");
            printTriangle(row, column+1);
        }else {
            System.out.println();
            printTriangle(row-1, 0);
        }
    }

    public static void main(String[] args) {
        printTriangle(4,0);
    }
}
