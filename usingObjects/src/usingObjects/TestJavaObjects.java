package usingObjects;

import java.util.Scanner;

public class TestJavaObjects {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=new String("hello");
		
		if (str1.equals(str2)) 
			System.out.println("Hello Mr.xxx. this is Siri!");
		else 
			System.out.println("i Dont get it");
	} // main 
} //class
		
		

	


