package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
		
	}
	public void displaybusinfo() {
		System.out.println("busno: "+ busNo+"\n"+"ac:"+ ac+"\n"+"capacity"+capacity);
		
	}
	public int getbusNo() {
		return busNo;
		
	}
	public boolean isAc() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
	}
	public void setAc(boolean val) { //mutators
		ac = val;
	}
	
	public void setCapacity(int cap) { //mutator
		capacity = cap;
	}

}
