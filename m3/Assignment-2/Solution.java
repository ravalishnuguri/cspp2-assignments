import java.util.Scanner;
/**
 Do not modify this main function.
**/
final class Solution {
/**
 * Class for solution.
 **/
    private Solution() { }
/**
 * Fill the main function to print the number of 7's between 1 to n.
 *
 * @param      args  The arguments.
 **/
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        final int div = 10;
        final int res = 7;
        final int adiv = 10;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                if (j % div == res) {
                    count = count + 1;
                }
                j = Math.round(j / adiv);
            }
        }
        System.out.println(count);
    }
}
