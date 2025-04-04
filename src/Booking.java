package src;

public class Booking{
  
  private int ticketCount;
  private boolean isOnline;
  private Event selectedEvent;
  private double ticketPrice;

  public Booking(){}
  public Booking(Event selectedEvent, int ticketCount, boolean isOnline, double ticketPrice){
    this.selectedEvent = selectedEvent;
    this.ticketCount = ticketCount;
    this.isOnline = isOnline;
    this.ticketPrice = ticketPrice;
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

  public double getTicketPrice(){
    return ticketPrice;
  }
}
