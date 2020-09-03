
import java.util.Scanner;

public class LongestString {

    static void printStringChain(String firstString, String secondString, int m, int n) {

        int[][] equality = new int[m + 1][n + 1];


        int length = 0;

        int row = 0, column = 0;


        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    equality[i][j] = 0;

                else if (firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
                    equality[i][j] = equality[i - 1][j - 1] + 1;
                    if (length < equality[i][j]) {
                        length = equality[i][j];
                        row = i;
                        column = j;
                    }
                } else
                    equality[i][j] = 0;
            }
        }

        if (length == 0) {
            System.out.println("No Common Substring");
            return;
        }


        String resultStr = "";


        while (equality[row][column] != 0) {
            resultStr = firstString.charAt(row - 1) + resultStr;
            --length;
            row--;
            column--;
        }

        System.out.println(resultStr);
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Your first String?");
        String X = scan.nextLine();
        System.out.println("Your second String");
        String Y = scan.nextLine();

        int m = X.length();
        int n = Y.length();

        printStringChain(X, Y, m, n);
    }
}
