// import java.util.*;
// import java.io.*;
// class Solution {
//     private Solution() { }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         if (s.isEmpty()){
//             // System.out.println("empty directory");
//             throw new NoSuchElementException("empty directory");
//         } else {
//             File file = new File(s);
//             File[] files = file.listFiles();
//             // Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));
//             for(File f: files){
//             System.out.println(f.getName());
//             }
//         }
//     }
// }
// class plag {
    
// }
import java.util.*;
import java.io.*;
import java.lang.*;
class plagiarism {
    public HashMap map(File filename){
        HashMap<String,Integer> hm = new <String,Integer>HashMap();
        try{
            BufferedReader b = new BufferedReader(new FileReader(filename));
            String str = b.readLine();
            while(str!=null){
                String[] line = str.split(" ");
                String word ="";
                for(int i = 0;i<line.length;i++) {
                    word = line[i].replaceAll("[.,*%&!@#$():?-]","").trim().toLowerCase();
                    if(word.length()>0){
                        if(hm.containsKey(word)) {
                            hm.put(word,hm.get(word)+1);
                        } else {
                            hm.put(word,1);
                        }
                    }
                }
                str = b.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return hm;
    }
    public double similarity(HashMap<String,Integer> hm1,HashMap<String,Integer> hm2) {
        double frequencyvector1 = 0,frequencyvector2 = 0;
        double similarity;
        int dotproduct = 0;
        
        for(int i:hm1.values()) {
            frequencyvector1 = frequencyvector1 + Math.pow(i,2);
        }
        frequencyvector1 = Math.sqrt(frequencyvector1);
        

        for(int i:hm2.values()) {
            frequencyvector2 = frequencyvector2 + Math.pow(i,2);
        }
        frequencyvector2 = Math.sqrt(frequencyvector2);
        


        for(String i: hm1.keySet()) {
            if(hm2.containsKey(i)) {
                dotproduct = dotproduct + hm1.get(i) * hm2.get(i);
            }
        }
        similarity = dotproduct/(frequencyvector2*frequencyvector1);
        return similarity;
    }   
}
class solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String foldername;
        try{
            foldername = sc.nextLine();
        }catch(Exception e){
            System.out.println("empty directory");
            return;
        }
        File dir = new File(foldername);
        File[] filearray = dir.listFiles();
        HashMap[] hashmaparray = new HashMap[filearray.length];
        plagiarism p = new plagiarism();
        int temp = 0;
        long[][] result = new long[filearray.length][filearray.length];
        for(File print:filearray) {
            hashmaparray[temp] = p.map(print);
            temp++;
        }
        for(int i = 0;i<filearray.length;i++){
            for(int j = 0; j< filearray.length;j++){
                result[i][j] = Math.round(p.similarity(hashmaparray[i],hashmaparray[j])*100);
            }
        }
        System.out.print("\t\t");
        for(int i = 0; i< filearray.length;i++) {
            System.out.print(filearray[i].toString().split("\\\\")[1]+"\t");
        }
        System.out.println();
        for(int i = 0; i < filearray.length;i++) {
            System.out.print(filearray[i].toString().split("\\\\")[1]+"\t");
            for(int j = 0; j < filearray.length; j++) {
                System.out.print(result[i][j]+"\t\t");
            }
            System.out.println();
        }
    } 
}