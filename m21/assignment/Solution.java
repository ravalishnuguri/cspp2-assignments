import java.util.Scanner;
class client {
    foodlog[] foodinfo = new foodlog[10];
    int size1=0;
    waterlog[] waterinfo = new waterlog[10];
    int size2=0;
    physhact[] physhactinfo = new physhact[10];
    int size3=0;
    weight[] weightinfo = new weight[10];
    int size4=0;
    sleep[] sleepinfo = new sleep[10];
    int size5=0;
    public void food(String item, int q, String date, String time){
        foodlog f = new foodlog(item, q, date, time);
        foodinfo[size1++] = f;
    }
    public void drinking(int quantity, String time, String date) {
        waterlog w = new waterlog(quantity, time, date);
        waterinfo[size2++] = w;
    }
    public void physical(String name, String stime, String etime, String date){
        physhact a = new physhact(name, stime, etime, date);
        physhactinfo[size3++] = a;
    }
    public void weight(int kg, String fat, String date) {
        weight w =new weight(kg, fat, date);
        weightinfo[size4++] = w;
    }
    public void sleep(String starttime, String endtime, String date) {
        sleep s =new sleep(starttime,endtime, date);
        sleepinfo[size5++] = s;
    }
    public void foodlog() {
        String s1 = "Food\n";
            for(int i = 0; i< size1;i++) {
                s1 += "Date:"+ foodinfo[i].getDate() + "\n" + "Time:" + foodinfo[i].getTime() + "\n" + "Name:" + foodinfo[i].getFooditem() + "\n" + "Quantity:" + foodinfo[i].getQuantity() + "\n";
             System.out.println(s1);
            }
        
    }
    public void waterlog() {
        String s2 = "Water\n";
        for(int i = 0; i< size2;i++) {
            s2 += "Date:"+ waterinfo[i].getdate() + "\n" + "Quantity:" + waterinfo[i].getQuantity() + "\n";
            System.out.println(s2);
        }
    }
    public void sleeplog() {
        String s3 = "Sleep\n";
        for(int i = 0; i< size5;i++) {
            s3 += "Date:" + sleepinfo[i].getDate() + "\n" + "Starttime:" + sleepinfo[i].getdst() + "\n" + "Endtime" + sleepinfo[i].getdet() + "\n";
            System.out.println(s3);
        }
    }
    public void weightlog() {
        String s4 = "Weight\n";
        for(int i = 0; i< size4;i++) {
            s4 += "Weight" + "\n" +"Date:" + weightinfo[i].getDate() + "\n" + "Weight:" + weightinfo[i].getWeight() + "\n" + "Fat:" + weightinfo[i].getFat() + "\n";
            System.out.println(s4);
        }
    }
    public void activitylog() {
        String s5 = "Activities\n";
        for(int i = 0; i< size3;i++) {
            s5 += "PhysicalActivity\n" + "name:" + physhactinfo[i].getActname() + "\n" + "Date:"+ physhactinfo[i].getdate() + "\n"
            + "Starttime:" + physhactinfo[i].getStart() + "\n" + "Endtime:" + physhactinfo[i].getEnd() + "\n";
            System.out.println(s5);
        }
    }

    public void print() {
        String a1 = "";
        String a2 = "";
        String a3 = "";
        String a4 = "";
        String a5 = "";
        for(int i = 0; i< size1;i++) {
            // System.out.println(foodinfo[i].getfoodname()+" "+foodinfo[i].getquantity()+" "+foodinfo[i].gettime());
            a1 += "Food\n" + "Date:"+ foodinfo[i].getDate() + "\n" + "Time:" + foodinfo[i].getTime() + "\n" + "Name:" + foodinfo[i].getFooditem() + "\n" + "Quantity:" + foodinfo[i].getQuantity() + "\n";
             System.out.println(a1);
        }
        for(int i = 0; i< size2;i++) {
            // System.out.println(waterinfo[i].getwaterquantity());
            a2 += "Water\n" + "Date:"+ waterinfo[i].getdate() + "\n" + "Quantity:" + waterinfo[i].getQuantity() + "\n";
            System.out.println(a2);
        }
        for(int i = 0; i< size3;i++) {
            // System.out.println(activityinfo[i].getactivity_name()+" "+activityinfo[i].getstarttime()+" "+activityinfo[i].getendtime()+" "+activityinfo[i].getdate());
            a3 += "PhysicalActivity\n" + "name:" + physhactinfo[i].getActname() + "\n" + "Date:"+ physhactinfo[i].getdate() + "\n"
            + "Starttime:" + physhactinfo[i].getStart() + "\n" + "Endtime:" + physhactinfo[i].getEnd() + "\n";
            System.out.println(a3);
        }
        for(int i = 0; i< size4;i++) {
            // System.out.println(weightinfo[i].getweight()+" "+weightinfo[i].getfat()+" "+weightinfo[i].getdate());
            a4 += "Weight" + "\n" +"Date:" + weightinfo[i].getDate() + "\n" + "Weight:" + weightinfo[i].getWeight() + "\n" + "Fat:" + weightinfo[i].getFat() + "\n";
            System.out.println(a4);
        }
        for(int i = 0; i< size5;i++) {
            // System.out.println(sleepinfo[i].getdatestime()+" "+sleepinfo[i].getdateetime());
            a5 += "Sleep" + "\n" + "Date:" + sleepinfo[i].getDate() + "\n" + "Starttime:" + sleepinfo[i].getdst() + "\n" + "Endtime" + sleepinfo[i].getdet() + "\n";
            System.out.println(a5);
        }
    }

 }
