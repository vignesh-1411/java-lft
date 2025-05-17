package OOP;

// Interface - it is "what to do" but not "how to do"

/*
 * wee can use lambda expression for the functional interface
 */


interface Ridable{		//single abstract method interface-SAM interface or functional interface
	
	int MAXSPEED=90;		//we can also create datatypes inside interface .but it should not be primitive. in here its always FINAL OR STATIC.
	void ride();	//abstract method 1
	default void display() {
		System.out.println("wkt,interface contains only abstract methods which we cant define it in the interface but ,we can define a method using default keyword in interface");
	}
}

class Car implements Ridable{
	public void ride() {
		System.out.println("you are riding a car");
	}
	
}
class Bike implements Ridable{
	public void ride() {
		System.out.println("you're riding a bike");
	}
}

class Mechanic{
	void check(Ridable r) {
		r.ride();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ridable r= new Car();
		
		Mechanic m1= new Mechanic();
		Car c1=new Car();
		Bike b1=new Bike();
		
		m1.check(c1);
		
		/*
		 * we know we cant instantiate the the type ridable cuz it is interface (we cant create obj for interface. like;
		 * 
		 * Ridable r = new Ridable();
		 * 
		 * but using anonymous class we can define it (i.e)
		 */
		
		Ridable r2 = new Ridable()
				{
			public void ride() {
				System.out.println("youre riding a plane");
			}
				};
				
		r2.ride();
		
		//going to do the same using lambda expression for the above
		//lambda expressions works only if it is functional interface ( with only one abstract method)
		
		Ridable r3 = () -> System.out.println("youre riding a auto");
		r3.ride();
		

	}

}
