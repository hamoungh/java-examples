package testWhileLoops;

import java.util.Scanner;
// write a while from scratch  
// that calculates 3*3*........3 ---> 19 times  (3^19) 
// ?? 1162261467
public class SummationWithWhile {

	public static void main(String[] args) {
		// read integer N from input  
		//print sum of  numbers from 1 to N
		// example input/output: 
		// input--> 4
		// calculates 1+2+3+4--> output 10
		Scanner scan=new Scanner(System.in); 
		int N=scan.nextInt(); 
		int sum=0; 
		int counter=1;
		while(counter<=N)
		{
			// calculate the running sum  and store it in sum 
			sum = sum+counter; 
			System.out.println(sum);
			counter=counter+1; 
		}
		System.out.print(sum);
		
	}

}
