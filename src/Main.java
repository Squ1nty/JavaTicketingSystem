package src;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Welcoming user to the "Super Event" ticketing system
    System.out.println("===============================================");
    System.out.println("Welcome to Super Event!");
    System.out.println("===============================================");

    // Prompting user to select an option
    System.out.println("Choose an option:");

    System.out.println("1. List all events");
    System.out.println("2. Book a ticket");
    System.out.println("3. View my booking");
    System.out.println("4. Remove an event from the booking");
    System.out.println("5. Checkout");
    System.out.println("6. Quit");

    System.out.print("Please enter a number to proceed: ");

    int userChoice = input.nextInt();
    // System.out.println(userChoice); Checking if code works so far
  }
}
