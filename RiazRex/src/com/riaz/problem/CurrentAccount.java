package com.riaz.problem;

public class CurrentAccount extends Account {
	CurrentAccount(double depositMoney, double withdrawMoney) {
		super(depositMoney, withdrawMoney);
	}

	public void deposit() {
		if (depositMoney >= 5000) {
			System.out.println("Deposit successfull");
			totalMoney = totalMoney + depositMoney;
			System.out.println("Total MOney:" + depositMoney);
		} else {
			System.out.println("deposit is not possible");
		}
	}

	public void withdraw() {
		if (withdrawMoney > totalMoney) {
			System.out.println("withdraw is not possible");
		} else {
			System.out.println("withdraw successfull");
			totalMoney = totalMoney - withdrawMoney;
			System.out.println("Now total money is:" + totalMoney);
		}
	}

}
