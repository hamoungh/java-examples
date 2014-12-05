package testOO2;

import banking.Account; 

public class Tester {

	public static void main(String[] args) {
		/*Account account1=
				new Account(); */ 
		 
		Account account1=
				new Account(100);
		// account1 is checking 
		account1.account_type = Account.CHECKING;
		Account account2=
				Account.createAccount();
		System.out.println(Account.numberOfAccounts);

	}

}
