public class App {
    // ----------------------------------------------------------------------------//
    // NOTE THIS ONLY WORK UP TO 100 STUDENTS TO CHANGE THIS WE NEED TO CHANGE:    //
    // amt_stud in total_score                                                     //
    // ----------------------------------------------------------------------------//

    static void formatting(){
        // added to format the command line,
        // not needed but cuts down on the amount of cut and paste
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
    }
    public static void main(String[] args) throws Exception {
        // Scanner to get user input
        //Scanner scan = new Scanner(System.in);
        int math_level = 0;
        int temp_number = 0;
        String temp_name = "";
        // First need to get an input from the user.
        // need to loop till we get the input to start

        formatting();
        System.out.println("Math program");
        formatting();

        // need a way to stack how students are doing

        total_score testscore = new total_score();

        while(math_level <= 1){
            System.out.println("Please enter number corresponding to the following");
            System.out.println("1: Math Test");
            System.out.println("2: Stop program");


            // get number from the user:
            // error message if it is not a number1
            math_level = (int) math.get_user_number();
            if (math_level == 1) {
                // if the chose to take the test then we go to the finction that takes the test
                // menu works so need to keep going with it
                student curr_student  = new student();
                curr_student.do_math();
                

                // after they take the test we want the amount of correct answers to be added to the score class.
                temp_number = curr_student.getAddition_right();
                testscore.add_add_correct(temp_number);
                
                temp_number = curr_student.getSubtraction_right();
                testscore.add_sub_correct(temp_number);
                
                temp_number = curr_student.getMultiplication_right();
                testscore.add_mult_correct(temp_number);

                temp_number = curr_student.getDivision_right();
                testscore.add_div_correct(temp_number);

                // adding student and teachers name
                temp_name = curr_student.getUsername();
                testscore.add_students_name(temp_name);
                
                temp_name = curr_student.getTeacher_name();
                testscore.add_teachers_name(temp_name);

                temp_number = curr_student.getCorrect();
                testscore.add_total_correct(temp_number);

                // inciment the amount of students that taken the test
                total_score.inciment_amount_student();
            }

            if (math_level == 2) {                
                formatting();
                total_score.print_final();
                formatting();
                System.out.println("1: Detail score ");
                System.out.println("Any other number to exit");

                math_level = (int) math.get_user_number();
                if (math_level == 1){
                    total_score.print_detail();
                } else {
                    break;
                }
                break;
            }
        }
    }
}
