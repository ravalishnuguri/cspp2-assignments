import java.util.Scanner;
import java.util.Arrays;

// class InvalidtimeException extends Exception {

//     InvalidtimeException(final String s) {
//         super(s);
//     }
// }

/**
  * write your code below this comment
  */
class Task {
    String title;
    String name, x, y;
    int time;
    boolean imp;
    boolean urg;
    String stat;
    int flag,count;
    Task(String title1, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
        try {
            flag = 0;
            count = 0;
            x = "todo";
            y = "done";
            // this.title = title1;
            this.name = assignedTo;
            // this.time = timeToComplete;
            this.stat = status;
            this.imp = important;
            this.urg = urgent;
            if (timeToComplete > 0) {
                this.time = timeToComplete;
                flag++;
            }  else {
                System.out.println("Invalid timeToComplete " + timeToComplete);
                throw new Exception("");
            }
            if (title1 != "") {
                this.title = title1;
            } else {
                System.out.println("Title not provided");
                throw new Exception("");
            }
            if ((status == x) || (status == y)) {
                this.stat = status;
                count++;
            } else {
                System.out.println("Invalid status " + status);
                throw new Exception("");
            }

        }
        catch(Exception e) {
        }
        
    }
    public String gettitle() {
        // try {
        //     if (this.title == "") {
        //         System.out.println("Title not provided");
        //         throw new Exception();
        //     } else {
        //         return this.title;
        //     }
        // }
        // catch(Exception e) {
        // }
        return this.title;
         }
    public String getname() {
        return this.name;
    }
    public int gettime() {
    //     try {
    //         if (this.time >= 0) {
    //             return this.time;
    //         } else {
    //             throw new Exception("Invalid timeToComplete " + this.time);
    //         }
    //     }
    //     catch(Exception e){

    //     }
    //     return 0;
    // }
    return this.time;
}
    public String getStatus() {
        // String x = "";
        // try {
        //     if (this.stat == "todo") {
        //           x += this.stat;
        //     } else if(this.stat == "done") {
        //         x += this.stat;
        //     } else {
        //         System.out.println("Invalid status " + this.stat);
        //         throw new Exception();
        //     }
        // }
        // catch(Exception e) {
        // }
        // return x;
        return this.stat;
    }
    public String getimp() {
        if (this.imp) {
            return "Important";
        }
        return "Not Important";
    }
    public String geturgent() {
        if (this.urg) {
            return "Urgent";
        }
        return "Not Urgent";
    }
    public String toString() {
        String s = "";
        s += gettitle() + ", " + getname() + ", " + gettime() + ", " + getimp() + ", " + geturgent() + ", " + getStatus();
        if ((flag == 0) && (count == 0)) {
            return "";
        }
        return s;
    }
}
class Todoist {
    Task[] taskinfo = new Task[10];
    Todoist() {
    }
    public Task[] getNextTask(String pa, int n) {
        return null;
    }
    public String totalTime4Completion() {
        return null;
    }
    public String getNextTask(String pa) {
        return null;
    }
    public void addTask(Task a) {

    }

}
/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
