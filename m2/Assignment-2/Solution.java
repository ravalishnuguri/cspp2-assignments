import java.util.Scanner;
import java.lang.Math;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	static void rootsOfQuadraticEquation(int x, int y, int z)
	{
		double root1;
		double root2;
		double quad;
		quad = Math.sqrt((y*y)-(4*x*z));
		root1 = (-y + quad)/2*x;
		root2 = (-y - quad)/2*x;
		// return root1,  root2;
		System.out.format("%f %f",root1,root2);
		// System.out.println(root2);

	}
}
