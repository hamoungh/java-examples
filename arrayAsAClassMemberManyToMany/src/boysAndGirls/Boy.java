package boysAndGirls;

public class Boy {
	String name; 
	public Girl[] girlfriends;
	public Boy(String name){
		this.name=name; 
		girlfriends = new Girl[10];
	}
	public String toString(){
		return name; 
	}
}
