package org.trishinfotech.factory;

public class SavingAccount extends Account {

	public SavingAccount(long accountNo, String accountHolderName) {
		super(accountNo, accountHolderName, AccountType.SAVING);
		setInterestStrategy("Compound Interest");
	}

	@Override
	public double getInterest(int term) {
		if (this.getAccountType() != null) {
			return this.getAmount() * Math.pow(1.0 + this.getAccountType().getRate() / 100.0, term) - this.getAmount();
		}
		return 0.0d;
	}

}
