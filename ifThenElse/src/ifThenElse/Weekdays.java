package ifThenElse;

import java.util.Scanner;

public class Weekdays {
	// read a number from input (number is 1..7)
	// output "weekend" or "weekday"
	// number is 1..5 it is a weekday
	//  number is 6 or 7 it is a weekend
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int dayNum=scan.nextInt();
			// if daynum is between 1 and 5 
			if (dayNum>=1 && dayNum<=5 ){
			    System.out.println("this is a weekday");
				if (dayNum==5){
					System.out.println("and today we have java class"); 
				}
			}
			else if (dayNum>=6 && dayNum<=7){
				System.out.println("this is a weekend");
			}
			else if (dayNum>7){
				System.out.println("please enter something between 1 and 7");
			}

	}

}
