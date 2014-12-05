package testForLoops;

import java.util.Scanner;

public class AverageUsingForLoop {

	// read a int N from the input
	// read N numbers from the input 
	// calculate their average 
	// use a for loop
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt(); 
		double average=0;
		double sum=0;
		for(int i=1; i<=n; i++){
			int num=scan.nextInt();
			sum = sum + num; 
		}
		average=sum/n; 
		System.out.println("here is the average:"
				+average);
		scan.close();
	}

}
