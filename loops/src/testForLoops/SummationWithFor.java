package testForLoops;

public class SummationWithFor {

	public static void main(String[] args) {
		// (initialization; condition; updating values)
		// calculate 0+2+4+....+98+100
		int sum=0;
		for(int i=0; i<=4 ; i=i+2 ){
			sum=sum+i; 
		}
		System.out.print(sum);

	}

}


