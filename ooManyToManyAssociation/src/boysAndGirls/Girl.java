package boysAndGirls;

public class Girl {
	String name; 
	public Boy[] boyfriends;
	public Girl(String name){
		this.name=name; 
		boyfriends=new Boy[10]; 
	}
	public String toString(){
		return name; 
	}
	
	
}
