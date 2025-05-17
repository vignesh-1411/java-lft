package OOP;
/*class Box{
	int length;
	int breadth;
	int height;
	
	Box(int l,int b, int h){ //constructor
		length = l;
		breadth = b;
		height = h;
		
	}
	
	Box(Box b){ //copy constructor
		length = b.length;
		breadth = b.breadth;
		height = b.height;
		
	}
	void setDim(int l,int b, int h){ 
		length = l;
		breadth = b;
		height = h;
	}
	boolean isEqual(Box b) {
		if(length==b.length && breadth == b.breadth && height == b.height)
			return true;
		
		return false;
	}
}*/
public class objectsdemo {
	public static void main(String args[]) {
		Box blackbox= new Box(6,4,3);
		//blackbox.setDim(6,4,3);
		Box b1 = new Box(6,5,3);
		System.out.println(blackbox.isEqual(b1));
		
	}
	
	

}
