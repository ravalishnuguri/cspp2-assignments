import java.util.Scanner;
/**
 * Class for solution.
 **/
final class Solution {
    /**
 * Class for solution.
 **/
    private Solution() { }
    /**
    @param      args  The arguments
    Do not modify this main function.
    
    **/
    public static void main(final String[] args) {
        /* main function*/
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    @param      a     { parameter_description }
    @param      b     { parameter_description }
    @return     { returns a power b }
    */
    static long power(final int a, final int b) {
        if (b != 0) {
            return (a * (power(a, b - 1)));
        }else {
            return 1;
        }
    }
}
