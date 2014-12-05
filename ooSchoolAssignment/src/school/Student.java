package school;

public class Student {
	String fname;
	String lname;
	Department dept;
	double sumOfMarks=0;
	int numberOfCourses=0;
	
	public Student(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Student(String fname, String lname, Department dept) {
		this.fname = fname;
		this.lname = lname;
		this.dept=dept; 
	}

	public void enterGrade(Course c, int grade) {
		sumOfMarks = sumOfMarks + grade; 
		numberOfCourses=numberOfCourses+1;
	}
	
	public double calculateAverage(){
		double avg= (sumOfMarks/numberOfCourses);
		return avg; 
	}

	public boolean hasFailed(){
		return calculateAverage()<50;
	}
	
	
}