public class Solution {
    private Solution() { }
    public static void main(String[] args) {
        client p = new client();
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // foodlog fl = new foodlog();
        // waterlog wl = new waterlog();
        // physhact pa = new physhact();
        // sleep sl = new sleep();
        // weight we = new weight();
        // while (s.hasNext()) {
        //     // read the line
        //     String line = s.nextLine();
        //      // split the line using space
        //     String[] tokens = line.split(" ");
        //     switch (tokens[0]) {
        //         case "Food":
        //         fl.foodlog(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
        //         break;
        //         case "Water":
        //         waterlog(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
        //         break;
        //         case "PhysicalActivity":
        //         physhact(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
        //         break;
        //         case "Sleep":
        //         sleep(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
        //         break;
        //         case "Weight":
        //         weight(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
        //         break;
        //         case "Summary":
        //         System.out.println("****Activities for " + tokens[1] + "****");
        //         break;
        //     }
        // }
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tokens = line.split(" ",2);
            switch(tokens[0]){
                case "food":
                String[] info = tokens[1].split(",");
                p.food(info[0], Integer.parseInt(info[1]), info[2], info[3]);
                break;
                case "water":
                String[] in = tokens[1].split(",");
                p.drinking(Integer.parseInt(in[0]), in[1], in[2]);
                break;
                case "physicalactivity":
                String[] arr = tokens[1].split(",");
                p.physical(arr[0], arr[1], arr[2], arr[3]);
                break;
                case "weight":
                String[] we = tokens[1].split(",");
                p.weight(Integer.parseInt(we[0]), we[1],we[2]);
                break;
                case "sleep":
                String[] sl = tokens[1].split(",");
                p.sleep(sl[0],sl[1], sl[2]);
                break;
                case "summary":
                p.print();
                break;
                case "foodlog":
                p.foodlog();
                break;
                case "waterlog":
                p.waterlog();
                break;
                case "weightlog":
                p.weightlog();
                break;
                case "activitylog":
                p.activitylog();
                break;
                case "sleeplog":
                p.sleeplog();
                break;
            }
        }
    }
}




class sleep {
    private String dst;
    private String det;
    private String date;
    sleep() {

    }
    sleep(String dst1, String det1, String date1) {
        this.dst = dst1;
        this.dst = det1;
        this.date = date1;
    }

    public String getdst() {
        return dst;
    }
    public  String getDate() {
        return date;
    }

    public String getdet() {
        return det;
    }

    // public String hoursSlept() {
    //  String s="";
    //  s += "Sleep --- slept form " +  getdet() + "to" + getdet();
    //  return s;

    // }
}

class physhact {
    private String actname;
    private String start;
    private String end;
    private String date;
    // private String note;
    physhact() {

    }
    physhact(String actname1, String start1, String end1, String date1) {
        this.start = start1;
        this.end = end1;
        this.actname = actname1;
        this.date = date1;
        // this.note = note1;
    }
    public String getActname() {
        return this.actname;
    }
    public String getStart() {
        return this.start;
    }
    public String getEnd() {
        return this.end;
    }
    public String getdate() {
        return this.date;
    }
    // public String getNote() {
    //  return this.note;
    // }
}
class weight {
    private double weight;
    private String date;
    private String fat;
    weight() {
        
    }
    weight(double weight1, String fat1, String date1) {
        this.weight = weight1;
        this.date = date1;
        this.fat = fat1;

    }
    public double getWeight() {
        return this.weight;
    }
    public String getFat() {
        return this.fat;
    }
    public String getDate() {
        return this.date;
    }
    // public String WeightString() {
    //  String w = "";
    //  w += "Weight --- " + getWeight() + "kgs****" + getFat() + "%\n";
    //  return w;
    // }
}


class foodlog {
    private String fooditem;
    private double quantity;
    private String date;
    private String time;
    foodlog() {

    }
    foodlog(String fooditem1, int quantity1, String date1, String time1) {
        this.fooditem = fooditem1;
        this.quantity = quantity1;
        this.date = date1;
        this.time = time1;
    }
    public String getFooditem() {
        return this.fooditem;
    }
    public double getQuantity() {
        return this.quantity;
    }
    public String getDate() {
        return this.date;
    }
    public String getTime() {
        return this.time;
    }
    // public String toString() {
    //  String s = "";
    //  s += "Food for the day --- " + getFooditem() + "**" + getQuantity() + "gms** eaten at " + getDate() + "\n" + "****" + "\n";
    //  return s;
    // }
}

class waterlog {
    private double quantity;
    private String date;
    private String time;
    waterlog() {

    }
    waterlog(double quantity1, String date1, String time1) {
        this.quantity = quantity1;
        this.date = date1;
        this.time  = time1;
    }
    public double getQuantity() {
        return this.quantity;
    }
    public String getdate() {
        return this.date;
    }
    public String gettime() {
        return this.time;
    }
    // public String waterString() {
    //  String k = "";
    //  k += "Water consumed --- total = " 
    //  return k;
    // }
}