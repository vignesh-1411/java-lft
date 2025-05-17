package basics;
class Student {
    String name;
    int rollno;
    int[] arr;

    // Correct constructor with parameters for name, rollno, and marks array
    Student(String n, int r, int[] a) {
        name = n;
        rollno = r;
        arr = a;
    }

    // Method to calculate the total of the marks
    int markstotal() {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}


public class constructor {
	public static void main(String[] args) {
        // Array of marks
        int[] marks = {90, 89, 90};

        // Creating a student object with name, rollno, and marks array
        Student one = new Student("Vignesh", 341, marks);

        // Calling the markstotal() method to calculate total marks
        int totalMarks = one.markstotal();

        // Displaying the total marks
        System.out.println("Total marks for " + one.name + " (Roll no: " + one.rollno + ") is: " + totalMarks);
    }

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


