package chapter2;

import java.util.Scanner;

public class ClassWork {
    public static void main (String arg []){

        //1. Best season of the year
        System.out.println("Enter your best season in the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. A whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. An Adjective
        System.out.println("Enter an Adjective");
        String adjective = scanner.next();
        scanner.close();

        //3. Print out the statement "On a [adjective] [season of the year] day, I drink a minimum of [whole number]
        // cups of coffee.""
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
