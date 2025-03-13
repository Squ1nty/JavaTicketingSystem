package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    menuSelection();
  }

  public static void menuSelection(){
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

    // Validate the user input
    int number = validatingInput(input);
    input.close();

    // Just testing if it works
    System.out.println("The number you entered was " + number);
    
  }

  public static int validatingInput(Scanner input){
    // Initialise number to have a value stored and eventually returned
    int selectedNumber;

    // While loop that keeps running until user quits (6)
    while(true){
      System.out.print("Please enter a whole number from 1 - 6: ");
      // Checks if user input is of a (int) type or not
      if(input.hasNextInt()){
        selectedNumber = input.nextInt();
        // If of int type, then a check is ran to see if input is from 1 to 6
        if(selectedNumber >= 1 && selectedNumber <= 6){
          return selectedNumber;
        }
        else{
          System.out.println("Error. Input entered was not a whole number from 1 - 6.");
        }
      }
      else{
        System.out.println("Error. Input entered was not a whole number.");
        input.next();
      }
    }
  }
}
