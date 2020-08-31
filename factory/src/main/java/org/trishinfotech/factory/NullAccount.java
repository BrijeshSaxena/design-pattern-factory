package org.trishinfotech.factory;

public class NullAccount extends Account {

	public NullAccount() {
		super(0l, "Not Available", null);
		setInterestStrategy("No Interest");
	}

	@Override
	public double getInterest(int term) {
		return 0.0d;
	}

}
