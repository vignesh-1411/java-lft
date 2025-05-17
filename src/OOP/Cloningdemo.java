package OOP;

class department implements Cloneable{
	int id;
	String name;
	
	department(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("dept id: "+id);
		System.out.println("dept name: "+ name);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class student implements Cloneable{
	int id;
	String name;
	department dept;
	
	student(int i,String n,department d){
		id=i;
		name=n;
		dept=d;
	}
	void display(){
		System.out.println("Id is: " + id);
		System.out.println("Name is: " + name);
		dept.display();
	}
	protected Object clone() throws CloneNotSupportedException {
		student s = (student)super.clone();
		s.dept = (department)s.dept.clone();
		
		return s;
		
	}
	
}

public class Cloningdemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		department d1=new department(2,"ece");
		student s1=new student(1,"vairam",d1);
		student s2=(student)s1.clone();
		d1.name="aids";
		s1.display();
		s2.display();
		
		

	}

}
