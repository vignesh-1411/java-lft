package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter passenger name: ");
		passengerName= scanner.next();
		System.out.println("Enter busno: ");
		busNo=scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateinput=scanner.next();
		
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		
		//date= dateformat.parse(dateinput);
		try {
			date= dateformat.parse(dateinput);
			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
	
	public boolean isAvailable(ArrayList<Bus> buses , ArrayList<Booking> bookings) {
		int capacity=0;
		for(Bus bus:buses)
			if(bus.getbusNo()==busNo) 
				capacity=bus.getcapacity();
			
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
	}
	

}
