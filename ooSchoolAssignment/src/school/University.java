package school;

public class University {
	static int numOfFac=0; 
	public static Faculty createFaculty(String name){
		numOfFac=numOfFac+1;
		return new Faculty(name);
	}
	public static int getN(){
		return numOfFac;
	}
	
}
