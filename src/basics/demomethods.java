package basics;



public class demomethods {
	
	static int boxvolume(int length, int breadth, int height){
		int vol=length*breadth*height;
		return vol;
	}
	
	static void printline() {
		System.out.println("--------------");
	}

	public static void main(String[] args) {
		System.out.println("hello");
		printline();
		int volume=boxvolume(10,9,1);
		System.out.println(volume);
		
		
		// TODO Auto-generated method stub

	}

}
