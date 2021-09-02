package chapter3;

import java.util.Scanner;

public class ClassWork {

    public static void main (String arg[]){
        System.out.println("Enter the quantity of Pennies:");
        Scanner scanner = new Scanner(System.in);
        double pennie = scanner.nextDouble();

        System.out.println("Enter the quantity of Nikels:");
        double nikel = scanner.nextDouble();

        System.out.println("Enter the quantity of Dimes:");
        double dime = scanner.nextDouble();


        System.out.println("Enter the quantity of Quarters:");
        double quarter = scanner.nextDouble();
        scanner.close();

        int expectedAmount = 1;
        double totalAmount = pennie + nikel + dime + quarter;
        double lossingTotal = totalAmount - expectedAmount;

        if (totalAmount == expectedAmount){
                System.out.println("You win!");
        }else if ( totalAmount > expectedAmount){
            System.out.println("You have more than the required amount to win by: " + lossingTotal);
        } else {
            System.out.println("You have less than the required amount to win by: " + lossingTotal);

        }


    }
}
