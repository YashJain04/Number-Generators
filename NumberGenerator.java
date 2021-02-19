// Number Generator Using Java
// Author: Yash Jain
// Date: 2021-02-19

import java.util.Scanner; // imports

public class NumberGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); // scanner

        // declaring variable
        boolean repeatProgram = true;

        while (repeatProgram == true) {

            // declaring variables
            boolean checkUserInput = true;
            int num1 = 0;
            int num2 = 0;

            while (checkUserInput == true) { // keep repeating input until the user has entered valid numbers

                System.out.println("From which number do you want to start generating numbers? (Integer Values Only)");
                num1 = sc.nextInt();
    
                System.out.println("\n" + "To which number do you want to stop generating numbers? (Integer Values Only)");
                num2 = sc.nextInt();
    
                if (num1 == num2)
                System.err.println("\n" + "Please have different numbers!!" + "\n");
    
                else if (num2 < num1)
                System.err.println("\n" + "Have the starting number lower than the ending number!!" + "\n");
    
                else
                checkUserInput = false;
            } // end while loop
    
            System.out.println("\n" + "Number is generating...");
    
            /*
            Generating Number Logic:
            - Create a new integer called "generatedNumber" which is the place holder for the desired number
            - Use "(int)(Math.random() * (num2 - num1 + 1) + num1)" because "Math.random()" uses "double" values
            - "num2" represents the max value numbers can be generated too
            - "num1" represents the min value numbers start generating from
            - " + 1" is added so that the number 0 is not generated
            - minimum value is inclusive
            - maximum value is inclusive
            */
    
            int generatedNumber = (int)(Math.random() * (num2 - num1 + 1) + num1);
    
            System.out.println("\n" + "Your generated number = " + generatedNumber); // print number
            
            // ask user if they want to repeat program
            System.out.println("\n" + "Would you like to repeat the program?" + "\n" + "Enter \"Yes\" or \"Y\" to repeat program. Any other input to termiante the program.");
            String repeat = sc.next();

            // if user wants to repeat program - repoeat the program
            if (repeat.equalsIgnoreCase("Yes") || repeat.equalsIgnoreCase("Y")) {
                repeatProgram = true;
                System.out.println("");
            }
        
            // if user does not want to repeat program - terminate the program
            else {
                repeatProgram = false;
                System.out.println("\n" + "The program has been terminated.");
            }

        } // end while loop

        sc.close(); // close input

    } // main
} // class