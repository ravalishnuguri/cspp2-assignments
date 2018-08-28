import java.util.Scanner;
// import java.lang.Math;
/**
 * program for quadratic expression.
 **/
final class Solution {
    /**
     * Constructs the object.
     **/
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments.
     **/
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /**
    Need to write the rootsOfQuadraticEquation function and
    print the output.
    @param      x     { parameter_description }
    @param      y     { parameter_description }
    @param      z     { parameter_description }
    **/
    static void roots(final int x, final int y, final int z)
    {
        double root1;
        double root2;
        double quad;
        quad = Math.sqrt((y * y) - (4 * x * z));
        root1 = (-y + quad) / (2 * x);
        root2 = (-y - quad) / (2 * x);
        // return root1,  root2; System.out.format("%.1f %.1f",root1,root2);
        // System.out.println(root2);
        System.out.println(root1 + " " + root2);
    }
}

