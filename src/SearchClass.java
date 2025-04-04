package src;

import java.util.Scanner;

public class SearchClass implements Searchable{
  private EventRepository repository;
  private String eventName;
  
  public SearchClass(EventRepository repository){
    this.repository = repository;
  }

  public Event[] search(String keyword){
    keyword = keyword.toLowerCase();
    Event[] eventArray = repository.getAll(); //Obtaining array of current events
    boolean[] keywordMatch = new boolean[eventArray.length];
    String titleSegment;
    int count = 0;

    for(int i = 0; i < eventArray.length; i++){
      eventName = eventArray[i].getName();
      Scanner titleSegmentScanner = new Scanner(eventName);
      while(titleSegmentScanner.hasNext()){
        titleSegment = titleSegmentScanner.next();
        titleSegment = titleSegment.toLowerCase();
        if(titleSegment.equals(keyword) || titleSegment.contains(keyword)){
          keywordMatch[i] = true;
          count++;
          break;
        }
        else{
          keywordMatch[i] = false;
        }
      }
      titleSegmentScanner.close();
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
