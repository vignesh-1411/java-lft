package OOP;
class Box{
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
	Box doubleBox(){
		Box temp = new Box(2*length,2*breadth,2*height);
		return temp;
	}
	boolean isEqual(Box b) {
		if(length==b.length && breadth == b.breadth && height == b.height)
			return true;
		
		return false;
	}
}
public class returningobj {
	public static void main(String args[]) {
		Box b1 = new Box(6,5,3);
		Box b3=b1.doubleBox();
		System.out.println(b3.length);
		
		
	}

}
