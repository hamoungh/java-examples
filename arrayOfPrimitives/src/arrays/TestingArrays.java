package arrays;

public class TestingArrays {

	public static void main(String[] args) {
		int[] grade = new int[100];	 

		// intialize:  
		for(int i=0; i<100; i++)
			// content of i'th element is i+1
			grade[i]=i + 1;
		
		// using the array
		for(int i=0; i<100; i++)
			System.out.print( grade[i]+" ");
	}

}
