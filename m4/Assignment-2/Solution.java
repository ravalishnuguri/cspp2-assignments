import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int[][] arr1 = new int[size1][size2];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		// System.out.println(Arrays.toString(arr1));
		int size3 = sc.nextInt();
		int size4 = sc.nextInt();
		int[][] arr2 = new int[size3][size4];
		for (int m = 0; m < arr2.length; m++) {
			for (int n = 0; n < arr2[m].length; n++) {
				arr2[m][n] = sc.nextInt();
			}
		}
		// System.out.println(Arrays.toString(arr2));
		int[][] arr3 = new int[size1][size2];
		for (int a = 0;a<size1;a++) {
			for (int b = 0; b<size2;b++) {
				arr3[a][b] = arr1[a][b] + arr2[a][b];
				System.out.print(arr3[a][b]+" ");
			}
			System.out.println();
		}
	}
}