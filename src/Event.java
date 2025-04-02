package src;

public class Event{
    // necessary ingredient 
		private String name;
		private double price;
		private int seatsAvailable;
		private boolean onlineAvailability;

		private static int eventCount = 0;

	public Event(String name, double price, int seatsAvailable, boolean onlineAvailability){
		this.name = name;
		this.price = price;
		this.seatsAvailable = seatsAvailable;
		this.onlineAvailability = onlineAvailability;
		
		eventCount++;
	}

	public static int getEventCount(){
		return eventCount;
	}

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}

	public int setSeats(int seatsAvailable){
		return this.seatsAvailable = seatsAvailable;
	}
	public int getSeats(){
		return seatsAvailable;
	}

	public boolean onlineOrNot(){
		return onlineAvailability;
	}
}
