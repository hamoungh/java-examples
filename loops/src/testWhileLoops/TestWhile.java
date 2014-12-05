package testWhileLoops;

public class TestWhile {
	// write a program to print: 
	//  (((((((((((1+1+1+1+1+1+))))))))))) 
	public static void main(String[] args) {
		int counter=1;
		while(counter<=10)
		{
			System.out.print("(");
			counter=counter+1; 
		}
		
		counter=1;
		while(counter<=10)
		{
			System.out.print("1+");
			counter=counter+1; 
		}
		System.out.print("1");
		counter=1;
		while(counter<=10)
		{
			System.out.print(")");
			counter=counter+1; 
		}
		
	}

}
