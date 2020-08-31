package org.trishinfotech.factory;

public class Main {

	public static void main(String[] args) {

		AccountFactory factory = new AccountFactory();
		Account acct1 = factory.createAccount(12345678l, "Vijay Kumar", "SAVING");
		acct1.deposit(10000.0d);

		System.out.print(acct1);
		System.out.println(" has interest : " + acct1.getInterest(5));

		Account acct2 = factory.createAccount(12345680l, "Jay Kumar", "CURRENT");
		acct2.deposit(10000.0d);

		System.out.print(acct2);
		System.out.println(" has interest : " + acct2.getInterest(5));
	}

}
