import java.util.Scanner;
/** import for taking input
**/
final class Solution {
/**
 Fill this main function to print maximum of given array.
**/
	private Solution() { }
	/**
	init method for Solotion.
	
	@param      args  The arguments.
	**/
	public static void main(final String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

