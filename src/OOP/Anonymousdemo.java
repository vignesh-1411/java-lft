package OOP;

class cycle{
	void display() {
		System.out.println("i am a cycle");
		
	}
}

public class Anonymousdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cycle c1= new cycle();
		c1.display();
		
		cycle c2 = new cycle()
				{
			void display() {
				System.out.println("tricycle");
			}
				};
				
		
				
		c2.display();
				

	}

}
