import school.Department;
import school.Faculty;
import school.Student;
import school.University;


public class Tester2 {

	public static void main(String[] args) {
		Faculty scienceFac=
				University.createFaculty("Science");
		//Faculty scienceFac=new Faculty("Science");
		Department compSciDept=  scienceFac.openNewDepartment("Computer Science"); 
		Student st2=new Student("James","Hetfield", physicsDept);
		//Department compSciDept=  
	}

}
