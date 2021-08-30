package heranca;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Aldo", 0.0);
		BusinessAccount ba = new BusinessAccount(1002, "João", 0.0, 500.00);
		
//		UPCASTING
		
		Account acc1 = ba;
		Account acc2 =new BusinessAccount(1003, "Bob", 0.0, 200.00);
		
	
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
//		DOWNCASTING
		
//		BusinessAccount acc4 =  (BusinessAccount)acc2;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan");
		}
				
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
