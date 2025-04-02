package src;

import java.util.Scanner;

public class SearchClass implements Searchable{
  private EventRepository repository;
  private String eventName = "";
  private Scanner stringScanner = new Scanner(eventName);
  
  public SearchClass(EventRepository repository){
    this.repository = repository;
  }

  public Event[] search(String keyword){
    keyword = keyword.toLowerCase(); //Made everything lowercase to adhere to case "insensitivity"

    Event[] eventArray = repository.getAll(); //Obtaining array of current events
    boolean[] keywordMatch = new boolean[eventArray.length];
    String titleSegment;
    int count = 0;

    /*
      Logic: 
        1. We want to iterate through every item in the eventArray (basically we want every event)
        2. We then want to iterate through specifically the title of each event i.e. getName()
          a) This can be done through a while-loop that iterates if scan.hasNext();
        3. With a pre-declared String object i.e. "titleSegment" we can store a scan.next();
        4. We can then compare titleSegment to the pre-defined/passed param "keyword"
          a) If equal, we can assign true to the index[i] of the pre-defined boolean array.
            i. Also, count++;
          b) If not equal, assign false.
        
      Next Part:
        1. Create new array of size "count" and type "Event"
        2. Iterate through the boolean array
        3. For every index that is true, assign newlyCreatedArray[i] = eventArray[i];
          a) *Note* This should basically only leave the events whose titles' match the keyword remaining in the newlyCreatedArray[]
            i. Ok.. so slight logic error, the way it is setup, theres a chance for the above to store the event in an index that doesn't exist, i.e. too high
            ii. Possible solution:
                We create a new counter that is compared to count itself, if lower, stores the new variable based on what it is, if index matches, all done; break out of the loop?
        4. Once done, return the newlyCreatedArray[]
        5. Happy days! Hopefully...
    */

    for(int i = 0; i < eventArray.length; i++){
      eventName = eventArray[i].getName();
      System.out.println(eventName);
      while(stringScanner.hasNext()){
        titleSegment = stringScanner.next();
        titleSegment = titleSegment.replaceAll("\\s+", "").toLowerCase();
        System.out.print(stringScanner.next());
        if(titleSegment == keyword){
          keywordMatch[i] = true;
          count++;
          break;
        }
        else{
          keywordMatch[i] = false;
        }
        System.out.println();
      }
      System.out.println(keywordMatch[i]);
    }

    int countComparison = 0;
    Event[] searchedEvents = new Event[count];
    for(int i = 0; i < keywordMatch.length; i++){
      if(keywordMatch[i] == true){
        if(countComparison < count){
          searchedEvents[countComparison] = eventArray[i];
          countComparison++;
        }
        else{
          break;
        }
      }
    }
    
    return searchedEvents;
  }
}
