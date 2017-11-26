package com.riaz.problem;

abstract public class Account {
	protected double depositMoney;
	protected double withdrawMoney;
	protected double totalMoney = 0;

	Account(double depositMoney, double withdrawMoney) {
		this.depositMoney = depositMoney;
		this.withdrawMoney = withdrawMoney;
	}

	abstract void deposit();

	abstract void withdraw();

}
