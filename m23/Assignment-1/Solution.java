import java.util.*;
import java.io.*;
class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.isEmpty()){
			// System.out.println("empty directory");
			throw new NoSuchElementException("empty directory");
		}else {
			File file = new File(s);
        	File[] files = file.listFiles();
        	for(File f: files){
            System.out.println(f.getName());
        	}
		}
	}
}