package OOP;

abstract class shapeabstract {
	abstract void area(double a);
	
	

}
class square extends shapeabstract{
	void area(double a) {
		System.out.println(a*a);
		
	}
}
class triangle extends shapeabstract{
	void area(double a) {
		System.out.println(2*a);
	}
}

public class abstractdemo {
	public static void main(String args[]) {
		square s1=new square();
		s1.area(3);
		triangle t1=new triangle();
		t1.area(2);
		
		shapeabstract[] s = new shapeabstract[2];
		
		s[0]= new square();
		s[1]=new triangle();
		
		for(shapeabstract s0: s) {
			s0.area(9);
		}
		
	}

}
