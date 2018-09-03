import java.util.Scanner;
class InputValidator {
	String a;
	public InputValidator(String str) {
		a = str;
	}
	public boolean validateData() {
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
public class Solution
{
	public static void main(final String args[])
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
