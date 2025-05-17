package OOP;
import java.util.*;
class Employee extends Object implements Comparable<Employee>{		//since every class in java has object as base class even if we didn't give
	//super class,base class,parent class
	private String name;
	private double salary;
	
	Employee(String n,double s){
		name =n;
		salary=s;
	}
	
	/*Employee(){
		name=" ";
		salary=0.0;
	}*/
	
	public void raisesalary(double percent){
		salary += salary*percent/100;
	}
	public double getsalary() {return salary;}
	public void setsalary(double s) {salary=s;}
	public String getname() {return name;}
	public void setname(String n) {name=n;}
	
	public boolean equals(Object obj) {		//over riding equals method in object class
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Employee e=(Employee) obj;  	//type casting
		return this.name.equals(e.name) && this.salary==e.salary;
			
	}
	
	/*here we use interface which is comparable" and it has method compareTo.
	 * we use this to understand the concept of interface (which allows multiple inheritance in java)
	 * see once how this comparable class works using class declaration.
	 */
	
	public int compareTo(Employee e) {		//used to compare objects	[ obj1.compare(obj2) ] 
		if(this.salary == e.salary)
			return 0;
		if(this.salary<e.salary)
			return -1;
		return 1;
	}
}

class Manager extends Employee{			//sub class,derived class
	double bonus;
	
	Manager(String n,double s,double b){
		super(n,s);							//if we call only super it refers constructor of super class
		bonus=b;
	}
	public void setbonus(double b) {bonus =b;}
	
	public double getsalary() {return super.getsalary()+bonus;}		//method overriding
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("ram",50000);
		//e1.raisesalary(20);
		System.out.println(e1.getsalary());
		
		//Manager m1= new Manager("hari",100000,0);
		//m1.setbonus(20000);
		
		//System.out.println(m1.getsalary());
		
		Employee e2 = new Manager("arivu",100000.0,15000);		//polymorphism
		
		//Manager m1= new Employee("vairam",100000); cant be done like this
		
		Employee e3 = new Employee("ram",50000);
		
		System.out.println(e1.equals(e3));		//trying object class output using overided method
		
		Employee[] employees = new Employee[5];
		employees[0]=new Employee("visves",50000);
		employees[1]=new Employee("vasanth",50000);
		employees[2]=new Employee("vignesh",500000);
		employees[3]=new Manager("vairam",100000,0);
		employees[4]=e2;
		
		employees[3].setsalary(75000);
		Manager m1;
		if(employees[3] instanceof Manager) {
			m1=(Manager) employees[3];
			m1.setbonus(20000);
		}
		
		
		
		for(Employee e:employees) {				//dynamic binding
			System.out.println(e.getname()+"  "+e.getsalary());
			
		}
		
		Arrays.sort(employees);
		for(Employee e:employees) {				//dynamic binding
			System.out.println(e.getname()+"  "+e.getsalary());
			
		}
	}
}

		
		
		



