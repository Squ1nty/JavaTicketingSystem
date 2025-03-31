package src;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    //Create events to be used later
    Event JNwJ = new Event("Jazz Night with Joe", 10.5, 3, true);
    Event YRC = new Event("Youtube Rock Concert", 25.25, 0, true);
    Event MCM = new Event("Mozart Chamber Music", 50, 2, false);
    Event HPC = new Event("Harry Potter Concert", 100, 0, false);

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
        searchFunction(input);
        break;
      case 3:
        viewBooking();
        break;
      case 4:
        removeEvent();
        break;
      case 5:
        checkout();
        break;
      case 6:
        quit();
        break;
      //No default case since numbers are already checked to be of an integer value from 1 - 6
    }
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
          System.out.println("Error. Input entered was not a whole number from 1 - 6.\n");
        }
      }
      else{
        System.out.println("Error. Input entered was not a whole number.\n");
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

  public static void searchFunction(Scanner input){
    //Initially prompt user to enter a keyword, which is stored in a String called keywordInput
    System.out.println("\nEnter a keyword: ");
    String keywordInput = input.next();

    /*
      Before sending it off to be used as a "search term", due to case insensitivity,
      we should run the string through the pre-built toLowerCase String method.
    */

    keywordInput = keywordInput.toLowerCase();
  }

  public static void viewBooking(){
    //Call upon the *TBC* userBooking object to display the contents
  }

  public static void removeEvent(){
    //Once again a call upon the *TBC* userBooking object where it will be simply removed
  }

  public static void checkout(){
    //Call upon the *TBC* userBooking object but more specifically the price, to then provide yes/no
  }

  public static void quit(){
    System.out.print("\nGoodbye!");
    System.exit(0);
  }
}
