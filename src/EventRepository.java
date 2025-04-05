package src;

import java.util.ArrayList;
import java.util.Scanner;

public class EventRepository extends Manager<Event>{
  private Event[] matchedSearches;
  private int selectedInput;
  private Event[] eventArray;
  private static final Scanner ticketScanner = new Scanner(System.in);
  private static ArrayList<Event> bookingList = new ArrayList<Event>();

  //CONSTRUCTORS
  public EventRepository(){}

  public EventRepository(Event[] eventArray){
    this.eventArray = eventArray;
  }

  public EventRepository(Event[] matchedSearches, int selectedInput){
    this.matchedSearches = matchedSearches;
    this.selectedInput = selectedInput;
  }

  //GENERAL EVENT METHOD/s
  @Override
  public Event[] getAll() {
    return eventArray;
  }

  //BOOKING RELEVANT METHOD/s
  @Override
  public boolean book(Event item, int qty, boolean online) {
    if(bookingList.isEmpty()){
      Booking eventBooking = new Booking(item, qty, online);
      bookingList.add(eventBooking);
      return true;
    }
    else{
      for(int i = 0; i < bookingList.size(); i++){
        if(bookingList.get(i).getName().equals(item.getName())){

        }
        else{

        }
      }
    }
    return false;
  }

  @Override
  public Event[] getBookedItems() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBookedItems'");
  }

  @Override
  public boolean removeBookedItem(Event item) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeBookedItem'");
  }

  public static int ticketAmountSelector(String eventType, Event selectedEvent){
    int ticketCount;
    
    while(true){
      System.out.print("Enter the quantity of tickets: ");
      if(ticketScanner.hasNextInt()){
        ticketCount = ticketScanner.nextInt();
        if(ticketCount <= selectedEvent.getSeats()){
          return ticketCount;
        }
        else{
            System.out.print("Not enough tickets! ");
        }
      }
      else{
        ticketScanner.next();
        System.out.print("Invalid input! ");
      }
    }
  }

  public static int ticketAmountSelector(String eventType){
    int ticketCount;
  
      while(true){
        System.out.print("Enter the quantity of tickets: ");
        if(ticketScanner.hasNextInt()){
          ticketCount = ticketScanner.nextInt();
          return ticketCount;
        }
        else{
          System.out.print("Invalid input! ");
        }
      }
  }

  public static boolean getEventTypeSelection(){
    Scanner scan = new Scanner(System.in);
    String eventTypeSelection;

    while(true){
      System.out.print("Do you want to attend online (y/n): ");
      eventTypeSelection = scan.next();
      if(eventTypeSelection.equals("y")){
        return true;
      }
      else if(eventTypeSelection.equals("n")){
        return false;
      }
    }
  }
}

/*
if(matchedSearches[selectedInput - 1].getSeats() > 0){
  if(matchedSearches[selectedInput - 1].onlineOrNot() == true){
    eventTypeSelection = EventRepository.getEventTypeSelection();
    if(eventTypeSelection == true){
      //Go to ticket method for ONLINE
      ticketCount = EventRepository.ticketAmountSelector("Online");
      break;
    }
    else{
      //Go to ticket method for IRL
      ticketCount = EventRepository.ticketAmountSelector("IRL", matchedSearches[selectedInput - 1]);
      break;
    }
  }
  else{            
    eventTypeSelection = EventRepository.getEventTypeSelection();
    if(eventTypeSelection == true){
      System.out.println("Sorry! There are no online seats available for this event!");
    }
    else{
      //Go to ticket method for IRL
      ticketCount = EventRepository.ticketAmountSelector("IRL", matchedSearches[selectedInput - 1]);
    }                                             
  }
}
else{
  if(matchedSearches[selectedInput - 1].onlineOrNot() == true){
    eventTypeSelection = EventRepository.getEventTypeSelection();
    if(eventTypeSelection == true){
      //Go to ticket method for ONLINE
      ticketCount = EventRepository.ticketAmountSelector("Online");
      break;
    }
    else{
      //Go to ticket method for IRL
      System.out.println("Sorry! This event can only be attended online.");
    }
  }
  else{
    System.out.println("Sorry! There are no seats available for this event!");
  }
}
public static int ticketAmountSelector(String eventType, Event selectedEvent){
  int ticketCount;
  
  while(true){
    System.out.print("Enter the quantity of tickets: ");
    if(ticketScanner.hasNextInt()){
      ticketCount = ticketScanner.nextInt();
      if(ticketCount <= selectedEvent.getSeats()){
        return ticketCount;
      }
      else{
          System.out.print("Not enough tickets! ");
      }
    }
    else{
      ticketScanner.next();
      System.out.print("Invalid input! ");
    }
  }
}

public static int ticketAmountSelector(String eventType){
  int ticketCount;

    while(true){
      System.out.print("Enter the quantity of tickets: ");
      if(ticketScanner.hasNextInt()){
        ticketCount = ticketScanner.nextInt();
        return ticketCount;
      }
      else{
        System.out.print("Invalid input! ");
      }
    }
}
    */