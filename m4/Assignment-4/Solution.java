
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify the main function 
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverse=reverseString(s);	
		System.out.println(reverse);
		
	}
	//Write reverseString function
	static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i= str.length() - 1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
		// for(int i = str.length-1;i>=0;i--) {

		// }
	}

}
