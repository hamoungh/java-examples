package testOO;

public class Flight {
	//  class_name field_name;
	String source; 
	int arrivalTime;
	int numberOfPassengers;
	public Flight(String source,
			int numberOfPassengers,
			int arrivalTime){
		this.source=source;
		this.numberOfPassengers=numberOfPassengers;
		this.arrivalTime=arrivalTime;
	}
	
	public int getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(int arrivalTime) {
		if(arrivalTime>=1  
				&& arrivalTime<=24){
			this.arrivalTime = arrivalTime;
		}
	}
	
	public int getNumberOfPassengers(){
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int i){
		numberOfPassengers = i; 
	}
	
	public void printTimeOfArrivalFromNow(int currentTime){
		System.out.println("the flight is going to land in "+
						(arrivalTime-currentTime)+
						" hours");
	}
	
	public int getTimeOfArrivalFromNow(int currentTime){
			return (arrivalTime-currentTime);
	}
		
	
	
	
	
}






