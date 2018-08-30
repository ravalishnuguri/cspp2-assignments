import java.util.Scanner;
/** import for taking input.
**/
final class Solution {
    /** init method for class.
    **/
    private Solution() { }
    /**
     * Fill the main function to print resultant of addition of matrices.
     * @param      args  The arguments.
     **/
    public static void main(final String[] args) {
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
        int l1 = 3;
        if (size1 == l1) {
        for (int a = 0; a < size1; a++) {
            for (int b = 0; b < size2; b++) {
                arr3[a][b] = arr1[a][b] + arr2[a][b];
                System.out.print(arr3[a][b]);
                if (b < size2 - 1) {
                    System.out.print(" ");
                }
            }
            // System.out.print(Arrays.toString(arr3[a]));
            System.out.println();
        }
        }
        else {
            System.out.println("not possible");
        }

    }
}