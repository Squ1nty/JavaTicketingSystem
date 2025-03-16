package src;

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
    int number = validatingMenuInput(input);
    
    //Switch-Statements to divert user to relevant menu selection they entered
    switch(number){
      case 1:
        concertList();
        break;
      case 2:

        break;
      case 3:

        break;
      case 4:

        break;
      case 5:

        break;
      case 6:

        break;
      //No default case since numbers are already checked to be of an integer value from 1 - 6
    }

    // Just testing if it works
    System.out.println("\nThe number you entered was " + number);
  }

  public static int validatingMenuInput(Scanner input){
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

  public static void concertList(){
    /* 
      Basic QOL improvement, if-statement to display different messages depending
      on whether or not there are events 
    */
    //Temporary variable, will need to turn this into a loop to check number of events
    int eventsNum = 2;

    if(eventsNum > 0){
      System.out.println("\nThe current events are: ");

      /*
        for-Loop to iterate through array/ arraylist of events to list them all in a preformatted print
        For now, we'll just hardcode a single print TBC later
      */

      for(int i = 1; i <= eventsNum; i++){
        System.out.println(i + ". [eventName] |  $[eventPrice]  |  [seatsAvailable] seats  |  [onlineAvailability]");
      }
    }
    else{
      System.out.println("\nSorry, there are currently no upcoming events!");
    }

    //Call menuSelection(); after calling events (whether or not there are events) with linebreaks
    System.out.println("\n\n\n");
    menuSelection();
  }
}
