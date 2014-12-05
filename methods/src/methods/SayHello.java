package methods;

import java.util.Scanner;

public class SayHello {
	
	static int doubleIt(int i){
		return i*2; 
	}
	
	static void printDayOfAWeek(int dayNum){
		if (dayNum==1)  System.out.print("mo");
		else if (dayNum==2)  System.out.print("tu");
		else if (dayNum==3)  System.out.print("we");
		else if (dayNum==4)  System.out.print("th");
		else if (dayNum==5)  System.out.print("fr");
		else if (dayNum==6)  System.out.print("sat");
		else if (dayNum==7)  System.out.print("sun");
	}

	static void sayHello(){
		// use scanner to get the name  
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		System.out.print("hello "+name);
	}

	// write a new method getMax that returns maximum of two numbers 
	static int getMax(int i, int j){
		int max=Integer.MIN_VALUE; 
		if (i<j) max=j;
		else max=i;
		return max; 
	}

	public static void main(String[] args) {
		// max(99, 8), 20000
		// int max= getMax(getMax(99,8),20000); 
		 //int max= getMax(99,8);
		 // max= getMax(max,20000);
		 System.out.print(getMax(getMax(99,8),20000));
	}

}
