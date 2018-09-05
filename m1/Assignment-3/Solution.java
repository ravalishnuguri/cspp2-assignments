import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double degreesCelsius = scan.nextDouble();
		// calculateFromDegreesToFarenheit(degreesCelsius);
		// degreesCelsius = (degreesCelsius - 32)*1.8;
		degreesCelsius = (degreesCelsius * (9.0/5.0))+32;
		System.out.println(degreesCelsius);
	}\
	/*
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*/
	// static void calculateFromDegreesToFarenheit(double dc);
	// {
	// 	dc = ((dc - 32)*5)/9;
	// 	System.out.println(dc);

	// }
}