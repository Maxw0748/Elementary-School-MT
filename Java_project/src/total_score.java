public class total_score {
    private static int amt_stud = 100; //<--------------------- Change this for amount of students tested
    private static int total_correct = 0;
    private static int amount_student = 0;
    private static int[] add_correct = new int[ amt_stud ];
    private static int[] sub_correct = new int[ amt_stud ];
    private static int[] mult_correct = new int[ amt_stud ];
    private static int[] div_correct = new int[ amt_stud ];

    
    private static String[] students_name = new String[ amt_stud ];
    private static String[] teachers_name = new String[ amt_stud ];

    // With this we add the amount correct in each section
    public void add_add_correct(int number){
        add_correct[amount_student] = number;
    }
    
    public void add_sub_correct(int number){
        sub_correct[amount_student] = number;
    }
    
    public void add_mult_correct(int number){
        mult_correct[amount_student] = number;
    }

    public void add_div_correct(int number){
        div_correct[amount_student] = number;
    }
    
    
    // add the astudents and their teachers names
    public void add_students_name(String name){
        students_name[amount_student] = name;
    }
    
    public void add_teachers_name(String name){
        teachers_name[amount_student] = name;
    }

    // incriment the total amount of stuednnts and total score
    public void add_total_correct(int number){
        total_correct += number;
    }

    public static void inciment_amount_student(){
        amount_student ++;
    }

    
    // printing the final score of all the students
    public static void print_final(){
        System.out.printf("The ammount of student that took this test is : %d \n", amount_student);
        System.out.printf("With an average score of %.2f out of 40 questions \n", (double)total_correct/(double)amount_student) ;
        System.out.printf("With an average percentage of %.2f %% \n", (double)total_correct/((double)amount_student * 40) * 100)  ;
    }

    // printing the individual score of every student
    public static void print_detail(){
        for (int i = 0; i < amount_student; i++){
            System.out.println("--------------------------------------------");
            System.out.println(students_name[i] + " with teacher " + teachers_name[i]);
            System.out.println("Addition correct: " + add_correct[i]);
            System.out.println("Subtraction correct: " + sub_correct[i]);
            System.out.println("Division correct: " + mult_correct[i]);
            System.out.println("Multiplication correct: " + div_correct[i]);
            System.out.println();


        }
    }
}   
