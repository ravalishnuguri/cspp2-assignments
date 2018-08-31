
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
import java.lang.Math;
public class Solution
{/*
    Do not modify this main function.
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            String s=sc.nextLine();
            String res=binaryToDecimal(s);//Write binaryToDecimal function
            System.out.println(res);
        }
    }
    static String binaryToDecimal(String str) {
        int j = 0;
        for (int i = 0; i<str.length();i++) {
            if (str.charAt(i) == '1') {
                j = (int) (j + Math.pow(2,str.length() - 1 - j));
            }
        }
        return j+"";
    }

}
