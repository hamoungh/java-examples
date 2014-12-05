

import java.util.ArrayList;

public class ArrayOfStrings {

	public static void main(String[] args) {
		// declare a dynamic array 
		// of strings  
		ArrayList<String> s; 
		s=new ArrayList<String>(); 
		s.add("canada"); s.add("ukraine"); 
		s.add("nepal"); s.add("Iran"); 
		//if (s.contains("nepal")) 
			//System.out.print("its in the array");
		System.out.println(s.indexOf("nepal")); 
		System.out.println(s.isEmpty());
		s.remove(3); 
		s.remove("ukraine"); 
		for(String ss: s)
			System.out.println(ss); 
		
		
		
		

	}

}
