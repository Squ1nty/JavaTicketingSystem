package src;

public class displaySearch implements DisplayAll{
  
  private Event[] eventArray;
  private String eventOnlineAvailability;
  private String seatPlural;

  public displaySearch(Event[] eventArray){
    this.eventArray = eventArray;
  }

  @Override
  public void DisplayAllEvents(){
    for(int i = 0; i < eventArray.length; i++){
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
}
