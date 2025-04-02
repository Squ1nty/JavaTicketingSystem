package src;

import java.util.Scanner;

public class EventRepository extends Manager{
  private Event[] eventArray;

  public EventRepository(Event[] eventArray){
    this.eventArray = eventArray;
  }

  @Override
  public Event[] getAll() {
    return eventArray;
  }

  @Override
  public boolean book(Object item, int qty, boolean online) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'book'");
  }

  @Override
  public Object[] getBookedItems() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBookedItems'");
  }

  @Override
  public boolean removeBookedItem(Object item) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeBookedItem'");
  }

}
