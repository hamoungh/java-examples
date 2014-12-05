package school;

public class Department {
	String name;
	Faculty myFaculty;
	
	public Department(String name) {
		this.name = name;
	}
	public void 
		enterGradeForStudent(Student st,Course c,int mark){
			st.enterGrade(c,mark);
	}
	public Faculty getFaculty() {
		return myFaculty;
	}
}
