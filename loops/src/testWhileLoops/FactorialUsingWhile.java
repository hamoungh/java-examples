package testWhileLoops;

public class FactorialUsingWhile {
	// 9! = 9*8*...*1
	// answer: 362880
	public static void main(String[] args) {
		int fact=9;
		int count=fact-1;
		while(count>0){
			fact=fact*count; 
			count--;
		}
		System.out.print(fact);
	}

}
