import java.util.Scanner;
/**
 * Class for input validator.
 **/
final class InputValidator {
    /**
     * delcaring string a.
     **/
    String data;
     /**
     * delcaring string a.
     **/
    int length;
    /**
     * Constructs the object.
     *
     * @param      str   The string.
     **/
     InputValidator(final String str) {
        /**
         * assigning string to variable a.
         **/
        data = str;
        length = str.length();
    }
    /**
     * valid date method.
     *
     * @return     boolean type is returned in the condition fails.
     **/
    public boolean validateData() {
        /**
         * using conditional boolean to get the result.
         **/
        final int b = 6;
        if (length >= b) {
            // System.out.println("True");
            return true;
        }
            // System.out.println("False");
        return false;
    }
    /*Write the atrributes and methods for InputValidator*/
}
/**
 * Class for solution.
 **/
final class Solution {
    /**
     * Constructs the object.
     **/
    private Solution() { }
    /**
     * main method of the program.
     *@param args for main function.
     **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }

}
