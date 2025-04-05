package src;

public class Booking extends Event{
  
  private int ticketCount;
  private boolean isOnline;
  private Event selectedEvent;

  public Booking(){}
  public Booking(Event selectedEvent, int ticketCount, boolean isOnline){
    this.selectedEvent = selectedEvent;
    this.ticketCount = ticketCount;
    this.isOnline = isOnline;
  }

  public Event getSelectedEvent(){
    return selectedEvent;
  }

  public int getTicketCount(){
    return ticketCount;
  }

  public boolean onlineOrNot(){
    return isOnline;
  }
}
