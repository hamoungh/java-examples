
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// declare an array of integers
		//int[] i; 
		ArrayList<Integer> j; 

		// instantiation for 10 integers 
		//i= new int[10]; 
		j=new ArrayList<Integer>();
		
		// insert some elements 
		//i[0]=4; i[1]=1000; 
		j.add(4); j.add(1000); 
		j.add(1, 500);
		
		// calculate the length of the array
		//System.out.println(i.length);
		System.out.println(j.size()); 
		
		// iterate through the elements 
		//for(int t=0; t<i.length; t++)
			//System.out.print(i[t]+",");
		
		for(int t=0; t<j.size(); t++)
			System.out.print(j.get(t)+","); 
		System.out.println();
		for(Integer thisInt : j)
			System.out.print(thisInt+",");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}







