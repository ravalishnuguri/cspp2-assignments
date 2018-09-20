import java.util.*;
import java.io.*;
class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		File file = new File("E:/MSIT/CSPP2/cspp2-assignments/m23/Assignment-1/");
        File[] files = file.listFiles();
        for(File f: files){
            // System.out.println(f.getName());
            if (f.getName().equals(s)) {
            	System.out.println(f.getName());
            } else {
            	System.out.println("empty directory");
            	break;
            }
        }

	}
}