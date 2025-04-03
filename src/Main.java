package src;

import java.util.Scanner;

import src.inputValidation.InputValidation;

public class Main {
  public static void main(String[] args){
    Event JNwJ = new Event("Jazz Night with Joe", 10.5, 3, true);
    Event YRC = new Event("Youtube Rock Concert", 25.25, 0, true);
    Event MCM = new Event("Mozart Chamber Music", 50, 2, false);
    Event HPC = new Event("Harry Potter Concert", 100, 0, false);
    Event[] eventArray = {JNwJ, YRC, MCM, HPC};
    EventRepository repository = new EventRepository(eventArray);

    System.out.println();
    welcomeMessage();
    menuSelection(repository);

    /*
      
      To-Do: Once EventRepository is setup, fixup menuSelection and any other methods so that they do not require the param "Event[] eventArray"
             Do the same for the Scanner object, tyvm

    */
  }

  public static void welcomeMessage(){
    // Welcoming user to the "Super Event" ticketing system
    System.out.println("===============================================");
    System.out.println("Welcome to Super Event!");
    System.out.println("===============================================");
  }

  public static void menuSelection(EventRepository repository){
  // Create a Scanner
  Scanner input = new Scanner(System.in);

  // Prompting user to select an option
  System.out.println("\nChoose an option:\n");

  System.out.println("1. List all events");
  System.out.println("2. Book a ticket");
  System.out.println("3. View my booking");
  System.out.println("4. Remove an event from the booking");
  System.out.println("5. Checkout");
  System.out.println("6. Quit");

  // Validate the user input 
  int number = InputValidation.validatingMenuInput(input, 6);
  
  //Switch-Statements to divert user to relevant menu selection they entered
  switch(number){
    case 1:
      concertList(repository);
      break;
    case 2:
      bookTicket(repository);
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

  input.close();
}

  public static void concertList(EventRepository repository){
    /* 
      Basic QOL improvement, if-statement to display different messages depending
      on whether or not there are events 
    */
    //Temporary variable, will need to turn this into a loop to check number of events
    int eventsNum = Event.getEventCount();
    String eventOnlineAvailability;
    String seatPlural;

    Event[] eventArray = new Event[eventsNum];
    eventArray = repository.getAll();

    if(eventsNum > 0){
      System.out.println("\nThe current events are: ");

      /*
        for-Loop to iterate through array of events to list them all in a preformatted print
        For now, we'll just hardcode a single print TBC later
      */

      for(int i = 0; i < eventsNum; i++){
        if(eventArray[i].onlineOrNot() == true){
          eventOnlineAvailability = "Online Available";
        }
        else{
          eventOnlineAvailability = "No online";
        }

        if(eventArray[i].getSeats() == 1){
          seatPlural = " seat";
        }
        else{
          seatPlural = " seats";
        }

        System.out.print((i + 1) + ". " +  eventArray[i].getName() + "\t|\t");
        System.out.printf("$%.2f" ,eventArray[i].getPrice());
        System.out.print("\t|\t" + eventArray[i].getSeats() + seatPlural + "\t|\t" +  eventOnlineAvailability);
        System.out.println();
      }
    }
    else{
      System.out.println("\nSorry, there are currently no upcoming events!");
    }

    //Call menuSelection(); after calling events (whether or not there are events) with linebreaks
    System.out.println("\n");
    menuSelection(repository);
  }

  public static void bookTicket(EventRepository repository){
    Scanner scan  = new Scanner(System.in);

    //Initially prompt user to enter a keyword, which is stored in a String called keywordInput
    System.out.print("\nEnter a keyword: ");
    String keyword = scan.next();

    SearchClass searchTerm = new SearchClass(repository);
    Event[] matchedSearches = searchTerm.search(keyword);

    displaySearch matchedEvents = new displaySearch(matchedSearches);
    matchedEvents.DisplayAllMatchedEvents(scan, repository);

    int listLength = matchedSearches.length + 1;

    int selectedInput = InputValidation.validatingMenuInput(scan, (listLength));

    if(selectedInput == listLength){
      Main.menuSelection(repository);
    }
    else{
      
    }

    scan.close();
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
