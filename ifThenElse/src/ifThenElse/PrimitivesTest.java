package ifThenElse;
//alt+shift+x and then press j
import java.util.Scanner;
// run this with 9 and 10 
public class PrimitivesTest {
	// input 10-->line 17 output: 
	// input 9 -->line 17 output: 
	public static void main ( String[] args )
	  {
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();  
		int j=scan.nextInt();  
		int biggerNum=j; 
		if (i>j) biggerNum=i;

		
		System.out.println(biggerNum);
		
		//program example:
		//i=2 j=3 -->biggerNum=3; 
		// in math we write biggerNum=max{i,j}
		
		/*if(i>j)
			System.out.println(i+" was greater than "+ j);
		else if(i<j)
			System.out.println(i+" was less than "+ j);
		else //if i==j 
			System.out.println(i+" was equal to "+ j);
			*/
		if(i==j){
			System.out.println(i+" was equal to "+ j);
		}else{
			// two cases (nested if)
			if(i>j){
				System.out.println(i+" was greater than "+ j);
			}else{
				System.out.println(i+" was less than "+ j);
			}
		}
		

		scan.close();
	  }
}

