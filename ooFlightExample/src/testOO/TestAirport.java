package testOO;

public class TestAirport {

	public static void main(String[] args) {
		int currentTime=7;
		/*Flight flight1 = new Flight(); 
		flight1.source="dubai";
		flight1.setNumberOfPassengers(300);
		flight1.setArrivalTime(16);*/
		Flight flight1;
		for(int i=0; i<10; i++){
			//1 .... 21
			int n=1 + 2*i;
			flight1= new Flight("dubai",300, n);	
			// System.out.print(n);
			flight1.printTimeOfArrivalFromNow(currentTime);
		}

		/* Flight flight2 = new Flight();
		flight2.source="Amsterdam";
		flight2.arrivalTime=22; 
		
		flight2.printTimeOfArrivalFromNow(currentTime);
		
		int i=flight2.getTimeOfArrivalFromNow(currentTime);
		System.out.print(i);*/


	}

}



