package busResv;
import java.util.Scanner;
import java.util.ArrayList;


public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,45));
		
		int userOpt=1;
		Scanner scanner =new Scanner(System.in);
		
		for(Bus b:buses)
			b.displaybusinfo();
		
		while(userOpt==1) {
			System.out.println("press 1 for booking and 2 for exit");
			userOpt=scanner.nextInt();
			if(userOpt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(buses, bookings)) {
					bookings.add(booking);
					System.out.println("you're good to go");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
				
			}
		}
			
		// TODO Auto-generated method stub

	}

}
