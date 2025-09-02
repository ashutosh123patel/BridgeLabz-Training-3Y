public class MovieTicket {
	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;
	
	MovieTicket(String movieName){
		this.movieName=movieName;
		this.seatNumber = "Null";
		this.price = 0.0 ;
		this.isBooked = false;
	}
	
	public void bookTicket(String seatNumber,double price) {
		
		if(isBooked) {
			System.err.println("House full!!! sorry..... Ticket already booked");
		}
		
		else {
			this.seatNumber = seatNumber;
			this.price = price;
			this.isBooked= true;
			System.out.println("Ticket booked for movie: " + this.movieName);
           System.out.println("Seat Number: " + this.seatNumber);
           System.out.println("Price: $" + this.price);
		}
	}
	
	public void displayTicket() {
		
		if(this.isBooked) {
			System.out.println("Ticket booked for movie: " + this.movieName);
           System.out.println("Seat Number: " + this.seatNumber);
           System.out.println("Price: $" + this.price);	
		}
		
		else {
			System.out.println("Ticket have not booked yet....");
		}
	}
	
	public static void main(String[] args)
	{
		
		MovieTicket ticket1=new MovieTicket("Dragon");
		
		
		ticket1.displayTicket();
		ticket1.bookTicket("A10",120.0);
		ticket1.bookTicket("B10", 120.0);
		ticket1.bookTicket("A11", 120.0);
		ticket1.displayTicket();
	}
}

