package chapter3;
/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main (String arg[]){
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
            System.out.println(message);

    }
}
