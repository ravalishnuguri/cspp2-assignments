// Given an String, Write a java method that returns the decimal value for the given binary string.
import java.util.Scanner;
public class Solution
{/*
    Do not modify this main function.
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String res=binaryToDecimal(s);//Write binaryToDecimal function
            System.out.println(res);
        }
    }
    static String binaryToDecimal(String str) {
        int k = 0;
        for (int j = 0; j<str.length();j++) {
            if (str.charAt(j) == '1') {
                k = (int) (k + Math.pow(2,str.length() - 1 - k));
            }
        }
        return k+"";
    }
}
