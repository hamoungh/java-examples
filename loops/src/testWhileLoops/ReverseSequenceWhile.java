package testWhileLoops;
public class ReverseSequenceWhile {
	// 9,7,..,4,2
	public static void main(String[] args) {
		int i=10;
		while(i!=0){
			System.out.print(i);
			// if (i!=1) 
			System.out.print(",");
			i=i-2;
			
		}
		System.out.println();
	}
}
