/*
17. Online Quiz Application 
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuizApplication {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        int correctAns = 0;
        int incorrectAns = 0;

        System.out.println("\n-----------------------------------");
        System.out.println(" Welcome to Online Quiz Application ");
        System.out.println("-----------------------------------");
        System.out.println("\nAnswer these MCQs and get your score!!");

        // Questions
        String questions[] = {
            "Q1 -> Which method is the starting point of a Java program?",
            "Q2 -> Which keyword is used to create an object in Java?",
            "Q3 -> Which of these is NOT a primitive data type?",
            "Q4 -> Which loop runs at least once?",
            "Q5 -> Which keyword is used to inherit a class in Java?"
        };

        // Options
        String options[] = {
            "1. start()\n2. main()\n3. run()\n4. init()",
            "1. class\n2. object\n3. new\n4. create",
            "1. int\n2. float\n3. String\n4. char",
            "1. for\n2. while\n3. foreach\n4. do-while",
            "1. implement\n2. inherit\n3. extends\n4. super"
        };

        // Correct answers
        int answers[] = {2, 3, 3, 4, 3};

        // Explanations
        String explanations[] = {
            "Explanation: main() is the entry point of a Java program.",
            "Explanation: new keyword is used to create objects in Java.",
            "Explanation: String is a non-primitive (reference) data type.",
            "Explanation: do-while loop runs at least once.",
            "Explanation: extends keyword is used for inheritance."
        };

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (1-4): ");
            int userAns = sc.nextInt();

            switch(userAns){
                case 1:
                case 2:
                case 3:
                case 4:
                    if (userAns == answers[i]){
                        System.out.println("Correct Answer!");
                        correctAns++;
                    } else {
                        System.out.println("Incorrect Answer!");
                        incorrectAns++;
                        System.out.println("Correct option is: " + answers[i]);
                    }
                    System.out.println(explanations[i]);
                    break;

                default:
                    System.out.println("Invalid choice! Question skipped.");
                    incorrectAns++;
                    System.out.println("Correct option is: " + answers[i]);
                    System.out.println(explanations[i]);
            }
        }

        // Final result
        System.out.println("\n------------------------");
        System.out.println(" Quiz Result ");
        System.out.println("------------------------");
        System.out.println("Score : " + correctAns + " / 5");
        System.out.println("Correct Answers : " + correctAns);
        System.out.println("Incorrect Answers : " + incorrectAns);
		System.out.println("\nThank you for using the Online Quiz Application");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		// Close scanner stream
        sc.close();
    }
}
