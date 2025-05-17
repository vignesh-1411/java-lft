package basics;

/*class Box{
	int length;
	int breadth;
	int height;
	
}*/

//library management

class User{
	String name;
	int id;
	int number;	
}
class books{
	String name;
	String auth;
	int copies;
}
class card{
	String libname;
	int libno;
	String userdetails;
	
}
public class democlass {

	public static void main(String[] args) {
		/*Box woodbox=new Box();
		woodbox.length=10;
		woodbox.height=90;
		
		System.out.println(woodbox.height);*/
		// TODO Auto-generated method stub
		User one= new User();
		one.name="vignesh";
		one.id=1424;
		books onee=new books();
		onee.name="mfthe3";
		onee.auth="kanye";
		card oneee=new card();
		oneee.libname="lib24";
		oneee.libno=24;
		oneee.userdetails="name,id,no";
		
		
		System.out.println(onee.name);
		System.out.println(oneee.userdetails);
		
		

	}

}
