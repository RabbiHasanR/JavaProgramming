package com.riaz.problem;

public class SaveingAccount extends Account {

	SaveingAccount(double depositMoney, double withdrawMoney) {
		super(depositMoney, withdrawMoney);
	}

	public void deposit() {
		if (depositMoney >= 1000) {
			System.out.println("Deposit successfully");
			totalMoney = totalMoney + depositMoney;
			System.out.println("Now total money is:" + totalMoney);
		} else {
			System.out.println("deposit is not possible");
		}

	}

	public void withdraw() {
		if (totalMoney > 500) {
			System.out.println("Withdraw Successfully");
			totalMoney = totalMoney - withdrawMoney;
			System.out.println("Now total money is:" + totalMoney);
		}

		else {
			System.out.println("Withdraw is not possible");
		}
	}

	public void intarest() {
		double intarest = (totalMoney * 5) / 100;
		System.out.println("Total intarest is:" + intarest + "$");
	}

}
