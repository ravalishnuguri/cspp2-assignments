import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        String[] input = new String[30];
        int count = 0;
        for (int i = 0; i < questionCount; i++) {
            input = s.nextLine().split(":");
            count++;
            // System.out.println(input[1]);
        }
        // System.out.println(input[1]);
        String[] in = new String[30];
        // int m = input.length();
        // for (int j = 0; j< ;j++) {
        //     String[] inp = s.nextLine().split(",");
        //     // System.out.println(in[0]);
        // }
        if (questionCount == 0 ) {
            System.out.println("Quiz does not have questions");
        } else if (questionCount == 1) {
                System.out.println("Error! Malformed question");
        }
        else {
            System.out.println(questionCount + " are added to the quiz");
        }
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}


/**
 * Class for quiz.
 */
class Quiz {
    private String[] question;
    private String[] choice;
    private int[] penalty;
    private int[] points;
    private int[] maxmarks;
    /**
     * Constructs the object.
     */
    Quiz() { }
    /**
     * Constructs the object.
     *
     * @param      question  The question
     * @param      choice    The choice
     * @param      penalty   The penalty
     * @param      points    The points
     * @param      maxmarks  The maxmarks
     */
    Quiz(final String[] question, final String[] choice, final int[] penalty, final int[] points, final int[] maxmarks) {
        this.question = question;
        this.choice = choice;
        this.penalty = penalty;
        this.points = points;
        this.maxmarks = maxmarks; 
    }

}