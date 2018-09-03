import java.util.Scanner;
/**
 * Class for input validator.
 **/
final class InputValidator {
	/**
	 * declaring string a.
	 **/
	String a;
	public InputValidator(final String str) {
		/**
		 * assigning string to variable a.
		 **/
		a = str;
	}
	public boolean validateData() {
		/**
		 * using conditional boolean to get the result.
		 **/
		final int b = 6;
		if (a.length() >= b) {
			// System.out.println("True");
			return true;
		}
		else {
			// System.out.println("False");
			return false;
		}
	}
	/*Write the atrributes and methods for InputValidator*/
}
/**
 * Class for solution.
 **/
public class Solution {
	/**
	 * main method of the program.
	 */
	public static void main(final String args[]) {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);
    	System.out.println(i.validateData());
    }

}
