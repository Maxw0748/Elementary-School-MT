import java.util.Random;
import java.util.Scanner;

public class math {
    static boolean add_sub_multi(int math_level){

        Random rand = new Random();

        // need two random number for the math numbers
        
        int rand1 = rand.nextInt(10);
        int rand2 = rand.nextInt(10);
        double answer = 0;
        double user_answer;
        
        // genreationg t
        if (math_level == 1){
            // if addition do this
            answer = rand1 + rand2;
            System.out.print(rand1 + " + " + rand2 + " = ");
        } else if (math_level == 2) {
            answer = rand1 - rand2;
            System.out.print(rand1 + " - " + rand2 + " = ");
        } else if (math_level == 3) {
            answer = rand1 * rand2;
            System.out.print(rand1 + " * " + rand2 + " = ");
        } else {
            System.out.println("Input otehr then 1-3 was entered check code, please!. in math.add_sub_multi rn");
        }
        // need to get the user number
        // need to make sure the user gives a number--------------------------------------------------------------------------
        user_answer = get_user_number();

        if (user_answer == answer){
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("The right answer was " + (int) answer);
            return false;
        }

    }
    
    static boolean div(){
        Random rand = new Random();
        // generate two numbers to get a product and quotient
        // this is so that we dont get a remender
        int rand1;
        int answer;
        int product;
        double user_answer;
        // loop till till user prompts to stop
        // Need to make sure that 0 is not at the bottom
        rand1 = rand.nextInt(11) + 1;
        answer = rand.nextInt(11) + 1;   
        
        // To get division that is has no remainer
        // we use the product as the first number in the equation
        // answer and rand1 can be interchanged, named in a way so that it is easier to follow along
        product = rand1 * answer;
        System.out.print(product + " / " + rand1 + " = ");
        
        // Get user responce
        user_answer = get_user_number();
        if (user_answer == answer){
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("The right answer was " + (int) answer);
            return false;
        }
    }

    static double get_user_number(){
        // can change the code so that we are only using int
        // the reason it is double is for later iterations we can add decimals
        // might have this come in as a string and cast as int or double as needed 
        Scanner scan = new Scanner(System.in);
        double user_number;
        String user_number_string = scan.nextLine();
        try {
            user_number = Double.parseDouble(user_number_string);
        } catch (Exception e) {
            // using recursion until we get the right number
            System.out.println("Please enter a number for the responce:");
            user_number = get_user_number();
        }
        return user_number;
    }
}
