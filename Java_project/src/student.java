import java.util.Scanner;

public class student {
    private static int amount_questions = 10;
    private static String username;
    private static String teacher_name;
    private static int addition_right;
    private static int subtraction_right;
    private static int multiplication_right;
    private static int division_right;
    private static int correct;
    private static boolean ans_correct;

    student(){
        username = "";
        teacher_name = "";
        addition_right = 0;
        subtraction_right = 0;
        multiplication_right = 0;
        division_right = 0;
    }
    
    // input for stings
    public String user_input_string() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }
    
    // allows for user input for the stings
    public void setTeacher_name() {
        // need to get the name from the user
        System.out.print("Enter your Teacher's name: ");
        String userInput = user_input_string();
        student.teacher_name = userInput;
    }
    
    public void setUsername() {
        // need to get the name from the user and set it
        System.out.print("Enter your name: ");
        String userInput = user_input_string();
        student.username = userInput;
    }

    // incimenting the number of right
    private void addition_right_inc( ) {
        student.addition_right ++;
    }

    private void division_right_inc() {
        student.division_right ++;
    }
    private void multiplication_right_inc() {
        student.multiplication_right ++;
    }
    private void subtraction_right_inc() {
        student.subtraction_right ++;
    }

    // a bunch of get commands probally dont need all of them
    public int getAddition_right() {
        return addition_right;
    }
    public int getCorrect() {
        return correct;
    }
    public int getDivision_right() {
        return division_right;
    }
    public int getMultiplication_right() {
        return multiplication_right;
    }
    public int getSubtraction_right() {
        return subtraction_right;
    }
    public String getTeacher_name() {
        return teacher_name;
    }
    public String getUsername() {
        return username;
    }

    // need a function that tells how well the user did
    private void print_score(){
        System.out.println();

        System.out.println("------------------- Addition score ------------------");
        System.out.printf("%d correct out of 10 \n", addition_right);

        System.out.println("----------------- Subtraction score -----------------");
        System.out.printf("%d correct out of 10\n", subtraction_right);

        System.out.println("--------------- Multiplication score ----------------");
        System.out.printf("%d correct out of 10\n", multiplication_right);

        System.out.println("------------------ Division score -------------------");
        System.out.printf("%d correct out of 10\n", division_right);

        int total_score = student.addition_right + student.subtraction_right + student.multiplication_right + student.division_right;
        System.out.println("-------------------- Total score --------------------");
        System.out.printf("%d correct out of 40", total_score);

        double total_percentage = ((double) total_score / 40) * 100;
        System.out.println("-------------- The score in percentage --------------");
        System.out.printf("%.2f %% \n", total_percentage);
        System.out.println();
    }
      
    public void do_math(){
        // can double loop this to inciment through, but keeping it this way. Although the other is more compact this is easier to follow 
        
        // get the user's name
        setUsername();
        // get the user's teacher name
        setTeacher_name();
        
        // can add a grettings (not implimented)

        //math test for addition
        System.out.println("------------------- Addition ------------------");
        for (int i = 0; i < amount_questions; i++){
            ans_correct = math.add_sub_multi(1);
            if (ans_correct){
                addition_right_inc();
                correct ++;
            }
        }

        //math test for subtraction
        System.out.println("----------------- Subtraction -----------------");
        for (int i = 0; i < amount_questions; i++){
            ans_correct = math.add_sub_multi(2);
            if (ans_correct){
                subtraction_right_inc();
                correct ++;
            }
        }

        //math test for multiplication
        System.out.println("--------------- Multiplication ----------------");
        for (int i = 0; i < amount_questions; i++){
            ans_correct = math.add_sub_multi(3);
            if (ans_correct){
                multiplication_right_inc();
                correct ++;
            }
        }
        //math test for division
        System.out.println("------------------ Division -------------------");
        for (int i = 0; i < amount_questions; i++){
            ans_correct = math.div();
            if (ans_correct){
                division_right_inc();
                correct ++;
            }
        }

        print_score();

    }

}
