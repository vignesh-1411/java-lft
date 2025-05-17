package OOP;

enum level{
	BEGINNER("B"),INTERMIDIATE("I"),ADVANCED("A");
	private String abbr;
	level(String ab){
		abbr=ab;
	}
	String getAbbr() {
		return abbr;
	}
}

public class Enumdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		level l1 = level.ADVANCED;
		level l2= level.BEGINNER;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
		System.out.println(l1.compareTo(l2));

	}

}
