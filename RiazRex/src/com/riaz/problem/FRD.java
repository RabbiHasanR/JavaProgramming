package com.riaz.problem;

public class FRD extends Account {
	int year;

	FRD(double depositMoney, double withdrawMoney, int year) {
		super(depositMoney, withdrawMoney);
		this.year = year;
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
		if (year >= 5 && withdrawMoney <= totalMoney) {
			totalMoney = totalMoney - withdrawMoney;
			System.out.println("Now total money is:" + totalMoney);
		} else {
			System.out.println("withdraw is not possible");
		}
	}

	public void intarest() {
		double intarest = (totalMoney * 10) / 100;
		System.out.println("Total intarest is:" + intarest + "$");
	}

}
