package testForLoops;

public class NestedForLoop {
	// print a 5 by 5 square of stars 
	// lets print one line  of stars with 5 numbers 
	public static void main(String[] args) {
		String test="test"; 
		for(int j=1; j<=5; j++){
			for(int i=1; i<=j; i++){
				System.out.print(" ");
			}
			System.out.println("*\n");
		}
		
	}

}
