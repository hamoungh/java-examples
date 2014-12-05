package testschool;
 
import school.*;
 
public class Tester {
public static void main(String[] args){
Faculty scienceFac=University.createFaculty("Science");
Department compSciDept= scienceFac.openNewDepartment("Computer Science");
Department physicsDept= scienceFac.openNewDepartment("Physics");
physicsDept.getFaculty(); //expected to return scienceFac object
System.out.print(University.numberOfFaculties());
 
Faculty engineeringFac=University.createFaculty("Engineering");
// Our engineering faculty does not have any department yet
engineeringFac.status=Faculty.closed;
 
// Let's create some courses in our department
Course c1=compSciDept.addCourse("theory of computation");
Course c2=compSciDept.addCourse("computer graphics");
 
 
// One can create a student and then add it to the department
Student st1= new Student("Alan","Turing");
compSciDept.addStudent(st1);
st1.getDepartment(); // this should return the object (referenced by) compSciDept
 
// One can create this student at the same time specify the department
Student st2=new Student("James","Hetfield", physics);
st2.getDepartment(); // same thing for the student
 
// enter marks for student one Using the method of the student class
st2.enterGrade(c1,60);
st2.enterGrade(c2,20);
double aaverage=st2.calculateAverage();
// Enter the marks for student two using a method From the department class
compSciDept.enterGradeForStudent(st1, c1, 22);
compSciDept.enterGradeForStudent(st1, c2, 21);
System.out.print(st2.calculateAverage());
if(st2.hasFailed()){
System.out.print(":(");
}
 
}
}