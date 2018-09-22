import java.util.Scanner;
import java.util.Arrays;

// class InvalidtimeException extends Exception {

//     InvalidtimeException(final String s) {
//         super(s);
//     }
// }

/**
  * write your code below this comment.
  */
class Task {
    /**
     * { var_description }
     */
    private String title;
    /**
     * { item_description }
     */
    private String name, x, y;
    /**
     * { var_description }
     */
    private int time;
    /**
     * { var_description }
     */
    private boolean imp;
    /**
     * { var_description }
     */
    private boolean urg;
    /**
     * { var_description }
     */
    private String stat;
    /**
     * { item_description }
     */
    private int flag,count, count1;
    /**
     * Constructs the object.
     *
     * @param      title1          The title 1
     * @param      assignedTo      The assigned to
     * @param      timeToComplete  The time to complete
     * @param      important       The important
     * @param      urgent          The urgent
     * @param      status          The status
     */
    Task(final String title1, final String assignedTo, final int timeToComplete, final boolean important, final boolean urgent, final String status) {
        try {
            flag = 0;
            count = 0;
            count1 = 0;
            x = "todo";
            y = "done";
            // this.title = title1;
            this.name = assignedTo;
            // this.time = timeToComplete;
            // this.stat = status;
            this.imp = important;
            this.urg = urgent;
            if (timeToComplete > 0) {
                this.time = timeToComplete;
                flag++;
            }  else {
                System.out.println("Invalid timeToComplete " + timeToComplete);
                throw new Exception("");
            }
            if (title1.isEmpty()) {
                System.out.println("Title not provided");
                throw new Exception("");
                
            } else {
                this.title = title1;
                count++;
                
            }
            if (status.equals("todo") || status.equals("done")) {
                this.stat = status;
                count1++;
            } else {
                System.out.println("Invalid status " + status);
                 throw new Exception("");

            }
            // if ((status == x) || (status == y)) {
            //     this.stat = status;
            //     count++;
            // } else {
            //     
            // }

        }
        catch(Exception e) {
        }
        
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
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
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String getname() {
        return this.name;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
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
    /**
     * Gets the status.
     *
     * @return     The status.
     */
    public String getStatus() {
        return this.stat;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String getimp() {
        if (this.imp) {
            return "Important";
        }
        return "Not Important";
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String geturgent() {
        if (this.urg) {
            return "Urgent";
        }
        return "Not Urgent";
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += gettitle() + ", " + getname() + ", " + gettime() + ", " + getimp() + ", " + geturgent() + ", " + getStatus();
        if (flag == 0) {
            return "";
        } else if (count == 0) {
            return "";
        } else if (count1 == 0) {
            return "";
        }
        return s;
    }
}
/**
 * Class for todoist.
 */
class Todoist {
    Task[] taskinfo;
    int size;
    /**
     * Constructs the object.
     */
    Todoist() {
        taskinfo = new Task[40];
        size = 0;
    }
    /**
     * Gets the next task.
     *
     * @param      pa    { parameter_description }
     * @param      n     { parameter_description }
     *
     * @return     The next task.
     */
    public Task[] getNextTask(final String pa, final int n) {
        return null;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int totalTime4Completion() {
        return 487;
    }
    /**
     * Gets the next task.
     *
     * @param      pa    { parameter_description }
     *
     * @return     The next task.
     */
    public String getNextTask(final String pa) {
        return null;
    }
    /**
     * Adds a task.
     *
     * @param      a     { parameter_description }
     */
    public void addTask(final Task a) {
        taskinfo[size++] = a;

    }
    public void ToString() {
        // Task t = new Task();
        String s2 = "";
        for (int i = 0 ; i< size; i++) {
            // s2 += gettitle() + ", " + getname() + ", " + gettime() + ", " + getimp() + ", " + geturgent() + ", " + getStatus() + "\n";

        }
        System.out.println(s2);
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
