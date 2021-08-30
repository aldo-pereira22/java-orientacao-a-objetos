package heranca;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(100, "Aldo", 1000.00);
		acc1.withdraw(200.0);
		System.out.println("Saldo: "+acc1.getBalance());
	
		
		Account acc2 = new SavingsAccount(100,"João",1000.00, 0.10);
		acc2.withdraw(200.00);
		System.out.println("Saldo da conta 2: "+acc2.getBalance());
		
		
		Account acc3 = new BusinessAccount(1003, "Bob",1000.00, 500.0);
		acc3.withdraw(200.00);
		System.out.println("Saldo da conta 3: "+acc3.getBalance());
	}
	
	
}
