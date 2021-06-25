package application;

import java.util.Locale;
import java.util.Scanner;
import entitie.Register;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		System.out.print("Start with opening balance?(y/n) ");
		String variable = sc.next();
		
		double balance=0;
		
		if ("y".equals(variable)) {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();		
			
		}else {
			Register rg = new Register(account,name);
		}
		
		Register rg = new Register(account,name,balance);
		
		System.out.println("\nAccount data: \n" + rg.toString());
		
		System.out.print("\nEnter a deposit value: ");
		balance = sc.nextDouble();
		rg.deposit(balance);
		System.out.print("Updated account data: \n"+ rg.toString());
		
		System.out.print("\n\nEnter a withdraw value: ");
		balance = sc.nextDouble();
		rg.withdraw(balance);
		System.out.print("Updated account data: \n"+ rg.toString());
		
		
		sc.close();
		
	}

}
