package banking;

public class Account {
	
	public static int  CHECKING=1;
	public static int  SAVING=2;
	public static int numberOfAccounts; 
	public int account_type;
	private int balance;
	public Account(){
		numberOfAccounts++;
		balance = 0;
	}
	public Account(int ib){
		numberOfAccounts++;
		balance = ib; 
	}
	public static Account createAccount(){
		return new Account();
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}


	
	
}
