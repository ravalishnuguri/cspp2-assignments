import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {
    /*
    Do not modify this main function.
    
    @param      args  The arguments
    */
    public static void main(String[] args) {
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
    static long power(int a, int b) {
        /*function for power */
        if (b != 0) {
            return (a * (power(a, b - 1)));
        }
        else {
            return 1;
        }
    }
}
