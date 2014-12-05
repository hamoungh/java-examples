package ifThenElse;

import java.util.Scanner;

/*
read 3 real (double variable) values from the standard input and find 
their max using only on one nested/compound if statement and comparison operators
input: 
9
89
7

output : 89


if(x<y){ 
	if (y<z){}
}
,,,,,

if (x<y && y<z){
	
} 
*/	
public class FindingMaxOnlyOneIf {
 public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int  x=scan.nextInt(); 
		int  y=scan.nextInt(); 
		int  z=scan.nextInt(); 
		int max;
		// 2 main branches  
		if (x>y && x>z){
			max=x;
		}else{
			if (y>z)
				max=y;
			else 
				max=z; 
		}
		
		// 6 branches 
	/*	if (x<y && y<z) max=z;
		else if (x<z && z<y) max=y;
		...*/
		
		// xyz,  xzy, zxy, zyx, yzx, yxz 
		
		System.out.println("max is:"+ max);
 
 }
}
