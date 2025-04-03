package src;

public class EventRepository extends Manager{
  private Event[] eventArray;

  public EventRepository(Event[] eventArray){
    this.eventArray = eventArray;
  }

  public EventRepository(){}

  @Override
  public Event[] getAll() {
    return eventArray;
  }

  public String eventChecks(Event[] matchedSearches){
    return "";
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
