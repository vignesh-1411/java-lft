package OOP;


class outer{
	int num;
	void outerDisplay() {
		System.out.println("Outer display");
	}
	 class Inner{
		int x;
		
		void innerDisplay() {
			System.out.println("Inner display" + num);
		}
	}
}
public class Innerclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o = new outer();
		o.num = 10;
		o.outerDisplay();
		outer.Inner i = o.new Inner();
		i.innerDisplay();

	}

}
