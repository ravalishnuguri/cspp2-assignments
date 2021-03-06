import java.util.Scanner;
/**
 Do not modify this main function.
**/
final class Solution {
    /**
     * class for finding gcd.
     **/
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments.
     **/
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
    }
    /**
    Need to write the gcd function and print the output.
    @param      num1  The number 1.
    @param      num2  The number 2.
    **/
    static void gcd(final int num1, final int num2) {
        int g = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                g = i;
            }
        }
        System.out.println(g);
    }
}
