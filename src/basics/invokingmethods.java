package basics;

/*class box {
	int length,breadth,height;
										//invoking basics..
	int volume() {
		return length*breadth*height;
	}
}
*/

// invoking problem					//condtructor

class studentmark{
	String name;
	int rollno;
	int arr[];
	
	studentmark(String n, int r, int a[]) {
		name=n;
		rollno=r;
		arr=a;
		
	}
	
	int markstotal() {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}
}
public class invokingmethods {

	public static void main(String[] args) {
		/*box woodbox=new box();
		woodbox.length=10;
		woodbox.breadth=20;
		woodbox.height=30;
		int ans=woodbox.volume();
		System.out.print(ans);
		// TODO Auto-generated method stub
		*/
		
		// problem in invoking
		int[] marks= {90,90,90};
		studentmark one = new studentmark("Vignesh", 341, marks);
		//student one=new student();
		//one.name="vignesh";
		//one.rollno=341;
		System.out.println("name: "+one.name+"rollno: "+one.rollno);
		System.out.println("total mark is: "+one.markstotal());
		
		
		

	}

}
