import java.util.Scanner;
/**Write a java method that returns the decimal value for the given binary string.
**/
final class Solution {
    /**init method for class Solution.
    **/
    private Solution() { }
/**
 Do not modify this main function.

 @param  args  The arguments.
*/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**
     *  function_description.
     * @param      str   The string.
     * @return     { description_of_the_return_value }
     **/
    static String binaryToDecimal(final String str) {
        int k = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '1') {
                k = (int) (k + Math.pow(2, str.length() - 1 - j));
            }
        }
        return k + "";
    }
}
