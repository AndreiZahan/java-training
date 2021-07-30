package code._4_student_effort._6_challengeSix;

public class Main {

    public static void main(String[] args) {
        int[][] m = {
        { 1,  2,  3,  4,  5},
        { 6,  7,  8,  9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
        };

        printMatrixSpiralToRight(m);
    }

    static void printMatrixSpiralToRight (int[][] m) {
        int rows = m.length; // = 3
        int columns = m[0].length; // = 5

        int top = 0;
        int right = columns - 1; // = 4
        int bottom = rows - 1; // = 2
        int left = 0;

        int d = 1;

        while (top <= bottom && left <= right) {
            if (d == 1) {
                //  1. print from left to right first row
                for (int i = top; i <= right; i++) {
                    System.out.print(m[top][i] + " ");
                }
                top++;
                d = 2;
            } else if (d == 2) {
                // 2. print last column from top to bottom
                for (int i = left; i <= bottom; i++) {
                    System.out.print(m[i][right] + " ");
                }
                right--;
                d = 3;
            } else if (d == 3) {
                // 3. print last row from right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(m[bottom][i] + " ");
                }
                bottom--;
                d = 4;
            } else if (d == 4) {
                // 4. print first column from bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(m[i][left] + " ");
                }
                left++;
                d = 1;
            }
        }
    }
}
