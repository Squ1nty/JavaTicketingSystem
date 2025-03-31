package src;

public class Event{
    // necessary ingredient 
		private String name;
		private double price;
		private int seatsAvailable;
		private boolean onlineAvailability;

	public String setName(String name){
		return this.name = name;
	}
	public String getName(){
		return name;
	}

	public double setPrice(double price){
		return this.price = price;
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

	public boolean setOnlineOrNot(boolean onlineAvailability){
		return this.onlineAvailability = onlineAvailability;
	}
	public boolean onlineOrNot(){
		return onlineAvailability;
	}
}
