import java.util.Scanner;
/** Given an String, Write a java method that returns the
decimal value for the given binary string.
**/
final class Solution {
    /**init method for Solution class.
    **/
    private Solution() { }
/**
  Do not modify the main function.
  @param      args  The arguments.
**/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
    / Write reverseString function.
     @param      str   The string.
     @return     { description_of_the_return_value }
    **/
    static String reverseString(final String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
        // for(int i = str.length-1;i>=0;i--) {

        // }
    }

}

