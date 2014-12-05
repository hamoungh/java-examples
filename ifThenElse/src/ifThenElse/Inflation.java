package ifThenElse;

import java.util.Scanner;

public class Inflation {

	public static void main(String[] args) {
	/*	Input right front pressure
		38
		Input left front pressure
		38
		Input right rear pressure
		42
		Input left rear pressure
		42*/
		Scanner scan= new Scanner(System.in);
		int front_right = scan.nextInt();
		int front_left =  scan.nextInt();
		int back_right= scan.nextInt();
		int back_left= scan.nextInt();
		if (front_right == front_left 
				&& back_right == back_left)
		{
		   System.out.print("ok ");
		}else{
			System.out.print("not ok ");
		}
	}
		
		
		

	}


