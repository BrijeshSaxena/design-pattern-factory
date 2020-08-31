package org.trishinfotech.factory;

public class AccountFactory {

	public Account createAccount(long accountNo, String accountHolderName, String accountType) {
		Account account = null;
		AccountType type = AccountType.valueOf(accountType);
		if (type != null) {
			switch (type) {
			case SAVING:
				account = new SavingAccount(accountNo, accountHolderName);
				break;
			case CURRENT:
				account = new CurrentAccount(accountNo, accountHolderName);
				break;
			default:
				System.err.println("Unknown/unsupported account-type.");
			}
		}
		return account;
	}
}
