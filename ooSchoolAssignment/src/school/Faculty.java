package school;

public class Faculty {
	public static boolean CLOSED=true;
	public boolean status;
	String name;
	public Faculty(String name){
		this.name=name;
	}
	public Department  openNewDepartment(String deptName){
		Department d= new Department(deptName); 
		return d;
	}
	
	
}
